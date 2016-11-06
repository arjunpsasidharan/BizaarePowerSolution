package com.bizarrepower.bizzarepowersolutions;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Bizarre on 19-10-2016.
 */
public class AboutUs extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
setContentView(R.layout.aboutus);

        final Animation pushleftin= AnimationUtils.loadAnimation(getBaseContext(), R.anim.pushupleftin);
        TextView mission= (TextView)findViewById(R.id.mission);
        mission.setAnimation(pushleftin);
        TextView vision = (TextView)findViewById(R.id.vision);
        vision.setAnimation(pushleftin);
    }
}



