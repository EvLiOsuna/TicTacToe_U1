package mx.edu.ittepic.tictactoe_u1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button B1_1, B1_2, B1_3, B2_1, B2_2, B2_3, B3_1, B3_2, B3_3, Reset;
    TextView resultados;
    int turno, g1,g2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         B1_1 = (Button) findViewById(R.id.BT1_1);
         B1_2 = (Button) findViewById(R.id.BT1_2);
         B1_3 = (Button) findViewById(R.id.BT1_3);

         B2_1 = (Button) findViewById(R.id.BT2_1);
         B2_2 = (Button) findViewById(R.id.BT2_2);
         B2_3 = (Button) findViewById(R.id.BT2_3);

         B3_1 = (Button) findViewById(R.id.BT3_1);
         B3_2 = (Button) findViewById(R.id.BT3_2);
         B3_3 = (Button) findViewById(R.id.BT3_3);

        Button Reset = (Button) findViewById(R.id.reset);

        TextView resultados = (TextView) findViewById(R.id.res);

        turno = 0;

        g1 = 0;
        g2 = 0;

        B1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (turno){
                    case 0:
                        B1_1.setText("O");
                        turno = 2;
                        break;

                    case 1:
                        B1_1.setText("O");
                        g1++;
                        turno = 2;
                        break;

                    case 2:
                        B1_1.setText("X");
                        g2++;
                        break;


                }
            }
        });

        B1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (turno){
                    case 0:
                        B1_1.setText("O");
                        g1++;
                        break;

                    case 1:
                        B1_1.setText("O");
                        g1++;
                        break;

                    case 2:
                        B1_1.setText("X");
                        g2++;
                        break;


                }
            }
        });

        B1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (turno){
                    case 0:
                        B1_1.setText("O");
                        g1++;
                        break;

                    case 1:
                        B1_1.setText("O");
                        g1++;
                        break;

                    case 2:
                        B1_1.setText("X");
                        g2++;
                        break;


                }
            }
        });




        B2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (turno){
                    case 0:
                        B1_1.setText("O");
                        g1++;
                        break;

                    case 1:
                        B1_1.setText("O");
                        g1++;
                        break;

                    case 2:
                        B1_1.setText("X");
                        g2++;
                        break;


                }
            }
        });

        B2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (turno){
                    case 0:
                        B1_1.setText("O");
                        g1++;
                        break;

                    case 1:
                        B1_1.setText("O");
                        g1++;
                        break;

                    case 2:
                        B1_1.setText("X");
                        g2++;
                        break;


                }
            }
        });

        B2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (turno){
                    case 0:
                        B1_1.setText("O");
                        g1++;
                        break;

                    case 1:
                        B1_1.setText("O");
                        g1++;
                        break;

                    case 2:
                        B1_1.setText("X");
                        g2++;
                        break;


                }
            }
        });



        B3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (turno){
                    case 0:
                        B1_1.setText("O");
                        g1++;
                        break;

                    case 1:
                        B1_1.setText("O");
                        g1++;
                        break;

                    case 2:
                        B1_1.setText("X");
                        g2++;
                        break;


                }
            }
        });

        B3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (turno){
                    case 0:
                        B1_1.setText("O");
                        g1++;
                        break;

                    case 1:
                        B1_1.setText("O");
                        g1++;
                        break;

                    case 2:
                        B1_1.setText("X");
                        g2++;
                        break;


                }
            }
        });

        B3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (turno){
                    case 0:
                        B1_1.setText("O");
                        g1++;
                        break;

                    case 1:
                        B1_1.setText("O");
                        g1++;
                        break;

                    case 2:
                        B1_1.setText("X");
                        g2++;
                        break;


                }
            }
        });




    }

}
