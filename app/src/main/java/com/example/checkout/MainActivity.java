package com.example.checkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    //Instance of fragment
    checkBoxFragment fragment = new checkBoxFragment();
   //Declaration
    EditText editText_fName,editText_lName,editText_email,editText_phoneNo;
    AutoCompleteTextView actv_country,actv_state,actv_city,actv_zipCode;
    FloatingActionButton fab_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //replacing fragment
        replaceFragment(fragment);
        //On menu
        onMenu();

        //Strings for DropDown
        String[] country = getResources().getStringArray(R.array.country);
        String[] state = getResources().getStringArray(R.array.state);
        String[] city = getResources().getStringArray(R.array.city);
        String[] zipCode = getResources().getStringArray(R.array.zipCode);
        //Setting Adapter
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,country);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,state);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,city);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,zipCode);
        actv_country.setAdapter(adapter1);
        actv_state.setAdapter(adapter2);
        actv_city.setAdapter(adapter3);
        actv_zipCode.setAdapter(adapter4);

    }


    //On ResumeFragment (interaction with fragment)
    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
        fragment.stage_1();
    }

    //Whats on Menu
    private void onMenu() {
        editText_fName = findViewById(R.id.et_fName);
        editText_lName = findViewById(R.id.et_lName);
        editText_email = findViewById(R.id.et_email);
        editText_phoneNo = findViewById(R.id.et_phoneNo);

        actv_country = findViewById(R.id.actv_country);
        actv_state = findViewById(R.id.actv_state);
        actv_city = findViewById(R.id.actv_city);
        actv_zipCode = findViewById(R.id.actv_zipCode);

        fab_1 = findViewById(R.id.fab_1);
    }

    //Replace fragment function
    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout_in_main,fragment);
        fragmentTransaction.commit();
    }
}