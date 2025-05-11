package com.example.app_filmes_ddm_np2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class tela_login extends AppCompatActivity {

    private EditText editTextEmail, editTextSenha;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextSenha = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.buttonLogin);

        btnLogin.setOnClickListener(v -> {
            String email = editTextEmail.getText().toString();
            String senha = editTextSenha.getText().toString();

            if (email.equals("aluno@unip.com") && senha.equals("unip25")) {
                Toast.makeText(this, "Login bem-sucedido!", Toast.LENGTH_SHORT).show();
                // Ir para a próxima tela
                startActivity(new Intent(tela_login.this, TelaInicial.class));
                finish();
            } else {
                Toast.makeText(this, "E-mail ou senha incorretos", Toast.LENGTH_SHORT).show();
            }
        });
    }
}