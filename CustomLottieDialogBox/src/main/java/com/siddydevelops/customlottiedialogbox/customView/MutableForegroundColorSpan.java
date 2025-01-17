package com.siddydevelops.customlottiedialogbox.customView;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/**
 * author       :   Abbas Azadi
 * created on   :   08,March,2022
 * description  :
 */
class MutableForegroundColorSpan  extends CharacterStyle implements UpdateAppearance {

    public static final String TAG = "MutableForegroundColorSpan";

    private int mColor;

    @Override
    public void updateDrawState(TextPaint tp) {
        tp.setColor(mColor);
    }

    public int getColor() {
        return mColor;
    }

    public void setColor(int color) {
        this.mColor = color;
    }
}