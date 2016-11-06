package com.bizarrepower.bizzarepowersolutions;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Bizarre on 15-10-2016.
 */
public class Myonclick  implements View.OnClickListener {

gallery caller;
    private int count;

    public Myonclick(gallery activity){

        this.caller=activity;
        this.count=0;



    }




    @Override
    public void onClick(View v) {
        ImageView image1 =(ImageView)caller.findViewById(R.id.image1);
        ImageView image2 =(ImageView)caller.findViewById(R.id.image2);
        ImageView image3 =(ImageView)caller.findViewById(R.id.image3);
        ImageView image4 =(ImageView)caller.findViewById(R.id.image4);
        TextView itemtype=(TextView)caller.findViewById(R.id.itemheading);
        Animation itemchange= AnimationUtils.loadAnimation(caller, R.anim.itemchange);
        image1.startAnimation(itemchange);
        image2.startAnimation(itemchange);
        image3.startAnimation(itemchange);
        image4.startAnimation(itemchange);

        count= count+1;
        switch (count) {
            case 1:

                image1.setImageResource(R.drawable.computer1);
                image2.setImageResource(R.drawable.computer2);
                image3.setImageResource(R.drawable.computer3);
                image4.setImageResource(R.drawable.computer4);
                itemtype.setText("Products & Services\n Computers");
                break;

            case 2:

                image1.setImageResource(R.drawable.printer1);
                image2.setImageResource(R.drawable.printer2);
                image3.setImageResource(R.drawable.printer3);
                image4.setImageResource(R.drawable.printer4);
                itemtype.setText("Products & Services\n Computer Accessories");
        break;


            case 3:
                image1.setImageResource(R.drawable.other1);
                image2.setImageResource(R.drawable.other2);
                image3.setImageResource(R.drawable.other3);
                image4.setImageResource(R.drawable.other4);
                itemtype.setText("Products & Services\n Other Products");

                break;
            case 4:

                image1.setImageResource(R.drawable.ups1);
                image2.setImageResource(R.drawable.ups2);
                image3.setImageResource(R.drawable.ups3);
                image4.setImageResource(R.drawable.ups4);
                itemtype.setText("Products & Services\n UPS & Inverters");
                count=0;
                break;

        }



    }
}





