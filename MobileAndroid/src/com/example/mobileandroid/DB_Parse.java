package com.example.mobileandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

public class DB_Parse extends Activity {
	ImageView Im;
	TextView tv_nama, tv_versi, tv_api,tv_fitur,tv_tgl, id;
	Gallery gallery;
	ImageSwitcher imageSwitcher;
	Integer[] imageIDs = new Integer[3];
	int msg_im;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.android);

		Intent iIdentifikasi = getIntent();
		msg_im = iIdentifikasi.getIntExtra("dataIM", 0);
		String msg_nama = iIdentifikasi.getStringExtra("dataNama");
		String msg_versi = iIdentifikasi.getStringExtra("dataVersi");
		String msg_api = iIdentifikasi.getStringExtra("dataApi");
		String msg_fitur = iIdentifikasi.getStringExtra("dataFitur");
		String msg_tgl = iIdentifikasi.getStringExtra("dataTgl");
		Im = (ImageView) findViewById(R.id.iv_detail);
		tv_nama = (TextView) findViewById(R.id.tvNama);
		tv_versi = (TextView) findViewById(R.id.tvVersi);
		tv_api = (TextView) findViewById(R.id.tvApi);
		tv_fitur = (TextView) findViewById(R.id.tvFitur);
		tv_tgl = (TextView) findViewById(R.id.tvTgl);
		Im.setImageResource(msg_im);
		tv_nama.setText(msg_nama);
		tv_versi.setText(msg_versi);
		tv_api.setText(msg_api);
		tv_fitur.setText(msg_fitur);
		tv_tgl.setText(msg_tgl);
	}
}

