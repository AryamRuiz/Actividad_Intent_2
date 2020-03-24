package com.example.actividad_intent_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    TextView txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnRegresar = (Button) findViewById(R.id.btnRegresar);
        txtNombre = (TextView) findViewById(R.id.txtNombre);
        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("NOMBRE");
        String telefono = extras.getString("TELEFONO");
        String correo = extras.getString("CORREO");
        txtNombre.setText(nombre.toUpperCase()+" "+telefono+" "+correo);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), MainActivity.class);
                i2.putExtra("MAYUSCULAS",txtNombre.getText().toString());
                startActivity(i2);
            }
        });
    }
}
