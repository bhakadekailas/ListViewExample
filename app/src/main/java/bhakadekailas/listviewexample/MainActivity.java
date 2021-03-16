package bhakadekailas.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] countryArray = {"India", "US", "UK", "Sri Lanka", "Pakistan", "South Africa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, R.layout.row_layout_for_list,
                R.id.textView, countryArray);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
    }
}