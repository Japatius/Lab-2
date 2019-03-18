package country.ex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView myListView;
    Button addBtn;
    Button removeBtn;
    EditText textEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] COUNTRIES = new String[] {
                "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra","Angola",
                "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia",
                "Aruba", "Australia", "Austria", "Azerbaijan"
        };

        myListView = (ListView) findViewById(R.id.country_list);
        addBtn = (Button) findViewById(R.id.add_btn);
        removeBtn = (Button) findViewById(R.id.remove_btn);
        textEditor = (EditText) findViewById(R.id.text_editor);

        final List<String> CountryArraylist = new ArrayList<String>(Arrays.asList(COUNTRIES));

        final ArrayAdapter<String> aa = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,
                CountryArraylist);

        myListView.setAdapter(aa);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CountryArraylist.add(textEditor.getText().toString());
                aa.notifyDataSetChanged();
            }
        });

        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CountryArraylist.remove(textEditor.getText().toString());
                aa.notifyDataSetChanged();
            }
        });
    }
}
