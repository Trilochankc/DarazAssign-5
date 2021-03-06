package com.trilochan.darazassign_5.fragment;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Handler;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.trilochan.darazassign_5.R;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {

    public static Boolean loginStatus = false;

    EditText etPhone, etSMS;
    Button btnSend, btnLogin;
    ImageView imgLogintop;
    CardView cardView;
    TextView finalView;

    Random r = new Random();
    int i1 = r.nextInt(1245667 - 1223) + 28;


    public AccountFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // View view = inflater.inflate(R.layout.fragment_account, container, false);
        // sharedpreference here
        // SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        // String strLoginStatus = preferences.getString("statusLogin","");


        View view = inflater.inflate(R.layout.fragment_account, container, false);

        etPhone = view.findViewById(R.id.etPhone);
        etSMS = view.findViewById(R.id.etSMS);
        btnSend = view.findViewById(R.id.btnSend);
        btnLogin = view.findViewById(R.id.btnLogin);

        imgLogintop = view.findViewById(R.id.imgLogintop);
        cardView = view.findViewById(R.id.card_view);
        finalView = view.findViewById(R.id.finalMessage);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etPhone.getText()==null)
                {
                    etPhone.setError("Enter phone number");
                }
                Handler handler=new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        etSMS.setText(i1+"");
                    }
                },5000);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgLogintop.setVisibility(View.GONE);
                cardView.setVisibility(View.GONE);
                finalView.setText("LOGIN SUCCESSFUL\nGO TO HOME AND START\nSHOPPING");

                finalView.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);

            }
        });




        return view;
    }

}



