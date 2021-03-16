package id.ac.umn.week07_28280;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnKamera;
    private Button btnGaleri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKamera = findViewById(R.id.btnKamera);
        btnKamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKamera = new Intent(MainActivity.this, Kamera.class);
                startActivityForResult(intentKamera, 1);
            }
        });

        btnGaleri = findViewById(R.id.btnGaleri);
        btnGaleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGaleri = new Intent(MainActivity.this, GaleriVideo.class);
                startActivityForResult(intentGaleri, 1);
            }
        });
    }


}