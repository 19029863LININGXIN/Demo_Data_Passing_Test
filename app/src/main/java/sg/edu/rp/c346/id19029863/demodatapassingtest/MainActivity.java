package sg.edu.rp.c346.id19029863.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button integer, character;
    TextView textview1, textview2, textview3, passdouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        integer = findViewById(R.id.buttonPassInteger);
        textview1 = findViewById(R.id.textView1);
        integer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

        character = findViewById(R.id.buttonPassChar);
        textview2 = findViewById(R.id.textView2);
        character.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("value", 'a');
                startActivity(intent);
            }
        });

        textview3 = findViewById(R.id.textView2);
        passdouble = findViewById(R.id.passDouble);
        passdouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                intent.putExtra("value", 99.99);
                startActivity(intent);
            }
        });





    }
}