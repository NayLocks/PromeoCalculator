package com.ribegroupe.promeocalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //************** OPERATOR *************//
    private Button multiple;
    private Button plus;
    private Button minus;
    private Button divide;

    //************** BT FUNCTION *************//
    private Button delete;
    private Button reset;
    private Button bt_result;
    private Button percent;
    private Button comma;

    //************** TXT CALCUL *************//
    private TextView calcul;
    private TextView result;
    private TextView lastCalcul;

    //************** BT *************//
    private Button bt_0;
    private Button bt_1;
    private Button bt_2;
    private Button bt_3;
    private Button bt_4;
    private Button bt_5;
    private Button bt_6;
    private Button bt_7;
    private Button bt_8;
    private Button bt_9;

    boolean isFinished = false;
    boolean clear = false;

    public void verifBoll(TextView calcul, TextView result, TextView lastCalcul){
        if(isFinished && !clear){
            isFinished = false;
            lastCalcul.setText(calcul.getText().toString() + " = " + result.getText().toString());
            calcul.setText("");
        }else if(isFinished && clear){
            isFinished = false;
            clear = false;
            if(!result.getText().toString().equals("")){
                lastCalcul.setText(calcul.getText().toString() + " = " + result.getText().toString());
            }
            calcul.setText("");
            result.setText("");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //************** OPERATOR *************//
        multiple = findViewById(R.id.multiple);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        divide = findViewById(R.id.divide);

        //************** BT FUNCTION *************//
        delete = findViewById(R.id.delete);
        reset = findViewById(R.id.reset);
        bt_result = findViewById(R.id.bt_result);
        percent = findViewById(R.id.percent);
        comma = findViewById(R.id.comma);

        //************** TXT CALCUL *************//
        calcul = findViewById(R.id.calcul);
        result = findViewById(R.id.result);
        lastCalcul = findViewById(R.id.lastCalcul);

        //************** BT *************//
        bt_0 = findViewById(R.id.bt_0);
        bt_1 = findViewById(R.id.bt_1);
        bt_2 = findViewById(R.id.bt_2);
        bt_3 = findViewById(R.id.bt_3);
        bt_4 = findViewById(R.id.bt_4);
        bt_5 = findViewById(R.id.bt_5);
        bt_6 = findViewById(R.id.bt_6);
        bt_7 = findViewById(R.id.bt_7);
        bt_8 = findViewById(R.id.bt_8);
        bt_9 = findViewById(R.id.bt_9);

        final String lastResultat = "";

        //************** OPERATOR EVENT *************//
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcul.setText(calcul.getText().toString() + " * ");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcul.setText(calcul.getText().toString() + " + ");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcul.setText(calcul.getText().toString() + " - ");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcul.setText(calcul.getText().toString() + " / ");
            }
        });

        //************** BT FUNCTION EVENT *************//
//        delete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String resultat = calcul.getText().toString();
//                int longueur = resultat.length();
//                char test = resultat.charAt(longueur);
//                result.setText(test);
//            }
//        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear = true;
                isFinished = true;
                verifBoll(calcul, result, lastCalcul);
            }
        });
        bt_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String calculEC[] = calcul.getText().toString().split(" ");
                double nb1 = Integer.parseInt(calculEC[0]);
                double nb2 = Integer.parseInt(calculEC[2]);
                String operator = calculEC[1];
                Service resultat = new Service(nb1, nb2, operator);
                result.setText(resultat.calcul());
                isFinished = true;
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nb1 = Integer.parseInt(calcul.getText().toString());
                Service resultat = new Service(nb1, 0, "%");
                result.setText(resultat.calcul());
                isFinished = true;
            }
        });
//        comma.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                calcul.setText(calcul.getText().toString() + ".");
//            }
//        });


        //************** BT EVENT *************//
        bt_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifBoll(calcul, result, lastCalcul);
                calcul.setText(calcul.getText().toString() + '0');
            }
        });

        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifBoll(calcul, result, lastCalcul);
                calcul.setText(calcul.getText().toString() + '1');
            }
        });

        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifBoll(calcul, result, lastCalcul);
                calcul.setText(calcul.getText().toString() + '2');
            }
        });

        bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifBoll(calcul, result, lastCalcul);
                calcul.setText(calcul.getText().toString() + '3');
            }
        });

        bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifBoll(calcul, result, lastCalcul);
                calcul.setText(calcul.getText().toString() + '4');
            }
        });

        bt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifBoll(calcul, result, lastCalcul);
                calcul.setText(calcul.getText().toString() + '5');
            }
        });

        bt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifBoll(calcul, result, lastCalcul);
                calcul.setText(calcul.getText().toString() + '6');
            }
        });

        bt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifBoll(calcul, result, lastCalcul);
                calcul.setText(calcul.getText().toString() + '7');
            }
        });

        bt_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifBoll(calcul, result, lastCalcul);
                calcul.setText(calcul.getText().toString() + '8');
            }
        });

        bt_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifBoll(calcul, result, lastCalcul);
                calcul.setText(calcul.getText().toString() + '9');
            }
        });
    }
}
