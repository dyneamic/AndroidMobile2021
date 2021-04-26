package id.ac.umn.week10_28280.intent_service;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CustomBoundService extends Service {
    public IBinder customBinder = new CustomLocalBinder();

    public CustomBoundService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return customBinder;
    }

    public class CustomLocalBinder extends Binder {
        CustomBoundService getService() {
            return CustomBoundService.this;
        }
    }

    public String getCurrentTime() {
        Locale locale;
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss MM/dd/yyyy", Locale.US);
        return (dateFormat.format(new Date()));
    }
}