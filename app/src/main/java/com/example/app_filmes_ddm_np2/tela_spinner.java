package com.example.app_filmes_ddm_np2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class tela_spinner extends AppCompatActivity {

    Spinner spinner;
    String[] opcoes = {
            "Selecione um filme",
            "007",
            "Capitão América",
            "Chico Bento",
            "Nosferatu"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_spinner);

        spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, opcoes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Corrigindo a navegação dos filmes
                switch (position) {
                    case 1: // 007
                        startActivity(new Intent(tela_spinner.this, tela_sinopse_007.class));
                        break;
                    case 2: // Capitão América
                        startActivity(new Intent(tela_spinner.this, tela_sinopse_capitaoamerica.class));
                        break;
                    case 3: // Chico Bento
                        startActivity(new Intent(tela_spinner.this, tela_sinopse_chicobento.class));
                        break;
                    case 4: // Nosferatu
                        startActivity(new Intent(tela_spinner.this, tela_sinopse_nosferatu.class));
                        break;
                    default:
                        // Nenhuma ação necessária se não for uma opção válida
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Nada
            }
        });
    }
}
