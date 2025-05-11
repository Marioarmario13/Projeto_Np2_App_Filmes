package com.example.app_filmes_ddm_np2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class TelaInicial extends AppCompatActivity {

    private ViewFlipper viewFlipper;
    private Button btnToSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        // Config ViewFlipper
        viewFlipper = findViewById(R.id.viewFlipper);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();

        // Inicializando o botão para navegação
        btnToSpinner = findViewById(R.id.tospinner);

        // Configurando o listener de clique para o botão
        btnToSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para abrir a próxima tela (TelaSpinner)
                Intent intent = new Intent(TelaInicial.this, tela_spinner.class);
                startActivity(intent);
            }
        });
    }
}
