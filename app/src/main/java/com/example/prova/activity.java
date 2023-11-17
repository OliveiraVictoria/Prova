package com.example.prova;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class activity extends android.app.Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Vinculando minha view ao meu controller
        setContentView(R.layout.tela1);
        Button buttonCliqueAqui = findViewById(R.id.button2);
        buttonCliqueAqui.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                new Intent(activity.this, activity2.class);

            }
        });
    }
}