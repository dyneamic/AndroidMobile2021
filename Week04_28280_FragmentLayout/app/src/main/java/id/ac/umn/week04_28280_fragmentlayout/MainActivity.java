package id.ac.umn.week04_28280_fragmentlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.main_button_change_1);
        btn2 = findViewById(R.id.main_button_change_2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSatu = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intentSatu, 1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDua = new Intent(MainActivity.this, ThirdActivity.class);
                startActivityForResult(intentDua, 1);
            }
        });
    }
}