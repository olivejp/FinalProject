package com.orlanth23.androidjokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String KEY_JOKE_INTENT = "KEY_JOKE_INTENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Bundle bundle = getIntent().getExtras();
        String joke = null;
        if (bundle != null) {
            joke = bundle.getString(KEY_JOKE_INTENT);
        }

        TextView textView = findViewById(R.id.text_joke);
        textView.setText(joke);
    }
}
