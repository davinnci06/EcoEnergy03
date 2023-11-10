package com.example.econergy03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Creamos las variables de cada elemento y las enlazamos
        //Definición de los EditText
        EditText eT1 = findViewById(R.id.eT1);
        EditText eT2 = findViewById(R.id.eT2);
        EditText eT3 = findViewById(R.id.eT3);
        EditText eT4 = findViewById(R.id.eT4);
        //Definición de los RadioButton
        RadioGroup rG1 = findViewById(R.id.rG1);
        RadioButton rB1 = findViewById(R.id.rB1);
        RadioButton rB2 = findViewById(R.id.rB2);
        RadioButton rB3 = findViewById(R.id.rB3);
        //Definición de los CheckBox
        CheckBox cB1 = findViewById(R.id.cB1);
        CheckBox cB2 = findViewById(R.id.cB2);
        CheckBox cB3 = findViewById(R.id.cB3);
        //Definimos el boton de enviar
        Button btn_enviar = findViewById(R.id.btn_enviar);

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos un mensaje que se va mostrar cuando se oprima el botón de enviar
                /*String msj = "Nombre: " + eT1.getText().toString() +
                        "\nDirección: " + eT2.getText().toString() +
                        "\nCorreo: " + eT3.getText().toString() +
                        "\nTeléfono: " + eT4.getText().toString();
                //Vamos a mostrar todo el mensaje cuando se oprima el boton de enviar
                Toast.makeText(getApplicationContext(),msj,Toast.LENGTH_SHORT).show();*/

                //----------------------------------------------------------------------------------------//
                //Vamos a mostrar un mensaje cuando se selecciona algún elemento relevante del RadioGroup
                /*if (rB1.isChecked()) {
                    //Este es el mensaje que se mostrará cuando se tenga seleccionado el RadioButton de casa
                    Toast.makeText(getApplicationContext(),"Vives en una Casa",Toast.LENGTH_SHORT).show();
                }
                if (rB2.isChecked()) {
                    //Este es el mensaje que se mostrará cuando se tenga seleccionado el RadioButton de casa
                    Toast.makeText(getApplicationContext(),"Vives en una Apartamento",Toast.LENGTH_SHORT).show();
                }
                if (rB3.isChecked()) {
                    //Este es el mensaje que se mostrará cuando se tenga seleccionado el RadioButton de casa
                    Toast.makeText(getApplicationContext(),"Vives en zona Rural",Toast.LENGTH_SHORT).show();
                }*/

                //----------------------------------------------------------------------------------------//
                //Vamos a mostrar un mensaje cuando se selecciona algún elemento relevante de algún CheckBox
                if (cB1.isChecked()) {
                    //Este es el mensaje que se mostrará cuando se tenga seleccionado el RadioButton de casa
                    Toast.makeText(getApplicationContext(),"Paneles Solares",Toast.LENGTH_SHORT).show();
                }
                if (cB2.isChecked()) {
                    //Este es el mensaje que se mostrará cuando se tenga seleccionado el RadioButton de casa
                    Toast.makeText(getApplicationContext(),"Aerogeneradores",Toast.LENGTH_SHORT).show();
                }
                if (cB3.isChecked()) {
                    //Este es el mensaje que se mostrará cuando se tenga seleccionado el RadioButton de casa
                    Toast.makeText(getApplicationContext(),"Otros",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}