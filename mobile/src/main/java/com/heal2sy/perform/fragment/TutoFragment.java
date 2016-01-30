package com.heal2sy.perform.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.heal2sy.perform.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link TutoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TutoFragment extends Fragment {

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private Integer mParam1;
    private Integer mParam2;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param textRes Parameter 1.
     * @param imgRes Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */

    public static TutoFragment newInstance(int textRes, int imgRes) {
        TutoFragment fragment = new TutoFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, textRes);
        args.putInt(ARG_PARAM2, imgRes);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_PARAM1, -1);
            mParam2 = getArguments().getInt(ARG_PARAM2, -1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tuto, container, false);
        if(mParam2 != -1) {
            ((ImageView) v.findViewById(R.id.tuto_img)).setImageResource(mParam2);
        } else {
            v.findViewById(R.id.tuto_img).setVisibility(View.GONE);
        }
        if(mParam1 != -1) {
            ((TextView) v.findViewById(R.id.tuto_txt)).setText(mParam1);
        } else {
            v.findViewById(R.id.tuto_txt).setVisibility(View.GONE);
        }
        return v;
    }


}
