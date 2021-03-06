package com.example.guest.epicandroidwk1_bogglesolitaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ScoreActivity extends AppCompatActivity {
    @Bind(R.id.wordListView) ListView mWordListView;
    @Bind(R.id.scoreTextView) TextView mScoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        ButterKnife.bind(this);
        Intent intent = getIntent();

        List<String> words = (List<String>) intent.getSerializableExtra("wordList");
        int score = intent.getIntExtra("score", 0);
        mScoreView.setText(score+"");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, words);
        mWordListView.setAdapter(adapter);
    }

}
