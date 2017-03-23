package com.vincent.firstlinecode;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.widget.Button;
import android.widget.ProgressBar;

import com.zhy.autolayout.AutoLayoutActivity;

/**
 * Created by Vincent on 2017/3/23 16:04.
 */

public class ProgressActivity extends AutoLayoutActivity {

    private Button mShow;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

    }

    private void alertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(ProgressActivity.this);
        builder.setTitle("hello");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setMessage("來自火星的問候");
        builder.setCancelable(false);
        builder.setPositiveButton("確認", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }
        );
        builder.show();
    }
}
