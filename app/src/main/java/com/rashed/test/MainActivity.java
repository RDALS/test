package com.rashed.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b1 = (Button)findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                TextView Byetxt =(TextView) findViewById(R.id.Byetxt);

                Byetxt.setText("ok");





            }



                              }



        );



        TextView Byetxt =(TextView) findViewById(R.id.Byetxt);




    }
}
