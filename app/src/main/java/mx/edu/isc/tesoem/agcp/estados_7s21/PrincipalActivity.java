package mx.edu.isc.tesoem.agcp.estados_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipalActivity extends AppCompatActivity {

    Spinner splista;
    ImageView ivimagen;
    List<String> Milista = new ArrayList<>(Arrays.asList("","Veracruz", "Sonora", "Sinaloa", "Puebla", "Morelos","Campeche"));
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        splista = findViewById(R.id.splista);
        Milista.add("Estado de Mexico");

        ivimagen = findViewById(R.id.ivimagen);

        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Milista);
        splista.setAdapter(adaptador);

        splista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String valor = adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                //Glide.with(ivimagen).load("https://fastly.picsum.photos/id/237/536/354.jpg?hmac=i0yVXW1ORpyCZpQ-CknuyV-jbtU7_x9EBQVhvT5aRr0").into(ivimagen);
                if (i == 1) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1Ds1OEEZIrK3p2D2GbTYCVpjhC-JhscM3").into(ivimagen);
                } else if (i == 2) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1KCY1O26N7j-0QTXOhCuLsqxgu_tFZzqY").into(ivimagen);
                } else if (i == 3) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1lUFIvgixIUck0EUP7oKuiw68QRO6FkBW").into(ivimagen);
                } else if (i == 4) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1m6Al5Md4XhhW9qdNHZsixd4Q7tgb-kFM").into(ivimagen);
                } else if (i == 5) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1kFh1v8I4xngo2AFB2FRnPCy3W5TGY55q").into(ivimagen);
                } else if (i == 6) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1Khd1eo4nt2AOtDcxFsZAQ1I707lbJFtv").into(ivimagen);
                } else if (i == 7) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1y4BgY4vyld2KAfy20H-SJwF8m4_OAOCy").into(ivimagen);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}