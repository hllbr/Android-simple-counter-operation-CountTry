package com.hllbr.counttry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

    }
    public void start(View view){
        new CountDownTimer(10000,500){

            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText("geri sayım işlemi aktifleştirildi\n"+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(),"Islem başarı ile sonuçlandırıldı",Toast.LENGTH_LONG).show();
                textView.setText("bir adım daha ileri");
            }
        }.start();
    }

}