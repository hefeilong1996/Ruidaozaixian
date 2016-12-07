package com.neusoft.ruidaozaixian.controller.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.neusoft.ruidaozaixian.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotCourseFragment extends Fragment {


    public HotCourseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hot_course, container, false);
    }

}
