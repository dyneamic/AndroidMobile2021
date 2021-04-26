package id.ac.umn.week08_28280;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.ac.umn.week08_28280.shared_pref.ActivitySharedPref;
import id.ac.umn.week08_28280.text_editor.ActivityTextEditor;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTextEditor = findViewById(R.id.btnTextEditor);
        btnTextEditor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTextEditor = new Intent(MainActivity.this, ActivityTextEditor.class);
                startActivity(intentTextEditor);
            }
        });

        Button btnSharedPreferences = findViewById(R.id.btnSharedPreference);
        btnSharedPreferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTextEditor = new Intent(MainActivity.this, ActivitySharedPref.class);
                startActivity(intentTextEditor);
            }
        });
    }
}