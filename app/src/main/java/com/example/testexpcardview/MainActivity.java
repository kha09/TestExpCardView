package com.example.testexpcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout expView;
    Button arrowBtn;
    CardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expView = findViewById(R.id.expView);
        arrowBtn = findViewById(R.id.btnArrow);
        cardView = findViewById(R.id.cardView);
        
        arrowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(expView.getVisibility() == v.GONE){
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expView.setVisibility(v.VISIBLE);
                    arrowBtn.setBackgroundResource(R.drawable.arrowup);
                }else{
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expView.setVisibility(v.GONE);
                    arrowBtn.setBackgroundResource(R.drawable.arrowdown);
                }
            }
        });
    }
}
