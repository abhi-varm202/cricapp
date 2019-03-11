package com.example.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView res,sing,dou,bou,si,wi,nball;
    private Button ones,twos,fours,sixes,wides,nbs,reset;
    private int result=0,singles=0,doubles=0,bound=0,six=0,wide=0,nb=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res=findViewById(R.id.result);
        sing=findViewById(R.id.singles);
        dou=findViewById(R.id.doubles);
        bou=findViewById(R.id.bound);
        si=findViewById(R.id.six);
        wi=findViewById(R.id.wide);
        nball=findViewById(R.id.nb);


        ones=findViewById(R.id.ones);
        twos=findViewById(R.id.twos);
        fours=findViewById(R.id.fours);
        sixes=findViewById(R.id.sixes);
        wides=findViewById(R.id.wides);
        nbs=findViewById(R.id.nbs);
        reset=findViewById(R.id.reset);

        ones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result+=1;
                res.setText(result+"");
                ++singles;
                sing.setText(singles+"");

            }
        });

        twos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result+=2;
                res.setText(result+"");
                ++doubles;
                dou.setText(doubles+"");

            }
        });

        fours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result+=4;
                res.setText(result+"");
                ++bound;
                bou.setText(bound+"");

            }
        });

        sixes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result+=6;
                res.setText(result+"");
                ++six;
                si.setText(six+"");

            }
        });

        wides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result+=1;
                res.setText(result+"");
                ++wide;
                wi.setText(wide+"");

            }
        });

        nbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result+=1;
                res.setText(result+"");
                ++nb;
                nball.setText(nb+"");

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result=0;singles=0;doubles=0;bound=0;six=0;wide=0;nb=0;
                res.setText("");
                nball.setText("");
                wi.setText("");
                si.setText("");
                bou.setText("");
                dou.setText("");
                sing.setText("");
            }
        });
    }
}
