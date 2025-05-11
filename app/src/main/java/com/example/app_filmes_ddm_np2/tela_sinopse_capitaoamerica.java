package com.example.app_filmes_ddm_np2;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class tela_sinopse_capitaoamerica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sinopse_capitaoamerica);

        // Inicializando o botão dentro do onCreate
        Button btnVoltar = findViewById(R.id.btnVoltar);

        // Definindo o ouvinte de clique
        btnVoltar.setOnClickListener(v -> {
            finish(); // Fecha esta activity e volta para a anterior (MainActivity)
        });
    }
}