package com.siddydevelops.customlottiedialogbox.customView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

public class MyEditTextView extends AppCompatEditText {

    public MyEditTextView(Context context) {
        super(context);
        Typeface irSans = Typeface.createFromAsset(context.getAssets(),"iransans.ttf");
        this.setTypeface(irSans);
    }

    public MyEditTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface irSans = Typeface.createFromAsset(context.getAssets(),"iransans.ttf");
        this.setTypeface(irSans);
    }
}
