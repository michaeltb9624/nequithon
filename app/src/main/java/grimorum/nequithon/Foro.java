package grimorum.nequithon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Foro extends AppCompatActivity {
    Button responderForo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foro);
     responderForo = findViewById(R.id.responder);

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
