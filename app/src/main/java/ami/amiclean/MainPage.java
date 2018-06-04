package ami.amiclean;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainPage extends AppCompatActivity {

     private ProgressBar pb;
     //private Switch switch1;
     private Button button;
     private LinearLayout linearlayout;
     private ToggleButton switch1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        switch1= findViewById(R.id.switch1);
        pb = findViewById(R.id.progress_bar);
        button = findViewById(R.id.button1);
        linearlayout = findViewById(R.id.horizontal_layout_error);
        linearlayout.setVisibility(View.VISIBLE);

      // define the behaviour of the switch
      switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    // the switch is on

                    Toast.makeText(getApplicationContext(),"the system is on", Toast.LENGTH_LONG).show();
                    pb.getProgress();

                }
                else {
                    Toast.makeText(getApplicationContext(), "the system is off",Toast.LENGTH_LONG).show();
                    //the switch is off
                    pb.setProgress(0);

                }
            }
        });

        //if connection problem:
        /*if .....

        // it make the last part visibile
        {linearlayout.setVisibility(View.VISIBLE);}
         */


      // button behaviour
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, ComponentState.class );
                startActivity(intent);
            }
        });




    }
}
