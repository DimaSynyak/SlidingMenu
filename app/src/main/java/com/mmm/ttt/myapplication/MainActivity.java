package com.mmm.ttt.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.mmm.ttt.myapplication.tools.SlidingMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);


        SlidingMenu menu = new SlidingMenu(this);
        menu.setLayOutTop(R.layout.my_layout);
        menu.setLayOutBottom(R.layout.bottom);

        menu.setSlidingWidth(FrameLayout.LayoutParams.MATCH_PARENT);
        menu.setSlidingHeight(250);
        menu.init();
        setContentView(menu);

    }
}
