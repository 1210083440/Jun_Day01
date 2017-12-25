package com.example.administrator.jun_day01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtn;

    private TextView mTv;
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
        mBtn = (Button) findViewById(R.id.btn);
        mBtn.setOnClickListener(this);

        initView();
    }

    private void initView() {
        mTv = (TextView) findViewById(R.id.tv);
        mIv = (ImageView) findViewById(R.id.iv);
    }
}
