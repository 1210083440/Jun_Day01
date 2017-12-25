package com.example.administrator.jun_day01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtn;
    private ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn){

        }
    }

    private void initView() {
        mIv = (ImageView) findViewById(R.id.iv);
        mBtn = (Button) findViewById(R.id.btn);
        mBtn.setOnClickListener(this);

    }
}
