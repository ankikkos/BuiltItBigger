package com.kikkos.jokepresenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by kikkos on 12/16/2016.
 */

public class JokeFragment extends Fragment {

    private String mJoke;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null){
            mJoke = args.getString(getString(R.string.joke_key));
        }else {
            mJoke = getString(R.string.no_joke);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_joke, container, false);

        TextView tv = (TextView) rootView.findViewById(R.id.txtJoke);
        tv.setText(mJoke);

        return rootView;
    }
}
