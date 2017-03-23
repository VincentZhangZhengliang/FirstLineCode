package com.vincent.forceoffline;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {

    private TextInputEditText mEtName;
    private TextInputEditText mEtPsw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mEtName = (TextInputEditText) findViewById(R.id.id_name);
        mEtPsw = (TextInputEditText) findViewById(R.id.id_psw);

        Button button = (Button) findViewById(R.id.id_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mEtName.getText()
                        .toString();
                String psw = mEtPsw.getText()
                        .toString();
                if ("name".equals(name) && "psw".equals(psw)) {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                } else {
                    Toast.makeText(LoginActivity.this, "name or psw invalidated", Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });


    }
}
