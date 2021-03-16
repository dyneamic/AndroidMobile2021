package id.ac.umn.week06_28280;
import id.ac.umn.week06_28280.PackageAnimDrawable.AnimasiDrawable;
import id.ac.umn.week06_28280.PackageAnimFisika.AnimasiFisika;
import id.ac.umn.week06_28280.PackageAnimProperty.AnimasiProperty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    private Button animasiProperty;
    private Button animasiDrawable;
    private Button animasiFisika;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animasiProperty = findViewById(R.id.AnimasiProperty);
        animasiProperty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimProperty = new Intent(MainActivity.this, AnimasiProperty.class);
                startActivityForResult(intentAnimProperty, 1);
            }
        });

        animasiDrawable = findViewById(R.id.AnimasiDrawable);
        animasiDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimDrawable = new Intent(MainActivity.this, AnimasiDrawable.class);
                startActivityForResult(intentAnimDrawable, 1);
            }
        });

        animasiFisika = findViewById(R.id.AnimasiFisika);
        animasiFisika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimFisika = new Intent(MainActivity.this, AnimasiFisika.class);
                startActivityForResult(intentAnimFisika, 1);
            }
        });
    }

}