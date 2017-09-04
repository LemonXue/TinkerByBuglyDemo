package com.xuewenhui.tinkerbybuglydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_create).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "oooo";
                s = s.substring(0, 1);
                Toast.makeText(MainActivity.this, "已修复！s:" + s, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
