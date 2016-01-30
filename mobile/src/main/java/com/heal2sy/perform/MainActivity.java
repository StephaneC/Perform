package com.heal2sy.perform;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.explain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Fonctionnalité en cours de dev", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.relax).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Fonctionnalité en cours de dev", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.excercies).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Fonctionnalité en cours de dev", Toast.LENGTH_SHORT).show();

            }
        });
        findViewById(R.id.metro).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Fonctionnalité en cours de dev", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
