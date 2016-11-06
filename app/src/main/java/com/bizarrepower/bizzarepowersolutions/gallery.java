package com.bizarrepower.bizzarepowersolutions;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Bizarre on 07-10-2016.
 */
public class gallery extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);
        final TextView item = (TextView)findViewById(R.id.itemheading);
        final ImageView image1=(ImageView)findViewById(R.id.image1);
        final ImageView image2=(ImageView)findViewById(R.id.image2);
        final ImageView image3=(ImageView)findViewById(R.id.image3);
        final ImageView image4=(ImageView)findViewById(R.id.image4);
        final ImageButton next= (ImageButton) findViewById(R.id.next);


        Animation itemanimation= AnimationUtils.loadAnimation(getBaseContext(), R.anim.hyperspace_in);
        item.startAnimation(itemanimation);
        next.startAnimation(itemanimation);

        Animation buttonmove= AnimationUtils.loadAnimation(getBaseContext(),R.anim.itemchange);
        image1.startAnimation(buttonmove);
        image2.startAnimation(buttonmove);
        image3.startAnimation(buttonmove);
        image4.startAnimation(buttonmove);



next.setOnClickListener(new Myonclick(this));




    }
}
