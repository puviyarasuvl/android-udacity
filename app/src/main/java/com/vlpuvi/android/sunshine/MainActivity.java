package com.vlpuvi.android.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    String[] foreCastArray = {
            "Today - Sunny - 80/63",
            "Tomorrow - Foggy - 60/63",
            "Weds - Cloudy - 72/63",
            "Thurs - Asteriods- 75/65",
            "Fri - Heavy Rain - 65/56",
            "Sat - HELP TRAPPED IN WETHERSTATION - 60/51",
            "Sun - Sunny - 80/68"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> mForeCastAdapter = new ArrayAdapter<>(this,R.layout.list_item_forecast,foreCastArray);

        ListView listView = (ListView) findViewById(R.id.listView);
        if (listView != null) {
            listView.setAdapter(mForeCastAdapter);
        }
    }
}
