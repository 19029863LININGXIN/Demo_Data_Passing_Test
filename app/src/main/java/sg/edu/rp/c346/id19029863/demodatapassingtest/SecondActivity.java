package sg.edu.rp.c346.id19029863.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textview1 = findViewById(R.id.textView1);
        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value", 0);
        textview1.setText("Integer value received is: " + value);




    }
}