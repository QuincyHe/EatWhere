package com.app.redface.eatwhere;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EatWhereMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_where_main);
    }

    public void onBtnClicked(View v) {
        TextView textViewGaoji = (TextView)findViewById(R.id.textViewGaoji);
        textViewGaoji.setText("哈哈，搞基啊！");
    }
}
