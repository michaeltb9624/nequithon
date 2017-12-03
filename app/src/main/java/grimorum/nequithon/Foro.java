package grimorum.nequithon;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Foro extends AppCompatActivity {
    Button responderForo,responderForo2;
    Typeface bold,regular;
    TextView titulo,pre1,res1,pre2,res2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foro);
        bold= Typeface.createFromAsset(getAssets(),"fonts/avenirnextltprobold.otf");
        regular=Typeface.createFromAsset(getAssets(),"fonts/avenirextltproregular.otf");
        responderForo = findViewById(R.id.responder);
        responderForo2 = findViewById(R.id.responder2);
        titulo = findViewById(R.id.tituloforo);
        pre1 = findViewById(R.id.person_age);
        pre2 = findViewById(R.id.person_name);
        res1 = findViewById(R.id.card2);
        res2 = findViewById(R.id.pregunta);
        res2.setTypeface(bold);
        pre2.setTypeface(bold);
        titulo.setTypeface(bold);

        pre1.setTypeface(regular);
        res1.setTypeface(regular);



        responderForo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplication(),ResponderForo.class);

                startActivity(i);
                finish();
            }
        });
    }
}
