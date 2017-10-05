package com.popland.pop.activityslife;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn1 = (Button) findViewById(R.id.BTN1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Activity2.class);
                startActivity(i);
            }
        });
        btn2 = (Button) findViewById(R.id.BNT2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, Activity3.class);
                startActivity(in);
            }
        });
    }

    @Override
    protected void onStop() {
        Toast.makeText(this,"stop",Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onPause() {
        Toast.makeText(this,"pause",Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(this,"restart",Toast.LENGTH_LONG).show();
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this,"destroy",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        Toast.makeText(this,"start",Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onResume() {
        Toast.makeText(this, "resume", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

}