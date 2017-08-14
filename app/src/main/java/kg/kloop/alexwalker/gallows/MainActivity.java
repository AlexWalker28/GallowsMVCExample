package kg.kloop.alexwalker.gallows;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "mainActivity";
    TextView mistakeTextView;
    TextView hiddenWordTextView;
    EditText letterEditText;
    Button button;
    char letter;
    String word;
    String mistake;
    private MVCView mvcView;
    private Controller controller;
    private Model model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mistakeTextView = (TextView) findViewById(R.id.mistakesTextView);
        hiddenWordTextView = (TextView) findViewById(R.id.hiddenWordTextView);
        letterEditText = (EditText) findViewById(R.id.letterEditText);
        button = (Button) findViewById(R.id.button);

        model = new Model();
        controller = new Controller(model);
        mvcView = new MVCView(model);

        letterEditText.setMaxEms(1); // only 1 letter is allowed in editText
        word = mvcView.getHiddenWord();
        mistake = mvcView.getMistake();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                letter = letterEditText.getText().charAt(0);
                if(controller.checkLetter(letter, word)){
                    hiddenWordTextView.setText(word);
                    Log.v(TAG, "checked");
                } else {
                    mistakeTextView.setText(mistake);
                    Log.v(TAG, "mistake");
                }
                Log.v(TAG, word + "\n" + mistake);
            }
        });



    }
}
