package com.siddydevelops.customlottiedialogbox.customView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class MyTextView extends AppCompatTextView {
    public MyTextView(Context context) {
        super(context);
        Typeface irSans = Typeface.createFromAsset(context.getAssets(),"iransans.ttf");
        this.setTypeface(irSans);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Typeface irSans = Typeface.createFromAsset(context.getAssets(),"iransans.ttf");
        this.setTypeface(irSans);
    }
}
