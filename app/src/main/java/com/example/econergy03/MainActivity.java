package com.example.econergy03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creamos la variable boton y la relacionamos con el boton de la parte visual
        Button btn_start = findViewById(R.id.btn_start);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Este es la forma en que muestro información al usuario
                Toast.makeText(getApplicationContext(),"¡VAMOS ADELANTE!",Toast.LENGTH_SHORT).show();
                //Vamos a crear un Intento para pasar a la siguiente página
                Intent irAPag2 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(irAPag2);
            }
        });


    }
}