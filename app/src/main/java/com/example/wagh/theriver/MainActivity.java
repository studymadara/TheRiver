package com.example.wagh.theriver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button marsh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Only links will be created in this section and try to divide every stuff and optimize it more


        marsh=(Button)findViewById(R.id.marsh);

        marsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent imarsh=new Intent(MainActivity.this,Marsh.class);
                startActivity(imarsh);
                Toast.makeText(getApplicationContext(),"Ride 1",Toast.LENGTH_LONG).show();

            }
        });



    }
}
