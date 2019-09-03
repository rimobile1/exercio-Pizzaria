package br.com.pizzariahoracio;

import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

            EditText txtChopp;
            EditText txtPizzas;
            EditText txtRecheios;
            EditText txtPessoas;

    TextView txtConsumo;
    TextView txtServicos;
    TextView txtTotal;
    TextView txtPorPessoa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtChopp = findViewById(R.id.txtChopp);
        txtPizzas = findViewById(R.id.txtPizzas);
        txtRecheios = findViewById(R.id.txtRecheios);
        txtPessoas = findViewById(R.id.txtPessoas);

        txtConsumo = findViewById(R.id.txtConsumo);
        txtServicos = findViewById(R.id.txtServicos);
        txtTotal = findViewById(R.id.txtTotal);
        txtPorPessoa = findViewById(R.id.txtPorPessoa);




    }

    public  void  onCalcular(View v)
    {
        double Chopp = Double.parseDouble(txtChopp.getText().toString());
        double Pizzas = Double.parseDouble(txtPizzas.getText().toString());
        double Recheios = Double.parseDouble(txtRecheios.getText().toString());
        double Pessoas = Double.parseDouble(txtPessoas.getText().toString());


        double Consumo = (Chopp * 7.3 + Pizzas * 31.5 + Recheios * 5.9);
        txtConsumo.setText("" + Consumo);
        double Servico = (Consumo)*10/100;
        txtServicos.setText("" + Servico);
        double total = (Consumo + Servico);
        txtTotal.setText("" + total);
        double PorPessoa = (total/ Pessoas);
        txtPorPessoa.setText("" + PorPessoa);



    }
}
