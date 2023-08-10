package com.example.conval;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.conval.databinding.ActivityDashboardBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DashboardActivity extends DrawerBaseActivity {
    //Activity binding-- "the name changes depending on the activity"
    FloatingActionButton fab;
    ActivityDashboardBinding activityDashboardBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityDashboardBinding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(activityDashboardBinding.dashboardTextView.getRootView());
        allocateActivityTitle("Dashboard");

        fab =  findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, SettingsActivity.class));
            }
        });
    }
}