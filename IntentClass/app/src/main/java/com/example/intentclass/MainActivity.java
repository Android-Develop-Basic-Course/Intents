package com.example.intentclass;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mainShareTextFromInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainShareTextFromInput = findViewById(R.id.mainInput);
    }

    public void shareText(View view) {
        String txtToShare = mainShareTextFromInput.getText().toString();
        Intent intent = new Intent(this, TargetActivity.class);
        intent.setData(Uri.parse(txtToShare));
        startActivity(intent);
    }
}