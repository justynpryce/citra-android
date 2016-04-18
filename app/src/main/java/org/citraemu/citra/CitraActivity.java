package org.citraemu.citra;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.zip.Inflater;

public class CitraActivity extends Activity {

    CitraView mView;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        mView = new CitraView(getApplication());
        setContentView(mView);

        View imgame_overlay = this.getLayoutInflater().inflate(R.layout.ingame_overlay, null,false);
        this.addContentView(imgame_overlay, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        // L
//        Button lbutton = new Button(this);
//        lbutton.setText("L");
//        this.addContentView(lbutton, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        // R
//        Button rbutton = new Button(this);
//        rbutton.setText("R");
//        this.addContentView(rbutton, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        // A
//        Button abutton = new Button(this);
//        abutton.setText("A");
//        this.addContentView(abutton, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        // B
//        Button bbutton = new Button(this);
//        bbutton.setText("B");
//        this.addContentView(bbutton, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        // X
//        Button xbutton = new Button(this);
//        xbutton.setText("X");
//        this.addContentView(xbutton, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        // Y
//        Button ybutton = new Button(this);
//        ybutton.setText("Y");
//        this.addContentView(ybutton, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        // HOME
//        Button homebutton = new Button(this);
//        homebutton.setText("Home");
//        this.addContentView(homebutton, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        // Select
//        Button selectbutton = new Button(this);
//        selectbutton.setText("Select");
//        this.addContentView(selectbutton, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        // Start
//        Button startbutton = new Button(this);
//        startbutton.setText("Start");
//        startbutton.setTextColor(Color.WHITE);
//        startbutton.setBackgroundColor(Color.parseColor("#33E6E1DF"));
//        this.addContentView(startbutton, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

    }

    @Override protected void onPause() {
        super.onPause();
        mView.onPause();
    }

    @Override protected void onResume() {
        super.onResume();
        mView.onResume();
    }
}