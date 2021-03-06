package com.example.joylee.sopt_4week;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by JoyLee on 2017-04-29.
 */

public class Fragment_Second extends Fragment {
    TextView textView;

    public Fragment_Second() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.second_fragment, container, false);
        textView = (TextView)view.findViewById(R.id.second_fragment_text);
        if(getArguments() != null)
        {
            textView.setText(getArguments().getString("title") + " Fragment");
        }
        return view;
    }
}
