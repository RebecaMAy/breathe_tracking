package com.example.breathe_tracking;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    private final ActivityResultLauncher<String> requestPermissionLauncher = registerForActivityResult(
            new ActivityResultContracts.RequestPermission(),
            isGranted -> {
                if (isGranted) {
                    openCamera();
                } else {
                    Toast.makeText(this, "Permiso de cámara denegado", Toast.LENGTH_SHORT).show();
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        EditText sensorCodeEditText = findViewById(R.id.editText_codigo);
        Button loginButton = findViewById(R.id.button_entrar);
        TextView qrCodeTextView = findViewById(R.id.textView_codigoQR);

        loginButton.setOnClickListener(v -> {
            String sensorCode = sensorCodeEditText.getText().toString();

            if (sensorCode.isEmpty()) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Error, campo vacío")
                        .setMessage("Añade el código del sensor para vincular.")
                        .setPositiveButton("Aceptar", null)
                        .show();
            } else if ("12345".equals(sensorCode)) {
                Intent intent = new Intent(MainActivity.this, SesionSensorActivity.class);
                intent.putExtra("SENSOR_CODE", sensorCode);
                startActivity(intent);
                finish(); // <-- Aquí está la clave: cerramos la actividad de login
            } else {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Error")
                        .setMessage("El código de vinculación es incorrecto.")
                        .setPositiveButton("Aceptar", null)
                        .show();
            }
        });

        qrCodeTextView.setOnClickListener(v -> {
            if (ContextCompat.checkSelfPermission(
                    this, Manifest.permission.CAMERA) ==
                    PackageManager.PERMISSION_GRANTED) {
                openCamera();
            } else {
                requestPermissionLauncher.launch(Manifest.permission.CAMERA);
            }
        });
    }

    private void openCamera() {
        // Esto abre la app de la cámara. Para escanear QR, necesitarás una librería.
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
    }
}
