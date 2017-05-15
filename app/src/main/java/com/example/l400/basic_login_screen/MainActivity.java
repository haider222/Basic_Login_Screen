package com.example.l400.basic_login_screen;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText username, password;
    Button bu;
    int attempts = 3;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        username = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
        bu = (Button)findViewById(R.id.button);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {

                    Toast.makeText(MainActivity.this, "both are right", Toast.LENGTH_SHORT).show();
                }
                else {

                    Toast.makeText(MainActivity.this, "WRONG CREDIENTIAL", Toast.LENGTH_SHORT).show();
                    attempts--;
                    textView.setBackgroundColor(Color.RED);
                    textView.setText(Integer.toString(attempts));
                    if(attempts == 0)
                    {
                        bu.setEnabled(false);
                    }
                }
            }
        });
    }

    public void login(View view) {
//        if (username.getText().toString() == "admin" && password.getText().toString() == "admin") {
//
//            Toast.makeText(MainActivity.this, "both are right", Toast.LENGTH_SHORT).show();
//        } else {
//            int attempts = 3;
//            Toast.makeText(MainActivity.this, "WRONG CREDIENTIAL", Toast.LENGTH_SHORT).show();
//            attempts--;
//            textView.setBackgroundColor(Color.RED);
//            textView.setText(Integer.toString(attempts));
//            if(attempts == 0)
//            {
//                bu.setEnabled(false);
//            }
//        }
    }

}
