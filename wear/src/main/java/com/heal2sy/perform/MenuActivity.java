package com.heal2sy.perform;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                stub.findViewById(R.id.explain).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MenuActivity.this, "Fonctionnalité en cours de dev", Toast.LENGTH_SHORT).show();
                    }
                });
                stub.findViewById(R.id.relax).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MenuActivity.this, "Fonctionnalité en cours de dev", Toast.LENGTH_SHORT).show();
                    }
                });
                stub.findViewById(R.id.excercies).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MenuActivity.this, "Fonctionnalité en cours de dev", Toast.LENGTH_SHORT).show();

                    }
                });
                stub.findViewById(R.id.metro).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MenuActivity.this, "Fonctionnalité en cours de dev", Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });
    }
}
