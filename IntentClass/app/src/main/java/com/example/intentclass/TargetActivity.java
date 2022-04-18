package com.example.intentclass;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        textView = findViewById(R.id.targetText);

        Intent intent = getIntent();
        Uri uri = intent.getData();
        if (uri != null){
            String uri_string = uri.toString();
            textView.setText(uri_string);
        }
    }
}