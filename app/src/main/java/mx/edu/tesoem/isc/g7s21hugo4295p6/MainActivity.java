package mx.edu.tesoem.isc.g7s21hugo4295p6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spestado,spdinamico;
    String[] strEstados;
    List<String> listEstados;
    ArrayAdapter<String> arrAdaptador;
    CheckBox checkBox2,checkBox3,checkBox4;
    RadioButton radioButton2,radioButton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spestado = findViewById(R.id.spestados);
        spdinamico = findViewById(R.id.spdinamico);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);


        spestado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String letrero = spestado.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this,"se selecciono " + letrero, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        strEstados = new String[]{"Baja California sur", "Chiapas", "Durango", "Aguascalientes","Yucatan"};
        listEstados = new ArrayList<String>();
        Collections.addAll(listEstados,strEstados);
        listEstados.add("Nayarit");
        arrAdaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,listEstados);
        spdinamico.setAdapter(arrAdaptador);
    }

    public void vistas (View v){

        switch (v.getId()){
            case R.id.btnprueba:
                Toast.makeText(this, "se preciono el boton", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox2:
                if (checkBox2.isChecked()){
                    Toast.makeText(this, "selecciono la casa", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "se deselecciono la casa", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox3:
                if (checkBox3.isChecked()){
                    Toast.makeText(this, "selecciono la Escuela", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox4:
                if (checkBox4.isChecked()){
                    Toast.makeText(this, "selecciono la trabajo", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.radioButton2:
                if (radioButton2.isChecked()){
                    Toast.makeText(this, "Selecciono Mujer", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.radioButton3:
                if (radioButton3.isChecked()){
                    Toast.makeText(this, "Selecciono hombre", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

}