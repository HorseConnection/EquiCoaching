package com.horse_connection.coaching.equicoaching;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.horse_connection.coaching.equifouleeslibrary.MainActivity;

import java.util.List;

public class EquiCoachingMain extends AppCompatActivity {

    private Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ctx = getApplicationContext();

        setContentView(R.layout.activity_equi_coaching_main);
        //setTitle(R.string.app_name_EC);

        ImageButton btnEquiFoulees = (ImageButton) findViewById(R.id.btnEquiFoulees);
        btnEquiFoulees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PackageManager pm;
                pm = getPackageManager();

                List<ApplicationInfo> packages = pm.getInstalledApplications(0);

                /*
                Intent launchIntent = ctx.getPackageManager().getLaunchIntentForPackage("com.horse_connection.coaching.equifoulees");

                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(ctx, "Package not found", Toast.LENGTH_SHORT).show();
                }
                */
                Intent myIntent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);

            }
        });
    }
}
