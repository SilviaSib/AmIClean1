package ami.amiclean;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class ComponentState extends AppCompatActivity {

    private ImageView alert0;
    private ImageView alert1;
    private ImageView alert2;
    private ImageView alert3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component_state);
          Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
          setSupportActionBar(toolbar);

          alert0= findViewById(R.id.alert_picture0);
          alert1= findViewById(R.id.alert_picture1);
          alert2= findViewById(R.id.alert_picture2);
          alert3= findViewById(R.id.alert_picture3);


          /*set all alert to invisible*/
          alert0.setVisibility(View.INVISIBLE);
          alert1.setVisibility(View.INVISIBLE);
          alert2.setVisibility(View.INVISIBLE);
          alert3.setVisibility(View.INVISIBLE);

        /*

        alert0.setVisibility(View.VISIBLE);
        alert1.setVisibility(View.VISIBLE);
        alert2.setVisibility(View.VISIBLE);
        alert3.setVisibility(View.VISIBLE);*/




    }

}
