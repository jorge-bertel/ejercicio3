package com.example.jorgeandres.ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText base,altura,radio,lado;
    private RadioGroup boton;
    private RadioButton opcion;
    private TextView resu;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        base=(EditText)findViewById(R.id.rprimero);
        altura=(EditText)findViewById(R.id.rsegundo);
        radio=(EditText)findViewById(R.id.rtercero);
        lado=(EditText)findViewById(R.id.rcuarto);
        boton=(RadioGroup)findViewById(R.id.rarea);
        lado.setVisibility(View.INVISIBLE);
        radio.setVisibility(View.INVISIBLE);
        altura.setVisibility(View.INVISIBLE);
        base.setVisibility(View.INVISIBLE);
        final Button boton1=(Button)findViewById(R.id.rbu);
        final Button boton2=(Button)findViewById(R.id.rbu);
        final Button boton3=(Button)findViewById(R.id.rbu);
        resu=(TextView)findViewById(R.id.resul);


        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (boton.getCheckedRadioButtonId() == R.id.rcirculo) {
                    double rad = Double.parseDouble(radio.getText().toString());
                    resu.setText(String.valueOf((2) * (3.1416) * (rad)));
                }
                else
                if (boton.getCheckedRadioButtonId() == R.id.rcuadrado) {
                    double lad = Double.parseDouble(lado.getText().toString());
                    resu.setText(String.valueOf(lad*lad));
                }

                else
                if (boton.getCheckedRadioButtonId() == R.id.rrectangulo) {
                    double bas = Double.parseDouble(base.getText().toString());
                    double alt = Double.parseDouble(altura.getText().toString());
                    resu.setText(String.valueOf(bas * alt ));
                } else if (boton.getCheckedRadioButtonId() == R.id.rtriangulo) {
                    double bas = Double.parseDouble(base.getText().toString());
                    double alt = Double.parseDouble(altura.getText().toString());
                    resu.setText(String.valueOf((bas) * (alt) / (2) ));
                }

            }
        });


           boton.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()

                                            {
                                                @Override
                                                public void onCheckedChanged(RadioGroup group, int checkedId) {


                                                    if (boton.getCheckedRadioButtonId() == R.id.rcirculo) {
                                                        radio.setVisibility(View.VISIBLE);
                                                        altura.setVisibility(View.INVISIBLE);
                                                        base.setVisibility(View.INVISIBLE);
                                                        lado.setVisibility(View.INVISIBLE);
                                                    } else if (boton.getCheckedRadioButtonId() == R.id.rcuadrado) {
                                                        lado.setVisibility(View.VISIBLE);
                                                        radio.setVisibility(View.INVISIBLE);
                                                        altura.setVisibility(View.INVISIBLE);
                                                        base.setVisibility(View.INVISIBLE);
                                                    } else if (boton.getCheckedRadioButtonId() == R.id.rrectangulo) {
                                                        base.setVisibility(View.VISIBLE);
                                                        altura.setVisibility(View.VISIBLE);
                                                        radio.setVisibility(View.INVISIBLE);
                                                        lado.setVisibility(View.INVISIBLE);
                                                    } else if (boton.getCheckedRadioButtonId() == R.id.rtriangulo) {
                                                        base.setVisibility(View.VISIBLE);
                                                        altura.setVisibility(View.VISIBLE);
                                                        radio.setVisibility(View.INVISIBLE);
                                                        lado.setVisibility(View.INVISIBLE);
                                                    }
                                                }


                                            }

           );


       }
    }
