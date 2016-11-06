package com.bizarrepower.bizzarepowersolutions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Bizarre on 30-09-2016.
 */
public class SplashScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.splashscreen);

        final ImageView myimage=(ImageView)findViewById(R.id.myimage);


     final Animation rotate= AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);

        myimage.startAnimation(rotate);

rotate.setAnimationListener(new Animation.AnimationListener() {
    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

        finish();
        SplashScreen.this.overridePendingTransition(0, R.anim.fadeout);
        Intent i;
        i = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(i);





    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
});
    }
}
