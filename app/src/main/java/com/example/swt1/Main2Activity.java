package com.example.swt1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView myTextView = (TextView) findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        //myTextView.setText("harry");
        Toast.makeText(myTextView.getContext(), bundle.getString("name"), Toast.LENGTH_SHORT).show();

        myTextView.setText(bundle.getString("name"));

    }
}
