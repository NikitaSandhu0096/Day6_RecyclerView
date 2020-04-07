package com.example.day6_recyclerview.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.AbsListView;

import com.example.day6_recyclerview.R;
import com.example.day6_recyclerview.adapters.CountriesAdapter;
import com.example.day6_recyclerview.models.Country;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCountryList;
    private ArrayList<Country> countries;
    private CountriesAdapter countriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCountryList = findViewById(R.id.rvCountrytList);

        populateCountries();

        countriesAdapter = new CountriesAdapter(countries);
       // RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this,
        //        LinearLayoutManager.VERTICAL, true);
       // RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this,
        //        LinearLayoutManager.HORIZONTAL, true);
        // rvCountryList.setLayoutManager(mLayoutManager);

        //GridLayoutManager mGridLayoutManager = new GridLayoutManager(this, 2,
        //        RecyclerView.VERTICAL, false);
        //rvCountryList.setLayoutManager(mGridLayoutManager);

        StaggeredGridLayoutManager mStaggeredGridLayoutManager = new StaggeredGridLayoutManager(2,
                StaggeredGridLayoutManager.VERTICAL);
        rvCountryList.setLayoutManager(mStaggeredGridLayoutManager);
        rvCountryList.setAdapter(countriesAdapter);
    }

    private void populateCountries(){
        countries = new ArrayList<>();
        countries.add(new Country(1, "C1", R.drawable.ad, "Description1"));
        countries.add(new Country(2, "C2", R.drawable.ae, "Description2"));
        countries.add(new Country(3, "C3", R.drawable.af, "Description3"));
        countries.add(new Country(4, "C4", R.drawable.al, "Description4"));
        countries.add(new Country(5, "C5", R.drawable.am, "Description5"));
        countries.add(new Country(6, "C6", R.drawable.ao, "Description6"));
        countries.add(new Country(7, "C7", R.drawable.ar, "Description7"));
        countries.add(new Country(8, "C8", R.drawable.at, "Description8"));
        countries.add(new Country(9, "C9", R.drawable.au, "Description9"));
        countries.add(new Country(10, "C10", R.drawable.az, "Description10"));
        countries.add(new Country(11, "C11", R.drawable.ba, "Description11"));
        countries.add(new Country(12, "C12", R.drawable.bb, "Description12"));
        countries.add(new Country(13, "C13", R.drawable.be, "Description13"));
        countries.add(new Country(14, "C14", R.drawable.bf, "Description14"));
        countries.add(new Country(15, "C15", R.drawable.bg, "Description15"));
    }
}
