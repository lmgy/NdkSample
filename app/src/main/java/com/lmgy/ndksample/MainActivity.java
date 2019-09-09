package com.lmgy.ndksample;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.d1);
        try {
            ImageUtils.compress(bitmap, Environment.getExternalStorageDirectory().getCanonicalPath()+"/1.jpg");

//            if (Build.VERSION.SDK_INT >= 23) {
//                int write = checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE);
//                int read = checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE);
//                if (write != PackageManager.PERMISSION_GRANTED || read != PackageManager.PERMISSION_GRANTED) {
//                    requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE}, 300);
//                } else {
//                    ImageUtils.compress(bitmap, Environment.getExternalStorageDirectory().getCanonicalPath()+"/1.jpg");
//                }
//            } else {
//                Log.i("wytings", "------------- Build.VERSION.SDK_INT < 23 ------------");
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
