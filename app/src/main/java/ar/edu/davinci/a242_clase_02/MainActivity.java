package ar.edu.davinci.a242_clase_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "activity-filter";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Hello Worlds!!");
        TextView main_text = findViewById(R.id.main_text);
        main_text.setText(R.string.main_text_final);
    }
}