package com.kikkos.jokepresenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        if (savedInstanceState == null){
            JokeFragment fragment = new JokeFragment();
            if (getIntent().hasExtra(getString(R.string.joke_key))){
                Bundle args = new Bundle();
                args.putString(getString(R.string.joke_key), getIntent().getStringExtra(getString(R.string.joke_key)));
                fragment.setArguments(args);
            }
            getSupportFragmentManager().beginTransaction().add(R.id.activity_joke_container, fragment).commit();
        }
    }
}
