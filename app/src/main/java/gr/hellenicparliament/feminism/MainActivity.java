package gr.hellenicparliament.feminism;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CardView b1 = (CardView) findViewById(R.id.c1);
        if (b1 != null) {
            b1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, Video.class);
                    String strName = Environment.getExternalStorageDirectory() + "/ena.mp4";
                    i.putExtra("videoId", strName);
                    startActivity(i);
                }
            });
        }

        CardView b2 = (CardView) findViewById(R.id.c2);
        if (b2 != null) {
            b2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, Video.class);
                    String strName = Environment.getExternalStorageDirectory() + "/dio.mp4";
                    i.putExtra("videoId", strName);
                    startActivity(i);
                }
            });
        }
        CardView b3 = (CardView) findViewById(R.id.c3);
        if (b3 != null) {
            b3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, Video.class);
                    String strName = Environment.getExternalStorageDirectory() + "/tria.mp4";
                    i.putExtra("videoId", strName);
                    startActivity(i);
                }
            });
        }
        CardView b4 = (CardView) findViewById(R.id.c4);
        if (b4 != null) {
            b4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, Video.class);
                    String strName = Environment.getExternalStorageDirectory() + "/tessera.mp4";
                    i.putExtra("videoId", strName);
                    startActivity(i);
                }
            });
        }
        CardView b5 = (CardView) findViewById(R.id.c5);
        if (b5 != null) {
            b5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, Video.class);
                    String strName = Environment.getExternalStorageDirectory() + "/pente.mp4";
                    i.putExtra("videoId", strName);
                    startActivity(i);
                }
            });
        }
        CardView b6 = (CardView) findViewById(R.id.c6);
        if (b6 != null) {
            b6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, Video.class);
                    String strName = Environment.getExternalStorageDirectory() + "/eksi.mp4";
                    i.putExtra("videoId", strName);
                    startActivity(i);
                }
            });
        }
        CardView b7 = (CardView) findViewById(R.id.c7);
        if (b7 != null) {
            b7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, Video.class);
                    String strName = Environment.getExternalStorageDirectory() + "/epta.mp4";
                    i.putExtra("videoId", strName);
                    startActivity(i);
                }
            });
        }
        CardView b8 = (CardView) findViewById(R.id.c8);
        if (b8 != null) {
            b8.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, Video.class);
                    String strName = Environment.getExternalStorageDirectory() + "/okto.mp4";
                    i.putExtra("videoId", strName);
                    startActivity(i);
                }
            });
        }
        CardView b9 = (CardView) findViewById(R.id.c9);
        if (b9 != null) {
            b9.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, Video.class);
                    String strName = Environment.getExternalStorageDirectory() + "/ennea.mp4";
                    i.putExtra("videoId", strName);
                    startActivity(i);
                }
            });
        }
        CardView b10 = (CardView) findViewById(R.id.c10);
        if (b10 != null) {
            b10.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, Video.class);
                    String strName = Environment.getExternalStorageDirectory() + "/deka.mp4";
                    i.putExtra("videoId", strName);
                    startActivity(i);
                }
            });
        }
    }
}
