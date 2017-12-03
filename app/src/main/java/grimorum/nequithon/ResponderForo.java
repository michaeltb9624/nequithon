package grimorum.nequithon;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ResponderForo extends AppCompatActivity {
    Button respondePre;
    EditText respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responder_foro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        respondePre = findViewById(R.id.responderPre);
        respuesta = findViewById(R.id.editRespuesta);

        respondePre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(respuesta.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Debes contestar algo para poder enviar tu respuesta", Toast.LENGTH_LONG).show();

                }else {
                    Toast.makeText(getApplicationContext(), "Gracias por responder, has ganado un logro, vas por buen camino", Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });

    }

}
