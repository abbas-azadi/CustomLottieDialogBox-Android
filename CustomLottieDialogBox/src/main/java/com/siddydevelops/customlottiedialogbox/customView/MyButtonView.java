package com.siddydevelops.customlottiedialogbox.customView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;


public class MyButtonView extends AppCompatButton {
    public MyButtonView(Context context) {
        super(context);
        Typeface irSans = Typeface.createFromAsset(context.getAssets(),"iransans.ttf");
        this.setTypeface(irSans);
    }

    public MyButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface irSans = Typeface.createFromAsset(context.getAssets(),"iransans.ttf");
        this.setTypeface(irSans);
    }
}
