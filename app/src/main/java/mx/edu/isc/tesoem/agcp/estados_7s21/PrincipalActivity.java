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
    List<String> Milista = new ArrayList<>(Arrays.asList("Seleccionar Estado","Veracruz", "Sonora", "Sinaloa", "Puebla", "Morelos","Campeche","Aguascalientes","Baja California","Baja California Sur","Coahuila","Colima","Chiapas","Chihuahua","Durango","Distrito Federal","Guanajuato","Guerro","Hidalgo","Jalisco","Michoacan","Nayarit","Nuevo Leon","Oaxaca","Queretaro","Quintana Roo","San luis Potesi","Tabasco","Tamaulipas","Tlaxcala","Yucatán","Zacatecas"));
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
                }else if (i == 8) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1edT9sBPIKsU1MGtpu916d5cFKqfEYW-S").into(ivimagen);
                }else if (i == 9) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=11v0hV5nB_O4JFLv_JGksmcHQVHCqX-3Q").into(ivimagen);
                }else if (i == 10) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=19Psw31wKgHJtrA-NZ82eK-wpYezspqf1").into(ivimagen);
                }else if (i ==11) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1Mv5BUgniZpY2bxa403te66Qyh0o7xQlF").into(ivimagen);
                }else if (i == 12) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1s-ebNaWtBRmWBFgmHpPiuBRd_-p8Tiqb").into(ivimagen);
                }else if (i == 13) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1UUzHX6ajS2bXR2IIUeapikP0aht2uMY3").into(ivimagen);
                }else if (i == 14) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1ELnGyII5evx9ybQzmxEcwNx3kdPgpIJP").into(ivimagen);
                }else if (i == 15) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1MkO8IVmItjMh6kFhkXye1_VJra-beskk").into(ivimagen);
                }else if (i == 16) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1lzyaPDPkE389GDVA2enTgIX2oiXTlOwo").into(ivimagen);
                }else if (i == 17) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1kWioJm-InNijCySRoimqDDuLOXe-aByf").into(ivimagen);
                }else if (i == 18) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1vdFtepnqBW8xUEP4UrKDDqhHN_2b03dG").into(ivimagen);
                }else if (i == 19) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=15FIGN3hXQhjDwGKbrRMJT7FAMb6aFin5").into(ivimagen);
                }else if (i == 20) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1q3IxL-llJBc6ZjiA2XllTkg9LSiSzIau").into(ivimagen);
                }else if (i == 21) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1MWWjjkqLdSCf2B2v15mg-9GxTr02p94m").into(ivimagen);
                }else if (i == 22) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1ww30ETQBLWWD_xwQLznPGgft5gHFE8R7").into(ivimagen);
                }else if (i == 23) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1GWz06zaqKXTFdWG5KzByWCWPwgkVWocj").into(ivimagen);
                }else if (i == 24) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1TFSvKi0PLXIidxN0i3OrUPOkITp-6cuB").into(ivimagen);
                }else if (i == 25) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1oaKN8pZIyaREDjFT7w7oONIgVsmAUVWy").into(ivimagen);
                }else if (i == 26) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1hw9o437nboWrueeS1JUB2SO3HmVyEsJQ").into(ivimagen);
                }else if (i == 27) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1kYDd5f2eiSuc7E9JrXmRL7ASrSGQ31ck").into(ivimagen);
                }else if (i == 28) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1WMHHjapaAUiy45DTBCX8Aej-vImMd2Hm").into(ivimagen);
                }else if (i == 29) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1b1Y5_m_Uay6pJK7hEccyLFa0mB-DcX_2").into(ivimagen);
                }else if (i == 30) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1ZCiE9kjyQfypfg19LidToEgjUQitoHIy").into(ivimagen);
                }else if (i == 31) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1hUxLwoYUb0axmLAcz9F-CNnupHd1qLzP").into(ivimagen);
                }else if (i == 32) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1jUxetnmmfESXBJsMyRhXS9zwCyhKYq9l").into(ivimagen);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}