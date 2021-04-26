package id.ac.umn.week10_28280;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.ac.umn.week10_28280.async_task.AsyncTaskActivity;
import id.ac.umn.week10_28280.async_task_loader.AsyncTaskLoaderActivity;
import id.ac.umn.week10_28280.intent_service.SimpleIntentServiceActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAsyncTask = findViewById(R.id.btnAsyncTask);
        btnAsyncTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAsyncTask = new Intent(MainActivity.this, AsyncTaskActivity.class);
                startActivity(intentAsyncTask);
            }
        });

        Button btnAsyncTaskLoader = findViewById(R.id.btnAsyncTaskLoader);
        btnAsyncTaskLoader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAsyncTaskLoader = new Intent(MainActivity.this, AsyncTaskLoaderActivity.class);
                startActivity(intentAsyncTaskLoader);
            }
        });

        Button btnSimpleIntentService = findViewById(R.id.btnSimpleIntentService);
        btnSimpleIntentService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSimpleIntentService = new Intent(MainActivity.this, SimpleIntentServiceActivity.class);
                startActivity(intentSimpleIntentService);
            }
        });
    }
}