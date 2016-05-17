package com.app.redface.eatwhere;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class EatWhereMainActivity extends AppCompatActivity {

    // members
    private ArrayList<RestaurantInfo> restList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_where_main);

        restList = new ArrayList<RestaurantInfo>();

        // Temporary Use
        String[] restNames = {"肉夹馍", "小鸡旗", "越南粉", "小火锅", "沸腾蟹"};
        int[] costs = {3, 2, 2, 4, 4};
        for (int i = 0; i < restNames.length; i++) {
            restList.add(new RestaurantInfo(restNames[i], costs[i]));
        }

        ArrayAdapter<RestaurantInfo> simpleAdapter = new ArrayAdapter<RestaurantInfo>(this, R.layout.list_item, restList);
        ListView lv = (ListView)findViewById(R.id.listView);
        lv.setAdapter(simpleAdapter);
    }

    public void onBtnPickClicked(View v) {
        int ret = (int)(Math.random() * restList.size());
        TextView tvDisplay = (TextView)findViewById(R.id.textViewResult);
        tvDisplay.setText(restList.get(ret).toString());
    }
}
