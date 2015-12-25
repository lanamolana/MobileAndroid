package com.example.mobileandroid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mSave = (ImageButton)findViewById(R.id.arti_button);
        mSave.setOnClickListener(new View.OnClickListener() {
            
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Arti.class));
            }
        });
        
        mRead = (ImageButton)findViewById(R.id.about_button);
        mRead.setOnClickListener(new View.OnClickListener() {
            
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, About.class));
            }
        });
        
        mWrite = (ImageButton)findViewById(R.id.daftar_button);
        mWrite.setOnClickListener(new View.OnClickListener() {
            
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Android.class));
            }
        });
        
        ImageButton btn_exit = (ImageButton) findViewById(R.id.exit_button);
        btn_exit.setOnClickListener(new View.OnClickListener() {
   
		   @Override
		   
		   public void onClick(View view) {
		   
		    close();
		   
		   
		   }
		   });
    }
    
    private ImageButton mSave;
    private ImageButton mRead;
    private ImageButton mWrite;
    
   

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void close(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Anda Benar-Benar ingin keluar?")
        .setCancelable(false)
        .setPositiveButton("Ya",
        new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog,
        int id) {
        	MainActivity.this.finish();
        }
        })
        .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog,
        int id) {
        dialog.cancel();

        }
        }).show();
        } 
       
       
       public boolean onKeyDown(int keyCode, KeyEvent event) {
           if (keyCode == KeyEvent.KEYCODE_BACK) {
            close();
         
           }   
           return super.onKeyDown(keyCode, event);
        }
        }
