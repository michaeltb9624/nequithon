package grimorum.nequithon;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Retos extends AppCompatActivity {
    TextView contacts,foro,pesitos, solo1,solo2,yosolito, lista,clan;
    CheckBox checkforo,checkPesitos;
    Button botonForo, botonPesitos;
    ImageView cargando;
    Typeface bold,regular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retos);

        bold=Typeface.createFromAsset(getAssets(),"fonts/avenirnextltprobold.otf");
        regular=Typeface.createFromAsset(getAssets(),"fonts/avenirnextltproregular.otf");
        contacts = findViewById(R.id.acceso_a_contactos);

        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        }}
        );
        cargando= findViewById(R.id.cargando);
        foro = findViewById(R.id.forotext);
        checkforo = findViewById(R.id.checkForo);
        botonForo = findViewById(R.id.buttonforo);
        solo1 = findViewById(R.id.solo1);
        solo1.setTypeface(regular);
        lista= findViewById(R.id.listaretos);
        lista.setTypeface(bold);
        solo2 = findViewById(R.id.solo2);
        solo2.setTypeface(regular);
        contacts.setTypeface(regular);
        foro.setTypeface(regular);
        yosolito = findViewById(R.id.yosolito);
        yosolito.setTypeface(bold);
        clan = findViewById(R.id.clan);
        clan.setTypeface(bold);



        foro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getApplicationContext(),Foro.class);
                checkforo.setChecked(true);
                foro.setEnabled(false);
                botonForo.setEnabled(false);
                cargando.setImageResource(R.drawable.c30);
                startActivity(i);
            }
        });



        pesitos = findViewById(R.id.pesitosText);
        checkPesitos = findViewById(R.id.pesitosCheck);
        botonPesitos = findViewById(R.id.pesitosButton);
        pesitos.setTypeface(regular);
        pesitos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getApplicationContext(),ActPesitos.class);
                checkPesitos.setChecked(true);
                pesitos.setEnabled(false);
                botonPesitos.setEnabled(false);
                cargando.setImageResource(R.drawable.c10pana);
                startActivity(i);
            }
        });



    }

}
