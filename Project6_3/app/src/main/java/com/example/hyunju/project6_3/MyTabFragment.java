package com.example.hyunju.project6_3;


import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public static class MyTabFragment extends android.support.v4.app.Fragment {
    String tabName;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle data = getArguments();
        tabName = data.getString("tabName");

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        LinearLayout baseLayout = new LinearLayout(super.getActivity());
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setLayoutParams(params);
        if (tabName == "음악별") baseLayout.setBackgroundColor(Color.RED);
        if (tabName == "가수별") baseLayout.setBackgroundColor(Color.GREEN);
        if (tabName == "앨범별") baseLayout.setBackgroundColor(Color.BLUE);
        return baseLayout;
    }
}
