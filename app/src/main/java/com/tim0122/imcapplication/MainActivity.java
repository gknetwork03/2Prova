package com.tim0122.imcapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
                float peso;
                float altura;
                String mensagem;
                float imc;

                EditText idPeso, idAltura;
                TextView idResultado;
                Button idCalcular;


                 @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);

                    idPeso = (EditText) findViewById(R.id.idPeso);
                    idAltura = (EditText) findViewById(R.id.idAltura);
                    idResultado = (TextView) findViewById(R.id.idResultado);
                    idCalcular = (Button) findViewById(R.id.idCalcular);

                    idCalcular.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            peso = Float.parseFloat(idPeso.getText().toString());
                            altura = Float.parseFloat(idAltura.getText().toString());



                            imc = peso / (altura * altura);

                            if (imc < 18.5) {

                                mensagem = "Abaixo do peso";

                            } else if ((imc >= 18.5) && (imc < 24.9)) {

                                mensagem = "Peso normal";

                            } else if ((imc >= 25.0) && (imc < 29.9)) {

                                mensagem = "Excesso de peso";

                            } else if ((imc >= 30.0) && (imc < 34.9)) {

                                mensagem = "Obesidade classe I";

                            } else if ((imc >= 35.0) && (imc < 39.9)) {

                                mensagem = "Obesidade classe II";

                            } else if (imc >= 40.0) {

                                mensagem = "Obesidade classe III";

                            }

                            idResultado.setText("IMC: " + String.valueOf(imc)+ "\nMensagem: " + mensagem);

                        }
                        });

                    }

                }

