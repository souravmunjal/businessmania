package com.example.souravmunjal.businessmania;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ticketlist extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticketlist);
        listView=(ListView) findViewById(R.id.listview);
    }
    public static class MyAdapter extends ArrayAdapter
    {
        List<String> countryname=new ArrayList<String>();
        List<String> countryrent=new ArrayList<String>();
        List<String> house1cost=new ArrayList<String>();
        List<String> house2cost=new ArrayList<String>();
        List<String> house1rent=new ArrayList<String>();
        List<String> house2rent=new ArrayList<String>();
        List<String> countrysell=new ArrayList<String>();
        List<String> color=new ArrayList<String>();
        List<String> countrypic=new ArrayList<String>();
        int pos;
        public MyAdapter(@NonNull Context context, List<String> countryname, List<String> countryrent, List<String> house1cost, List<String> house2cost, List<String> house1rent, List<String> house2rent, List<String> countrysell, List<String> countrypic, List<String> color, int position)
        {
            super(context,R.layout.tickets,R.id.textView34,countryname);
            this.countryname=countryname;
            this.countryrent=countryrent;
            this.house1cost=house1cost;
            this.house2cost=house2cost;
            this.house1rent=house1rent;
            this.house2rent=house2rent;
            this.countrysell=countrysell;
            this.countrypic=countrypic;
            this.color=color;
            pos=position;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
        {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            View view = layoutInflater.inflate(R.layout.tickets, parent, false);

            TextView CountryName = (TextView) view.findViewById(R.id.textView15);
            TextView CountryRent = (TextView) view.findViewById(R.id.textView25);
            TextView House1Cost = (TextView) view.findViewById(R.id.textView26);
            TextView House2Cost = (TextView) view.findViewById(R.id.textView27);
            TextView House1Rent = (TextView) view.findViewById(R.id.textView28);
            TextView House2Rent = (TextView) view.findViewById(R.id.textView29);
            TextView CountrySell = (TextView) view.findViewById(R.id.textView31);
            ImageView CountryPic = (ImageView) view.findViewById(R.id.imageView68);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.tickets);
            CountryName.setText("" + countryname.get(position).toString());
            CountryRent.setText("" + countryrent.get(position).toString());
            House1Cost.setText("" + house1cost.get(position).toString());
            House2Cost.setText("" + house2cost.get(position).toString());
            House1Rent.setText("" + house1rent.get(position).toString());
            House2Rent.setText("" + house2rent.get(position).toString());
            CountrySell.setText("" + countrysell.get(position).toString());
            CountryPic.setImageResource(Integer.parseInt(String.valueOf(countrypic.get(position))));
            relativeLayout.setBackgroundColor(Color.parseColor(String.valueOf(color.get(position))));
            return view;

        }
    }


}
