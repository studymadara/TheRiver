package com.example.wagh.theriver;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

/**
 * Created by wagh on 17/1/17.
 */

public class Marsh extends AppCompatActivity {


        RecyclerView rv1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       setContentView(R.layout.fmarsh);


        //now we start

        rv1=(RecyclerView)findViewById(R.id.rv1);

        RecyclerView.LayoutManager mLayoutmanager = new LinearLayoutManager(this);

        rv1.setHasFixedSize(true);

        rv1.setLayoutManager(mLayoutmanager);

        RecyclerView.Adapter madapter=new adapter_recyclersimple();

        rv1.setAdapter(madapter);

        //Snackbar stuff********************************

        LinearLayout llmarsh11;

        llmarsh11=(LinearLayout)findViewById(R.id.llmarsh);


        Snackbar snackbar=Snackbar.make(llmarsh11,"Coming soon",Snackbar.LENGTH_LONG);
        snackbar.show();


    }

    /**

    public static void main (String args[])
    {
        modulePermission mp=new modulePermission();
        mp.start();

    }

     **/
}


/**class modulePermission extends AppCompatActivity
{

    public void start()
    {
        //just planned stuff


    }


}**/