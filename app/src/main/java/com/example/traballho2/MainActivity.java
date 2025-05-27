package com.example.trabalho2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.traballho2.R;

import java.util.List;

import Database.dataBaseEspecialidade; // Use nome com letra maiúscula
import Entities.EspecialidadeEntities;

public class MainActivity extends AppCompatActivity {

    EditText editDescricao;
    Button btnInserir;
    TextView txtLista;

    dataBaseEspecialidade db; // Sua instância do banco

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editDescricao = findViewById(R.id.editDescricao);
        btnInserir = findViewById(R.id.btnInserir);
        txtLista = findViewById(R.id.txtLista);

        db = dataBaseEspecialidade.getDatabase(getApplicationContext());

        atualizarLista();

        btnInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String descricao = editDescricao.getText().toString();
                if (!descricao.isEmpty()) {
                    EspecialidadeEntities especialidade = new EspecialidadeEntities(descricao);
                    db.especialidadeDao().insertAll(especialidade);
                    editDescricao.setText(""); // Limpar campo
                    atualizarLista();
                }
            }
        });
    }

    private void atualizarLista() {
        List<EspecialidadeEntities> lista = db.especialidadeDao().getAll();
        StringBuilder sb = new StringBuilder("Especialidades:\n");
        for (EspecialidadeEntities e : lista) {
            sb.append(e.toString()).append("\n");
        }
        txtLista.setText(sb.toString());
    }
}
