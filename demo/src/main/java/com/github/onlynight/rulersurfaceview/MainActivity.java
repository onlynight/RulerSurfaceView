package com.github.onlynight.rulersurfaceview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.onlynight.rulersurfaceview.library.RulerSurfaceView;

public class MainActivity extends AppCompatActivity {

    private RulerSurfaceView rulerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rulerView = (RulerSurfaceView) findViewById(R.id.rulerView);
    }
}
