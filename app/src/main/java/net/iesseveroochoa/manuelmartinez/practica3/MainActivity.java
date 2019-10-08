package net.iesseveroochoa.manuelmartinez.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch swNegrita;
    CheckBox cbCursiva;
    TextView tvNombre;
    RadioButton rbSans;
    RadioButton rbSerif;
    RadioButton rbMonospace;
    TextView tvTamanioNumero;
    SeekBar sbTamanio;

    /**
     * Metodo Cambiar letra a negrita
     *
     */

    /*private boolean definirFuente(){
        tvNombre = (TextView) findViewById(R.id.tvNombre);

        if (!swNegrita.isChecked()&& !cbCursiva.isChecked()){
            tvNombre.setTypeface(Typeface.SANS_SERIF);
            if (cbCursiva.isChecked() && swNegrita.isChecked()){
                tvNombre.setTypeface(null,Typeface.BOLD_ITALIC);
                //text style(bold & italic)
            }
        }else if (!swNegrita.isChecked() && ){
            tvNombre.setTypeface(null,Typeface.ITALIC); //only font style ITALIC
            if (cbCursiva.isChecked()){

            }

        }

        tvNombre.setTypeface(null,Typeface.BOLD_ITALIC); //only text style(bold & italic)
        tvNombre.setTypeface(Typeface.SANS_SERIF,Typeface.BOLD);
        //font style & text style(only bold)




        return true;
    }*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swNegrita=findViewById(R.id.swNegrita);
        cbCursiva=findViewById(R.id.cbCursiva);
        tvNombre=findViewById(R.id.tvNombre);
        rbSans=findViewById(R.id.rbSans);
        rbSerif=findViewById(R.id.rbSerif);
        rbMonospace=findViewById(R.id.rbMonospace);
        tvTamanioNumero=findViewById(R.id.tvResultadoTamanio);
        sbTamanio=findViewById(R.id.sbTamanio);

        swNegrita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }

}
