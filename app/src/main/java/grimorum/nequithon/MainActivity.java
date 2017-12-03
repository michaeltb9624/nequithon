package grimorum.nequithon;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Typeface bold, cursiva;
    TextView titulo,bienvenido,frase;
    ImageButton explorar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cursiva=Typeface.createFromAsset(getAssets(),"fonts/avenirnextltprodemiIt.otf");
        bold=Typeface.createFromAsset(getAssets(),"fonts/avenirnextltprobold.otf");
        explorar = findViewById(R.id.explorar);
        explorar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplication(), Guia.class);
                startActivity(i);

            }
        });


    }

}
