package com.example.checkout;

import android.graphics.Typeface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;


public class checkBoxFragment extends Fragment {
    //Declaration
    View view;
    public CheckBox checkBox_shopping,checkBox_payment,checkBox_order;
    public TextView textView_shopping,textView_payment,textView_order;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_check_box, container, false);

        on_fragment();//Initialization

        return view;

    }

    private void on_fragment() {
        checkBox_order = view.findViewById(R.id.checkBox_order);
        checkBox_payment = view.findViewById(R.id.checkBox_payment);
        checkBox_shopping = view.findViewById(R.id.checkBox_shipping);

        textView_order = view.findViewById(R.id.tv_order);
        textView_shopping = view.findViewById(R.id.tv_shipping);
        textView_payment = view.findViewById(R.id.tv_payment);

    }
    public void stage_1(){
        checkBox_shopping.setEnabled(false);
        checkBox_payment.setEnabled(false);
        checkBox_order.setEnabled(false);

        textView_shopping.setTypeface(null, Typeface.BOLD);

    }
    public void stage_2(){
        checkBox_shopping.setEnabled(false);
        checkBox_payment.setEnabled(false);
        checkBox_order.setEnabled(false);

        checkBox_shopping.setChecked(true);

        textView_payment.setTypeface(null, Typeface.BOLD);

    }
    public void stage_3(){
        checkBox_shopping.setEnabled(false);
        checkBox_payment.setEnabled(false);
        checkBox_order.setEnabled(false);

        checkBox_shopping.setChecked(true);
        checkBox_payment.setChecked(true);

        textView_order.setTypeface(null, Typeface.BOLD);

    }
}