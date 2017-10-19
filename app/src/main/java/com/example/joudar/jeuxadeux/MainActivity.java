package com.example.joudar.jeuxadeux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreJ1;
    int scoreJ2 ;

    Button btn1;
    Button btn2;
    Button btn_re;


    TextView textJ1;
    TextView textJ2;
    boolean jeuEncours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btn1 =(Button)findViewById(R.id.joueur1_b);
         btn2 =(Button)findViewById(R.id.joueur2_b);

         btn_re =(Button)findViewById(R.id.button3);

        textJ1 =(TextView)findViewById(R.id.textJ1_tv);

         textJ2 =(TextView)findViewById(R.id.textJ2_tv);


        reset();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jeuEncours){
                    scoreJ1++;
                    textJ1.setText("le score est: " + scoreJ1);
                    if(scoreJ1==10){

                        Toast.makeText(MainActivity.this, "joueur 1 a gagné", Toast.LENGTH_SHORT).show();
                        jeuEncours =false;
                    }
                }
            }
        });
        //boutton j2
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jeuEncours){
                    scoreJ2++;
                    textJ2.setText("le score est: " + scoreJ2);
                    if(scoreJ2==10){

                        Toast.makeText(MainActivity.this, "joueur 2 a gagné", Toast.LENGTH_SHORT).show();
                        jeuEncours =false;
                    }
                }

            }
        });
        btn_re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });


    }

    public void reset(){
        jeuEncours= true;

        scoreJ1 =0;
        scoreJ2=0;
        textJ1.setText("le score est: " + scoreJ1);
        textJ2.setText("le score est: " + scoreJ2);
        Toast.makeText(this, "allé c'est partie!!", Toast.LENGTH_SHORT).show();

    }
}
