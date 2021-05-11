package id.ac.umn.week12_28280;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnDeteksi, btnBaca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDeteksi = findViewById(R.id.btnDeteksi);
        btnDeteksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSatu = new Intent(MainActivity.this, DeteksiSensorActivity.class);
                startActivity(intentSatu);
            }
        });

        btnBaca = findViewById(R.id.btnBaca);
        btnBaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDua = new Intent(MainActivity.this, BacaSensorActivity.class);
                startActivity(intentDua);
            }
        });
    }
}