package com.example.day6_recyclerview.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.day6_recyclerview.R;
import com.example.day6_recyclerview.models.Country;
import com.example.day6_recyclerview.ui.MainActivity;

import java.util.ArrayList;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.CountryViewHolder> {
    private ArrayList<Country> countryArrayList;

    public CountriesAdapter(ArrayList<Country> countryArrayList) {
        this.countryArrayList = countryArrayList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country,
                parent, false);
        CountryViewHolder mCountryViewHolder = new CountryViewHolder(mView);
        return mCountryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final CountryViewHolder holder, final int position) {
        Country mCountry = this.countryArrayList.get(position);
        holder.txtName.setText(mCountry.getCountryName());
        holder.imgFlag.setImageResource(mCountry.getCountryFlag());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Country c =countryArrayList.get(position);
               Toast.makeText(v.getContext(), "C : " + c.getCountryName(), Toast.LENGTH_SHORT).show();
               // Intent mIntent = new Intent(holder.itemView.getContext(), MainActivity.class);
               // holder.itemView.getContext().startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.countryArrayList.size();
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder{

        TextView txtName;
        ImageView imgFlag;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtCountryName);
            imgFlag = itemView.findViewById(R.id.imgCountryFlag);
        }
    }
}
