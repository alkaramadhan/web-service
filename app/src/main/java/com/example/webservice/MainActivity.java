package com.example.webservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.webservice.adapter.MatchAdapter;
import com.example.webservice.model.EvenPast;
import com.example.webservice.presenter.EventPastContract;
import com.example.webservice.presenter.EventPastPresenter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements EventPastContract {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EventPastPresenter eventPastPresenter = new EventPastPresenter(this);
        eventPastPresenter.index();
    }

    @Override
    public void listMatch(ArrayList<EvenPast> evenPasts) {
        MatchAdapter matchAdapter = new MatchAdapter();
        matchAdapter.setEvenPasts(evenPasts);
        RecyclerView recyclerView = findViewById(R.id.rv_match);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(matchAdapter);
    }
}
