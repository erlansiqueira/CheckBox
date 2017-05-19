package checkbox.cursoandroid.com.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox cao;
    private CheckBox gato;
    private CheckBox papagaio;

    private Button botaoMostrar;
    private TextView textoMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cao = (CheckBox) findViewById(R.id.checkBoxCaoId);
        gato = (CheckBox) findViewById(R.id.checkBoxGatoId);
        papagaio = (CheckBox) findViewById(R.id.checkBoxPapagaioId);

        botaoMostrar = (Button) findViewById(R.id.botaoMostrarId);
        textoMostrar = (TextView) findViewById(R.id.textoExibicaoId);

        botaoMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String itensSelecionados = "";

                itensSelecionados += "Item: " + gato.getText() + " Status: " + gato.isChecked() + "\n";
                itensSelecionados += "Item: " + cao.getText() + " Status: " + cao.isChecked() + "\n";
                itensSelecionados += "Item: " + papagaio.getText() + " Status: " + papagaio.isChecked() + "\n";

                textoMostrar.setText(itensSelecionados);


            }
        });
    }
}
