package com.horse_connection.coaching.equicoaching;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.horse_connection.coaching.equifouleeslibrary.MainActivity;

public class EquiCoachingMain extends AppCompatActivity {

    private Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ctx = getApplicationContext();

        setContentView(R.layout.activity_equi_coaching_main);

        ImageView imgEquiFoulees = (ImageView) findViewById(R.id.imEquiFoulees);

        imgEquiFoulees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    /*
                    PackageManager pm;
                    pm = getPackageManager();
                    List<ApplicationInfo> packages = pm.getInstalledApplications(0);
                    */
                Intent myIntent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
                }
        });
    }
}
