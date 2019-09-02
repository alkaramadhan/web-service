package com.example.webservice.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.webservice.R;
import com.example.webservice.model.EvenPast;

import java.util.ArrayList;

public class MatchAdapter extends RecyclerView.Adapter<MatchHolder> {
    ArrayList<EvenPast> evenPasts = new ArrayList<>();

    @NonNull
    @Override
    public MatchHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_match,parent, false);
        return new MatchHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchHolder holder, int position) {
        holder.bindItem(evenPasts.get(position));

    }

    @Override
    public int getItemCount() {
        return evenPasts.size();
    }

    public void setEvenPasts(ArrayList<EvenPast> evenPasts) {
        this.evenPasts = evenPasts;
    }
}
