package ami.amiclean;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class CleaningRating extends AppCompatActivity {

   Button ratingbutton;
    RatingBar ratingstar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning_rating);

        ratingstar = findViewById(R.id.rating_bar);
        ratingbutton = findViewById(R.id.submit_button);

        /*TODO: to fix when rating trend page is added*/


        /*TODO: need to store the values of the rating */
        // get the value of the rating and it is show in a toast
        ratingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
               public void onClick(View v) {
                   // get values and then displayed in a toast
                   String totalStars = "Total Stars:: " + ratingstar.getNumStars();
                   String rating = "Rating :: " + ratingstar.getRating();
                   Toast.makeText(getApplicationContext(), totalStars + "\n" + rating, Toast.LENGTH_LONG).show();
                                            }});

        /*ratingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(CleaningRating.this, RatingTrend.class );
                startActivity(intent1);
            }
        });*/
    }
}
