package com.siddydevelops.customlottiedialogbox;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.airbnb.lottie.LottieAnimationView;

public class CustomLottieDialog {

    Context context;
    int lottieAnim;
    ConstraintLayout parentLayout;
    LottieAnimationView lottieAnimationView;
    Dialog dialog;
    GraduallyTextView mGraduallyTextView;
    String lottieBatch;

    public CustomLottieDialog(Context context, int lottieAnim) {
        this.context = context;
        this.lottieAnim = lottieAnim;

        initialize();

    }

    public CustomLottieDialog(Context context, String lottieBatch) {
        this.context = context;
        this.lottieBatch = lottieBatch;

        initializeBatch();

    }

    public void initialize() {
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.custom_dialog_item);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mGraduallyTextView = dialog.findViewById(R.id.loadingTextView);
        Typeface irSans = Typeface.createFromAsset(context.getAssets(),"iransans.ttf");
        mGraduallyTextView.setTypeface(irSans);
        parentLayout = dialog.findViewById(R.id.parentLayout);
        lottieAnimationView = dialog.findViewById(R.id.lottieAnimation);
        lottieAnimationView.setAnimation(lottieAnim);
        lottieAnimationView.setRepeatCount(100);
        dialog.setCanceledOnTouchOutside(false);
    }

    private void initializeBatch() {
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.custom_dialog_item);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mGraduallyTextView = dialog.findViewById(R.id.loadingTextView);
        Typeface irSans = Typeface.createFromAsset(context.getAssets(),"iransans.ttf");
        mGraduallyTextView.setTypeface(irSans);
        parentLayout = dialog.findViewById(R.id.parentLayout);
        lottieAnimationView = dialog.findViewById(R.id.lottieAnimation);
        dialog.setCanceledOnTouchOutside(false);

        switch (lottieBatch) {
            case "LO01":
                lottieAnimationView.setAnimation(R.raw.paperplane_animation);
                break;
            case "LO02":
                lottieAnimationView.setAnimation(R.raw.bubble_animation);
                break;
            case "LO03":
                lottieAnimationView.setAnimation(R.raw.balance_animation);
                break;
            case "LO04":
                lottieAnimationView.setAnimation(R.raw.groove_animation);
                break;
            case "LO05":
                lottieAnimationView.setAnimation(R.raw.loop_animation);
                break;
            case "LO06":
                lottieAnimationView.setAnimation(R.raw.music_animation);
                break;
            case "LO07":
                lottieAnimationView.setAnimation(R.raw.rocket_animation);
                break;
            case "LO08":
                lottieAnimationView.setAnimation(R.raw.spiral_animation);
                break;
            case "LO09":
                lottieAnimationView.setAnimation(R.raw.alarm);
                break;
            case "LO10":
                lottieAnimationView.setAnimation(R.raw.bus_error);
                break;
            case "LO11":
                lottieAnimationView.setAnimation(R.raw.bus_not_found);
                break;
            case "LO12":
                lottieAnimationView.setAnimation(R.raw.bus_wating);
                break;
            case "LO13":
                lottieAnimationView.setAnimation(R.raw.bye_question);
                break;
            case "LO14":
                lottieAnimationView.setAnimation(R.raw.custom);
                break;
            case "LO15":
                lottieAnimationView.setAnimation(R.raw.dino);
                break;
            case "LO16":
                lottieAnimationView.setAnimation(R.raw.error);
                break;
            case "LO17":
                lottieAnimationView.setAnimation(R.raw.fleet_list_loading);
                break;
            case "LO18":
                lottieAnimationView.setAnimation(R.raw.goodbye);
                break;
            case "LO19":
                lottieAnimationView.setAnimation(R.raw.lo08);
                break;
            case "LO20":
                lottieAnimationView.setAnimation(R.raw.loading);
                break;
            case "LO21":
                lottieAnimationView.setAnimation(R.raw.lock);
                break;
            case "LO22":
                lottieAnimationView.setAnimation(R.raw.map_waiting);
                break;
            case "LO23":
                lottieAnimationView.setAnimation(R.raw.no_connection);
                break;
            case "LO24":
                lottieAnimationView.setAnimation(R.raw.progressbar);
                break;
            case "LO25":
                lottieAnimationView.setAnimation(R.raw.qr);
                break;
            case "LO26":
                lottieAnimationView.setAnimation(R.raw.question);
                break;
            case "LO27":
                lottieAnimationView.setAnimation(R.raw.search);
                break;
            case "LO28":
                lottieAnimationView.setAnimation(R.raw.success);
                break;
            case "LO29":
                lottieAnimationView.setAnimation(R.raw.warning);
                break;
            case "LO30":
                lottieAnimationView.setAnimation(R.raw.wating);
                break;
            default:
                lottieAnimationView.setAnimation(R.raw.rocket_animation);
                break;
        }

        lottieAnimationView.setRepeatCount(100);
    }

    public void show() {
        dialog.show();
        mGraduallyTextView.startLoading();
    }

    public void dismiss() {
        dialog.dismiss();
    }

    public void setLottieBackgroundColor(String colorHexCode) {
        lottieAnimationView.setBackgroundColor(Color.parseColor(colorHexCode));
    }

    public void setLoadingTextColor(String colorHexCode) {
        mGraduallyTextView.setTextColor(Color.parseColor(colorHexCode));
    }

    public void setLoadingText(String customText) {
        String customTextNew = "";
        int sizeOfText = customText.length();
        if (sizeOfText < (17)) {
            StringBuilder empty = new StringBuilder();
            for (int i = 0; i < (11 - sizeOfText); i++) {
                empty.append(" ");
            }
            customTextNew = empty + customText;
        } else {
            customTextNew = customText;
        }
        mGraduallyTextView.setText(customTextNew);
    }

    public void setDialogLayoutDimensions(int width, int height) {
        float scale = context.getResources().getDisplayMetrics().density;
        ViewGroup.LayoutParams layoutParams = parentLayout.getLayoutParams();
        int widthNew = (int) (width * scale + 0.5f);
        int heightNew = (int) (height * scale + 0.5f);
        layoutParams.width = widthNew;
        layoutParams.height = heightNew;
        parentLayout.setLayoutParams(layoutParams);
    }

}
