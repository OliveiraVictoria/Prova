package com.example.prova;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class activity2 extends activity {
    private Object View;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Vinculando minha view ao meu controller
        setContentView(R.layout.tela2);
    }
}