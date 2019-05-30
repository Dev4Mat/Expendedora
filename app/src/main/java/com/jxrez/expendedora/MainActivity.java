package com.jxrez.expendedora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView galleta,refresco,gomita,cancel,inicio,one,two,five,ten;
    TextView total, cambio;
    private int state = 0;
    private char entrada = 'a';
    private boolean encendido = false;
    private int totalD = 0, cambioD = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //---Button's
        galleta = findViewById(R.id.galletaBtn);
        refresco = findViewById(R.id.refrescoBtn);
        gomita = findViewById(R.id.gomitaBtn);
        cancel = findViewById(R.id.cancelBtn);
        inicio = findViewById(R.id.inicioBtn);
        one = findViewById(R.id.oneBtn);
        two = findViewById(R.id.twoBtn);
        five = findViewById(R.id.fiveBtn);
        ten = findViewById(R.id.tenBtn);
        //---TextView's
        total = findViewById(R.id.totalTv);
        cambio = findViewById(R.id.cambioTv);

        galleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (encendido){
                    entrada = 'g';
                    todoPoderoso();
                } else {
                    Toast.makeText(MainActivity.this, "Encienda la maquina", Toast.LENGTH_SHORT).show();
                }
            }
        });

        refresco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (encendido){
                    entrada = 'r';
                    todoPoderoso();
                } else {
                    Toast.makeText(MainActivity.this, "Encienda la maquina", Toast.LENGTH_SHORT).show();
                }
            }
        });

        gomita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (encendido){
                    entrada = 'p';
                    todoPoderoso();
                } else {
                    Toast.makeText(MainActivity.this, "Encienda la maquina", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (encendido){
                    entrada = 'x';
                    todoPoderoso();
                } else {
                    Toast.makeText(MainActivity.this, "Encienda la maquina", Toast.LENGTH_SHORT).show();
                }
            }
        });

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, !encendido ? "Encendiendo..." : "Apagando...", Toast.LENGTH_SHORT).show();
                inicio.setImageDrawable(getDrawable(!encendido ? R.drawable.inicio : R.drawable.inicio_off));
                encendido = !encendido;
                if (!encendido) {
                    totalD = 0;
                    state = 0;
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (encendido){
                    entrada = 'o';
                    todoPoderoso();
                } else {
                    Toast.makeText(MainActivity.this, "Encienda la maquina", Toast.LENGTH_SHORT).show();
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (encendido){
                    entrada = 't';
                    todoPoderoso();
                } else {
                    Toast.makeText(MainActivity.this, "Encienda la maquina", Toast.LENGTH_SHORT).show();
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (encendido){
                    entrada = 'f';
                    todoPoderoso();
                } else {
                    Toast.makeText(MainActivity.this, "Encienda la maquina", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (encendido){
                    entrada = 'd';
                    todoPoderoso();
                } else {
                    Toast.makeText(MainActivity.this, "Encienda la maquina", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void imprimeToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    public void actualizarTotal(){
        total.setText("$"+totalD);
    }

    public void actualizarCambio() {
        if (cambioD == -1)
            cambio.setText("---");
        else {
            cambio.setText("$" + cambioD);
            total.setText("$0");
        }
    }


    public void todoPoderoso(){
        switch (state){
            case 0:
                q0();
                break;
            case 1:
                q1();
                break;
            case 2:
                q2();
                break;
            case 3:
                q3();
                break;
            case 4:
                q4();
                break;
            case 5:
                q5();
                break;
            case 6:
                q6();
                break;
            case 7:
                q7();
                break;
            case 8:
                q8();
                break;
            case 9:
                q9();
                break;
            case 10:
                q10();
                break;
            case 11:
                q11();
                break;
            case 12:
                q12();
                break;
            case 13:
                q13();
                break;
            case 14:
                q14();
                break;
            case 15:
                q15();
                break;
            case 16:
                q16();
                break;
            case 17:
                q17();
                break;
        }
        actualizarTotal();
        actualizarCambio();
    }

    public void q0(){
        cambioD = -1;
        actualizarCambio();
        switch (entrada) {
            case 'o':
                state = 1;
                totalD = 1;
                break;
            case 't':
                state  = 2;
                totalD = 2;
                break;
            case 'f':
                state = 5;
                totalD = 5;
                break;
            case 'd':
                state = 10;
                totalD = 10;
                break;
            case 'x':
                state = 0;
                totalD = 0;
                break;
            case 'p':
                System.out.println("Faltan $13");
                imprimeToast("Faltan $13");
                state = 0;
                break;
            case 'r':
                System.out.println("Faltan $15");
                imprimeToast("Faltan $15");
                state = 0;
                break;
            case 'g':
                System.out.println("Faltan $16");
                imprimeToast("Faltan $16");
                state = 0;
                break;
        }
    }

    public void q1(){
        switch(entrada){
            case 'o':
                state = 2;
                totalD = 2;
                break;
            case 't':
                state = 3;
                totalD = 3;
                break;
            case 'f':
                state = 6;
                totalD = 6;
                break;
            case 'd':
                state = 11;
                totalD = 11;
                break;
            case 'x':
                q29();
                break;
            case 'p':
                System.out.println("Faltan $12");
                imprimeToast("Faltan $12");
                state = 1;
                break;
            case 'r':
                System.out.println("Faltan $14");
                imprimeToast("Faltan $14");
                state = 1;
                break;
            case 'g':
                System.out.println("Faltan $15");
                imprimeToast("Faltan $15");
                state = 1;
                break;
        }
    }

    public void q2(){
        switch(entrada){
            case 'o':
                state = 3;
                totalD = 3;
                break;
            case 't':
                state = 4;
                totalD = 4;
                break;
            case 'f':
                state = 7;
                totalD = 7;
                break;
            case 'd':
                state = 12;
                totalD = 12;
                break;
            case 'x':
                q30();
                break;
            case 'p':
                System.out.println("Faltan $11");
                imprimeToast("Faltan $11");
                state = 2;
                break;
            case 'r':
                System.out.println("Faltan $13");
                imprimeToast("Faltan $13");
                state = 2;
                break;
            case 'g':
                System.out.println("Faltan $14");
                imprimeToast("Faltan $14");
                state = 2;
                break;
        }
    }

    public void q3(){
        switch(entrada){
            case 'o':
                state = 4;
                totalD = 4;
                break;
            case 't':
                state = 5;
                totalD = 5;
                break;
            case 'f':
                state = 8;
                totalD = 8;
                break;
            case 'd':
                state = 13;
                totalD = 13;
                break;
            case 'x':
                q28();
                break;
            case 'p':
                System.out.println("Faltan $10");
                imprimeToast("Faltan $10");
                state = 3;
                break;
            case 'r':
                System.out.println("Faltan $12");
                imprimeToast("Faltan $12");
                state = 3;
                break;
            case 'g':
                System.out.println("Faltan $13");
                imprimeToast("Faltan $13");
                state = 3;
                break;
        }
    }

    public void q4(){
        switch(entrada){
            case 'o':
                state = 5;
                totalD = 5;
                break;
            case 't':
                state = 6;
                totalD = 6;
                break;
            case 'f':
                state = 9;
                totalD = 9;
                break;
            case 'd':
                state = 14;
                totalD = 14;
                break;
            case 'x':
                q27();
                break;
            case 'p':
                System.out.println("Faltan $9");
                imprimeToast("Faltan $9");
                state = 4;
                break;
            case 'r':
                System.out.println("Faltan $11");
                imprimeToast("Faltan $11");
                state = 4;
                break;
            case 'g':
                System.out.println("Faltan $12");
                imprimeToast("Faltan $12");
                state = 4;
                break;
        }
    }

    public void q5(){
        switch(entrada){
            case 'o':
                state = 6;
                totalD = 6;
                break;
            case 't':
                state = 7;
                totalD = 7;
                break;
            case 'f':
                state = 10;
                totalD = 10;
                break;
            case 'd':
                state = 15;
                totalD = 15;
                break;
            case 'x':
                q31();
                break;
            case 'p':
                System.out.println("Faltan $8");
                imprimeToast("Faltan $8");
                state = 5;
                break;
            case 'r':
                System.out.println("Faltan $10");
                imprimeToast("Faltan $10");
                state = 5;
                break;
            case 'g':
                System.out.println("Faltan $11");
                imprimeToast("Faltan $11");
                state = 5;
                break;
        }
    }

    public void q6(){
        switch(entrada){
            case 'o':
                state = 7;
                totalD = 7;
                break;
            case 't':
                state = 8;
                totalD = 8;
                break;
            case 'f':
                state = 11;
                totalD = 11;
                break;
            case 'd':
                state = 16;
                totalD = 16;
                break;
            case 'x':
                q26();
                break;
            case 'p':
                System.out.println("Faltan $7");
                imprimeToast("Faltan $7");
                state = 6;
                break;
            case 'r':
                System.out.println("Faltan $9");
                imprimeToast("Faltan $9");
                state = 6;
                break;
            case 'g':
                System.out.println("Faltan $10");
                imprimeToast("Faltan $10");
                state = 6;
                break;
        }
    }

    public void q7(){
        switch(entrada){
            case 'o':
                state = 8;
                totalD = 8;
                break;
            case 't':
                state = 9;
                totalD = 9;
                break;
            case 'f':
                state = 12;
                totalD = 12;
                break;
            case 'd':
                System.out.println("Exceso de dinero - Devuelvo $10");
                imprimeToast("Exceso de dinero - Devuelvo $10");
                state = 7;
                break;
            case 'x':
                q25();
                break;
            case 'p':
                System.out.println("Faltan $6");
                imprimeToast("Faltan $6");
                state = 7;
                break;
            case 'r':
                System.out.println("Faltan $8");
                imprimeToast("Faltan $8");
                state = 7;
                break;
            case 'g':
                System.out.println("Faltan $9");
                imprimeToast("Faltan $9");
                state = 7;
                break;
        }
    }

    public void q8(){
        switch(entrada){
            case 'o':
                state = 9;
                totalD = 9;
                break;
            case 't':
                state = 10;
                totalD = 10;
                break;
            case 'f':
                state = 13;
                totalD = 13;
                break;
            case 'd':
                System.out.println("Exceso de dinero - Devuelvo $10");
                imprimeToast("Exceso de dinero - Devuelvo $10");
                state = 8;
                break;
            case 'x':
                q24();
                break;
            case 'p':
                System.out.println("Faltan $5");
                imprimeToast("Faltan $5");
                state = 8;
                break;
            case 'r':
                System.out.println("Faltan $7");
                imprimeToast("Faltan $7");
                state = 8;
                break;
            case 'g':
                System.out.println("Faltan $8");
                imprimeToast("Faltan $8");
                state = 8;
                break;
        }
    }

    public void q9(){
        switch(entrada){
            case 'o':
                state = 10;
                totalD = 10;
                break;
            case 't':
                state = 11;
                totalD = 11;
                break;
            case 'f':
                state = 14;
                totalD = 14;
                break;
            case 'd':
                System.out.println("Exceso de dinero - Devuelvo $10");
                imprimeToast("Exceso de dinero - Devuelvo $10");
                state = 9;
                break;
            case 'x':
                q23();
                break;
            case 'p':
                System.out.println("Faltan $4");
                imprimeToast("Faltan $4");
                state = 9;
                break;
            case 'r':
                System.out.println("Faltan $6");
                imprimeToast("Faltan $6");
                state = 9;
                break;
            case 'g':
                System.out.println("Faltan $7");
                imprimeToast("Faltan $7");
                state = 9;
                break;
        }
    }

    public void q10(){
        switch(entrada){
            case 'o':
                state = 11;
                totalD = 11;
                break;
            case 't':
                state = 12;
                totalD = 12;
                break;
            case 'f':
                state = 15;
                totalD = 15;
                break;
            case 'd':
                System.out.println("Exceso de dinero - Devuelvo $10");
                imprimeToast("Exceso de dinero - Devuelvo $10");
                state = 10;
                break;
            case 'x':
                q32();
                break;
            case 'p':
                System.out.println("Faltan $3");
                imprimeToast("Faltan $3");
                state = 10;
                break;
            case 'r':
                System.out.println("Faltan $5");
                imprimeToast("Faltan $5");
                state = 10;
                break;
            case 'g':
                System.out.println("Faltan $6");
                imprimeToast("Faltan $6");
                state = 10;
                break;
        }
    }

    public void q11(){
        switch(entrada){
            case 'o':
                state = 12;
                totalD = 12;
                break;
            case 't':
                state = 13;
                totalD = 13;
                break;
            case 'f':
                state = 16;
                totalD = 16;
                break;
            case 'd':
                System.out.println("Exceso de dinero - Devuelvo $10");
                imprimeToast("Exceso de dinero - Devuelvo $10");
                state = 11;
                break;
            case 'x':
                q22();
                break;
            case 'p':
                System.out.println("Faltan $2");
                imprimeToast("Faltan $2");
                state = 11;
                break;
            case 'r':
                System.out.println("Faltan $4");
                imprimeToast("Faltan $4");
                state = 11;
                break;
            case 'g':
                System.out.println("Faltan $5");
                imprimeToast("Faltan $5");
                state = 11;
                break;
        }
    }

    public void q12(){
        switch(entrada){
            case 'o':
                state = 13;
                totalD = 13;
                break;
            case 't':
                state = 14;
                totalD = 14;
                break;
            case 'f':
                System.out.println("Exceso de dinero - Devuelvo $5");
                imprimeToast("Exceso de dinero - Devuelvo $5");
                state = 12;
                break;
            case 'd':
                System.out.println("Exceso de dinero - Devuelvo $10");
                imprimeToast("Exceso de dinero - Devuelvo $10");
                state = 12;
                break;
            case 'x':
                q21();
                break;
            case 'p':
                System.out.println("Falta $1");
                imprimeToast("Falta $1");
                state = 12;
                break;
            case 'r':
                System.out.println("Faltan $3");
                imprimeToast("Falta $3");
                state = 12;
                break;
            case 'g':
                System.out.println("Faltan $4");
                imprimeToast("Falta $4");
                state = 12;
                break;
        }
    }

    public void q13(){
        switch(entrada){
            case 'o':
                state = 14;
                totalD = 14;
                break;
            case 't':
                state = 15;
                totalD = 15;
                break;
            case 'f':
                System.out.println("Exceso de dinero - Devuelvo $5");
                imprimeToast("Exceso de dinero - Devuelvo $5");
                state = 13;
                break;
            case 'd':
                System.out.println("Exceso de dinero - Devuelvo $10");
                imprimeToast("Exceso de dinero - Devuelvo $10");
                state = 13;
                break;
            case 'x':
                q20();
                break;
            case 'p':
                q33();
                break;
            case 'r':
                System.out.println("Faltan $2");
                imprimeToast("Faltan $2");
                state = 13;
                break;
            case 'g':
                System.out.println("Faltan $3");
                imprimeToast("Faltan $3");
                state = 13;
                break;
        }
    }

    public void q14(){
        switch(entrada){
            case 'o':
                state = 15;
                totalD = 15;
                break;
            case 't':
                state = 16;
                totalD = 16;
                break;
            case 'f':
                System.out.println("Exceso de dinero - Devuelvo $5");
                imprimeToast("Exceso de dinero - Devuelvo $5");
                state = 14;
                break;
            case 'd':
                System.out.println("Exceso de dinero - Devuelvo $10");
                imprimeToast("Exceso de dinero - Devuelvo $10");
                state = 14;
                break;
            case 'x':
                q19();
                break;
            case 'p':
                q34();
                break;
            case 'r':
                System.out.println("Falta $1");
                imprimeToast("Faltan $1");
                state = 14;
                break;
            case 'g':
                System.out.println("Faltan $2");
                imprimeToast("Faltan $2");
                state = 14;
                break;
        }
    }

    public void q15(){
        switch(entrada){
            case 'o':
                state = 16;
                totalD = 16;
                break;
            case 't':
                System.out.println("Exceso de dinero - Devuelvo $2");
                imprimeToast("Exceso de dinero - Devuelvo $2");
                state = 15;
                break;
            case 'f':
                System.out.println("Exceso de dinero - Devuelvo $5");
                imprimeToast("Exceso de dinero - Devuelvo $5");
                state = 15;
                break;
            case 'd':
                System.out.println("Exceso de dinero - Devuelvo $10");
                imprimeToast("Exceso de dinero - Devuelvo $10");
                state = 15;
                break;
            case 'x':
                q18();
                break;
            case 'p':
                q35();
                break;
            case 'r':
                q37();
                break;
            case 'g':
                System.out.println("Falta $1");
                imprimeToast("Falta $1");
                state = 15;
                break;
        }
    }

    public void q16(){
        switch(entrada){
            case 'o':
                System.out.println("Exceso de dinero - Devuelvo $1");
                imprimeToast("Exceso de dinero - Devuelvo $1");
                state = 16;
                break;
            case 't':
                System.out.println("Exceso de dinero - Devuelvo $2");
                imprimeToast("Exceso de dinero - Devuelvo $2");
                state = 16;
                break;
            case 'f':
                System.out.println("Exceso de dinero - Devuelvo $5");
                imprimeToast("Exceso de dinero - Devuelvo $5");
                state = 16;
                break;
            case 'd':
                System.out.println("Exceso de dinero - Devuelvo $10");
                imprimeToast("Exceso de dinero - Devuelvo $10");
                break;
            case 'x':
                q17();
                break;
            case 'p':
                q36();
                break;
            case 'r':
                q38();
                break;
            case 'g':
                q39();
                break;
        }
    }

    public void q17(){
        //Checar Referencia
        System.out.println("Devuelvo $10");
        cambioD += 10;
        q26();
    }

    public void q18(){
        System.out.println("Devuelvo $10");
        cambioD += 10;
        q31();
    }

    public void q19(){
        System.out.println("Devuelvo $10");
        cambioD += 10;
        q27();
    }

    public void q20(){
        System.out.println("Devuelvo $10");
        cambioD += 10;
        q28();
    }

    public void q21(){
        System.out.println("Devuelvo $10");
        cambioD += 10;
        q30();
    }

    public void q22(){
        System.out.println("Devuelvo $10");
        cambioD += 10;
        q29();
    }

    public void q23(){
        //TODO:Checar en diagrama referencia
        System.out.println("Devuelvo $5");
        cambioD += 5;
        q27();
    }

    public void q24(){
        System.out.println("Devuelvo $5");
        cambioD += 5;
        q28();
    }

    public void q25(){
        System.out.println("Devuelvo $5");
        cambioD += 5;
        q30();
    }

    public void q26(){
        System.out.println("Devuelvo $5");
        cambioD += 5;
        q29();
    }

    public void q27(){
        System.out.println("Devuelvo $2");
        cambioD += 2;
        q30();
    }

    public void q28(){
        System.out.println("Devuelvo $2");
        cambioD += 2;
        q29();
    }

    public void q29(){
        System.out.println("Devuelvo $1");
        cambioD += 1;
        actualizarCambio();
        state = 0;
    }

    public void q30(){
        System.out.println("Devuelvo $2");
        cambioD += 2;
        Log.d("Cambio", cambioD+"");
        actualizarCambio();
        state = 0;
    }

    public void q31(){
        System.out.println("Devuelvo $5");
        cambioD += 5;
        actualizarCambio();
        state = 0;
    }

    public void q32(){
        System.out.println("Devuelvo $10");
        cambioD += 10;
        actualizarCambio();
        state = 0;
    }

    public void q33(){
        System.out.println("Entrego gomitas - Precio $13");
        imprimeToast("Entrego gomitas - Precio $13\nDisfrute su compra");
        totalD = 0;
        cambioD = 0;
        state = 0;
    }

    public void q34(){
        System.out.println("Entrego gomitas - Precio $13");
        imprimeToast("Entrego gomitas - Precio $13\nDisfrute su compra");
        totalD = 0;
        cambioD = 0;
        q29();
    }

    public void q35(){
        System.out.println("Entrego gomitas - Precio $13");
        imprimeToast("Entrego gomitas - Precio $13\nDisfrute su compra");
        totalD = 0;
        cambioD = 0;
        q30();
    }

    public void q36(){
        System.out.println("Entrego gomitas - Precio $13");
        imprimeToast("Entrego gomitas - Precio $13\nDisfrute su compra");
        totalD = 0;
        cambioD = 0;
        q28();
    }

    public void q37(){
        System.out.println("Entrego refresco - Precio $15");
        imprimeToast("Entrego refresco - Precio $15\nDisfrute su compra");
        totalD = 0;
        cambioD = 0;
        state = 0;
    }

    public void q38(){
        System.out.println("Entrego refresco - Precio $15");
        imprimeToast("Entrego refresco - Precio $15\nDisfrute su compra");
        totalD = 0;
        cambioD = 0;
        q29();
    }

    public void q39(){
        System.out.println("Entrego galletas - Precio $16");
        imprimeToast("Entrego galletas - Precio $16\nDisfrute su compra");
        totalD = 0;
        cambioD = 0;
        state = 0;
    }
}