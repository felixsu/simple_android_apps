package tutorial.com.felix.tutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private FactsBook factsBook = new FactsBook();
    private ColorWheel colorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView factsTextView = (TextView) findViewById(R.id.factsTextView);
        final Button showNextFactsButton = (Button)findViewById(R.id.showNextFactsButton);
        final View mainView = findViewById(R.id.mainView);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                factsTextView.setText(factsBook.getFacts());
                Tuple<Integer, Integer> tupleColor = colorWheel.getTupleColor();

                showNextFactsButton.setTextColor(tupleColor.getPrimary());
                mainView.setBackgroundColor(tupleColor.getPrimary());
                getWindow().setStatusBarColor(tupleColor.getSecondary());
            }
        };

        showNextFactsButton.setOnClickListener(listener);
    }

}
