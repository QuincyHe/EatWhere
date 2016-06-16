package com.app.redface.eatwhere;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class EatWhereMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_where_main);

        FragmentTabHost tabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);// Use android.R.id.tabhost for it...
        tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        // Add a Tab Page (A Fragment object)
        tabHost.addTab(tabHost.newTabSpec("tabtest").setIndicator("测试页"), TabPageTestFragment.class, null);
    }
}
