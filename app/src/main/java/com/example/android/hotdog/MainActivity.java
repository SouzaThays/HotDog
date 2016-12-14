package com.example.android.hotdog;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int quantidadeDog = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void incrementa(View view) {
        quantidadeDog = quantidadeDog + 1;
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantidade);
        quantityTextView.setText("" + quantidadeDog);
    }

    public void decremento(View view) {
        quantidadeDog = quantidadeDog - 1;
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantidade);
        quantityTextView.setText("" + quantidadeDog);
    }

    public void submit(View view){
        EditText nomeCliente = (EditText) findViewById(R.id.name_cliente);
        String name = nomeCliente.getText().toString();


        CheckBox batataPalhaCheckBox = (CheckBox) findViewById(R.id.batata_palha_checkbox);
        boolean batataPalha= batataPalhaCheckBox.isChecked();

        CheckBox baconCheckBox = (CheckBox) findViewById(R.id.bacon_checkbox);
        boolean bacon= baconCheckBox.isChecked();

        CheckBox frangoCheckBox = (CheckBox) findViewById(R.id.frango_checkbox);
        boolean frango= frangoCheckBox.isChecked();

        CheckBox vinaCheckBox = (CheckBox) findViewById(R.id.vina_checkbox);
        boolean vina= vinaCheckBox.isChecked();

        CheckBox queijoCheckBox = (CheckBox) findViewById(R.id.queijo_checkbox);
        boolean queijo= queijoCheckBox.isChecked();

        int preco = calculatePreco(batataPalha, bacon, frango, vina, queijo);

        String princMessage = "Name: " + name;
        if(batataPalha == true){
            princMessage = princMessage + "\nIngrediente: Batata Palha" ;
        }

        if(bacon == true){
            princMessage = princMessage + "\nIngrediente: Bacon" ;
        }

        if(frango == true){
            princMessage = princMessage + "\nIngrediente: Frango" ;
        }
        if(vina == true){
            princMessage = princMessage + "\nIngrediente: Vina" ;
        }
        if(queijo == true){
            princMessage = princMessage + "\nIngrediente: Queijo" ;
        }

        princMessage = princMessage + "\nQuantidade:" + quantidadeDog;
        princMessage = princMessage + "\nTotal: $" + preco;

        TextView orderSummaryTextView = (TextView) findViewById(R.id.pedidos);
        orderSummaryTextView.setText(princMessage);


    }



    /**
     * Calculates the price of the order based on the current quantity.
     *
     * @return the price
     */
    private int calculatePreco(Boolean batataPalha, Boolean bacon, Boolean frango, Boolean vina, Boolean queijo) {
        int preco = 5;
        if (batataPalha == true)
            preco = preco + 1;
        if (bacon == true)
            preco = preco + 3;
        if (frango == true)
            preco = preco + 2;
        if (vina == true)
            preco = preco + 1;
        if (queijo == true)
            preco = preco + 2;

        return quantidadeDog * preco;
    }





}
