package com.example.mobileandroid;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class Android extends Activity {
	protected ListView lv;
	protected ListAdapter adapter;
	SQLiteDatabase db;
	Cursor cursor;
	EditText et_db;

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daftar);

		db = (new DB_Android(this)).getWritableDatabase();
		lv = (ListView) findViewById(R.id.lv);
		et_db = (EditText) findViewById(R.id.et);

		try {
			cursor = db.rawQuery("SELECT * FROM androids ORDER BY nama ASC", null);
			adapter = new SimpleCursorAdapter(this, R.layout.isi_lv, cursor,
					new String[] { "nama", "versi" , "api" , "fitur" , "tgl_rilis" , "img" }, new int[] {
							R.id.tv_nama, R.id.tvVersi, R.id.tvApi,R.id.tvFitur,R.id.tvTgl, R.id.imV });
			lv.setAdapter(adapter);
			lv.setTextFilterEnabled(true);
			lv.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View v,
						int position, long id) {
					detail(position);

				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("deprecation")
	public void search_db(View v) {
		String edit_db = et_db.getText().toString();
		if (!edit_db.equals("")) {
			try {
				cursor = db.rawQuery("SELECT * FROM androids WHERE nama LIKE ?",
						new String[] { "%" + edit_db + "%" });
				adapter = new SimpleCursorAdapter(
						this,
						R.layout.isi_lv,
						cursor,
						new String[] { "nama", "versi" , "api" , "fitur" , "tgl_rilis" , "img" }, new int[] {
								R.id.tv_nama, R.id.tvVersi, R.id.tvApi,R.id.tvFitur,R.id.tvTgl, R.id.imV });
				if (adapter.getCount() == 0) {
					Toast.makeText(
							this,
							"Tidak ditemukan data dengan kata kunci " + edit_db
									+ "", Toast.LENGTH_SHORT).show();
				} else {
					lv.setAdapter(adapter);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				cursor = db.rawQuery("SELECT * FROM androids ORDER BY nama ASC",
						null);
				adapter = new SimpleCursorAdapter(
						this,
						R.layout.isi_lv,
						cursor,
						new String[] { "nama", "versi" , "api" , "fitur" , "tgl_rilis" , "img" }, new int[] {
								R.id.tv_nama, R.id.tvVersi, R.id.tvApi,R.id.tvFitur,R.id.tvTgl, R.id.imV });
				lv.setAdapter(adapter);
				lv.setTextFilterEnabled(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void detail(int position) {
		int im = 0;
		String _id = "";
		String nama = "";
		String versi = "";
		String api = "";
		String fitur = "";
		String tgl_rilis = "";
		if (cursor.moveToFirst()) {
			cursor.moveToPosition(position);
			im = cursor.getInt(cursor.getColumnIndex("img"));
			nama = cursor.getString(cursor.getColumnIndex("nama"));
			versi = cursor.getString(cursor.getColumnIndex("versi"));
			api = cursor.getString(cursor.getColumnIndex("api"));
			fitur = cursor.getString(cursor.getColumnIndex("fitur"));
			tgl_rilis = cursor.getString(cursor.getColumnIndex("tgl_rilis"));
		}

		Intent iIntent = new Intent(this, DB_Parse.class);
		iIntent.putExtra("dataIM", im);
		iIntent.putExtra("dataNama", nama);
		iIntent.putExtra("dataVersi", versi);
		iIntent.putExtra("dataApi", api);
		iIntent.putExtra("dataFitur", fitur);
		iIntent.putExtra("dataTgl", tgl_rilis);
		setResult(RESULT_OK, iIntent);
		startActivityForResult(iIntent, 99);
	}
	
}