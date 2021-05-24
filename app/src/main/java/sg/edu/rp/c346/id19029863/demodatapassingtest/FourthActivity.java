package sg.edu.rp.c346.id19029863.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView textview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        textview3 = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value", 0);
        textview3.setText("Double value received is: " + value);

    }
}