package com.vincent.firstlinecode;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends BaseActivity {
    private static final String TAG = "FirstActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.first_layout);
        Button button = (Button) findViewById(R.id.button);

        final Intent intent = getIntent();
        String extra = intent.getStringExtra("MainActivity");
        Log.e(TAG, "onCreate: " + extra);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.removeAll();
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });

    }
}
