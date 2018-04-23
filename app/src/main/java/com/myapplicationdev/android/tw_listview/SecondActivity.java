package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Module> code;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);
        code = new ArrayList<Module>();
        aa = new ModuleAdapter(this,R.layout.row, code);
        lv.setAdapter(aa);
        if (year.equals("Year 1")){
            code.add(new Module("A113",true));
            code.add(new Module("B102",true));
            code.add(new Module("C105",false));
        }else if (year.equals("Year 2")){
            code.add(new Module("B216",true));
            code.add(new Module("C202",false));
            code.add(new Module("C203",false));
        }else{
            code.add(new Module("C302",false));
            code.add(new Module("C347",false));
            code.add(new Module("A350",true));
        }

    }



}
