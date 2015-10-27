package tutorial.com.felix.tutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Toast message = Toast.makeText(this, "button pressed!", LENGTH_SHORT);
        final TextView factsTextView = (TextView) findViewById(R.id.factsTextView);
        final Button showNextFactsButton = (Button)findViewById(R.id.showNextFactsButton);
        final View mainView = findViewById(R.id.mainView);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                factsTextView.setText(FactsBook.getFacts());
                Tuple<Integer, Integer> tupleColor = ColorWheel.getTupleColor();

                showNextFactsButton.setTextColor(tupleColor.getPrimary());
                mainView.setBackgroundColor(tupleColor.getPrimary());
                getWindow().setStatusBarColor(tupleColor.getSecondary());
                message.show();
            }
        };

        showNextFactsButton.setOnClickListener(listener);
        Log.d(TAG, "onCreate method called");
    }

}
