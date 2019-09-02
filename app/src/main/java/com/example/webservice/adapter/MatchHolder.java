package com.example.webservice.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.webservice.R;
import com.example.webservice.model.EvenPast;

public class MatchHolder extends RecyclerView.ViewHolder {
    TextView textViewAway;
    TextView textViewHome;

    public MatchHolder(@NonNull View itemView) {
        super(itemView);
        textViewHome = itemView.findViewById(R.id.tv_home);
        textViewAway = itemView.findViewById(R.id.tv_away);
    }

    public void bindItem(EvenPast evenPast){


        textViewHome.setText(evenPast.getStrHomeTeam());
        textViewAway.setText(evenPast.getStrAwayTeam());
    }
}
