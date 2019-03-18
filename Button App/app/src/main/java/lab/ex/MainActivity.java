package lab.ex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Button gameBtn = new Button(this);
        setContentView(gameBtn);
        gameBtn.setText("Hello, im the button now!!");

        gameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter ++;
                gameBtn.setText("Pressed " + counter + " times, keep going!");

            }
        });
    }
}
