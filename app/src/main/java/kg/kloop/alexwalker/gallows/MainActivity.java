package kg.kloop.alexwalker.gallows;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "mainActivity";
    TextView wordTextView;
    TextView mistakesTextView;
    EditText guessEditText;
    Button submitButton;
    String guess;
    private GallowsController gallowsController;
    private GallowsModel gallowsModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wordTextView = (TextView)findViewById(R.id.word_text_view);
        mistakesTextView  = (TextView)findViewById(R.id.mistakes_text_view);
        guessEditText = (EditText)findViewById(R.id.guess_edit_text);
        submitButton = (Button)findViewById(R.id.submit_button);

        gallowsModel = new GallowsModel();
        gallowsController = new GallowsController(gallowsModel);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guess = guessEditText.getText().toString();
                gallowsController.checkGuess(guess);
                wordTextView.setText(gallowsModel.getGuessResultWord());
            }
        });



    }
}
