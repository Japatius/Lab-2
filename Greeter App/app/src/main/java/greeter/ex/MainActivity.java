package greeter.ex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textInput;
    Button suomiBtn;
    Button svenskaBtn;
    Button englishBtn;
    Button surpriseBtn;
    TextView greetingsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput = (EditText) findViewById(R.id.text_editor);
        suomiBtn = (Button) findViewById(R.id.suomi_button);
        svenskaBtn = (Button) findViewById(R.id.svenska_button);
        englishBtn = (Button) findViewById(R.id.english_button);
        surpriseBtn = (Button) findViewById(R.id.surprise_button);
        greetingsText = (TextView) findViewById(R.id.greeter_view);

        suomiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userText = textInput.getText().toString();
                greetingsText.setText("Moro " + userText + "!");
            }
        });

        svenskaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userText = textInput.getText().toString();
                greetingsText.setText("Hallå " + userText + "!");
            }
        });

        englishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userText = textInput.getText().toString();
                greetingsText.setText("Hello " + userText + "!");
            }
        });

        surpriseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userText = textInput.getText().toString();
                greetingsText.setText("Привет " + userText + "!");
            }
        });
    }
}
