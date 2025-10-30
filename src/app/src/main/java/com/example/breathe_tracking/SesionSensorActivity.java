package com.example.breathe_tracking;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SesionSensorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_sensor);

        ImageView cerrarSesionButton = findViewById(R.id.imageView_cerrarSesion);

        cerrarSesionButton.setOnClickListener(v -> {
            // Iniciar la actividad de login
            Intent intent = new Intent(SesionSensorActivity.this, MainActivity.class);
            startActivity(intent);
            // Cerrar la actividad actual
            finish();
        });

        // Aquí puedes recuperar los datos del sensor que se pasaron desde la actividad de login
        // y actualizar la interfaz de usuario con esos datos.
    }
}
