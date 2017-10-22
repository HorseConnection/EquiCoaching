package com.horse_connection.coaching.equicoaching;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class EquiCoachingMain extends AppCompatActivity {

    private Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ctx = getApplicationContext();

        setContentView(R.layout.activity_equi_coaching_main);

        ImageButton btnEquiFoulees = (ImageButton) findViewById(R.id.btnEquiFoulees);
        btnEquiFoulees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                Intent myIntent = null;
                try {
                    myIntent = new Intent(ctx,Class.forName("com.horse_connection.coaching.equifoulees"));
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                startActivity(myIntent );
                */
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.horse_connection.coaching.equifoulees");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }
            }
        });
    }
}
