package br.com.fiap.thirdproject;

import android.location.GpsStatus;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView _resultado;
    private Button _btnMais;
    private Button _btnMenos;
    private Button _btnVezes;
    private Button _btnDividir;
    private EditText _valor1;
    private EditText _valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _resultado = (TextView)findViewById(R.id.txtResult);

        _btnMais = (Button)findViewById(R.id.btnMais);
        _btnMenos = (Button)findViewById(R.id.btnMenos);
        _btnVezes = (Button)findViewById(R.id.btnVezes);
        _btnDividir = (Button)findViewById(R.id.btnDividir);

        _valor1 = (EditText)findViewById(R.id.etx1);
        _valor2 = (EditText)findViewById(R.id.etx2);


        _resultado.setText(R.string.txtZero);
        _btnMais.setOnClickListener(this);
        _btnMenos.setOnClickListener(this);
        _btnVezes.setOnClickListener(this);
        _btnDividir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        double valor1 = Double.parseDouble(_valor1.getText().toString());
        double valor2 = Double.parseDouble(_valor2.getText().toString());
        double resultado = 0;

        switch (v.getId()){
            case R.id.btnMais:
                resultado = (valor1 + valor2);
                break;

            case R.id.btnMenos:
                resultado = (valor1 - valor2);
                break;

            case R.id.btnVezes:
                resultado = (valor1 * valor2);
                break;

            case R.id.btnDividir:
                resultado = (valor1 / valor2);
                break;

            default:
                Toast.makeText(this, "Botão não identificado!!", Toast.LENGTH_SHORT).show();
                break;
        }

        _resultado.setText(String.valueOf(resultado));
    }

    public void Limpar (View v){
        _resultado.setText(R.string.txtZero);
    }
}
