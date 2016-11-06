package com.bizarrepower.bizzarepowersolutions;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Bizarre on 18-10-2016.
 */
public class Myadapter extends ArrayAdapter<Rowitem>  {
    Context context;
    public Myadapter(Context context, int resourceId,List<Rowitem> rowitems) {
        super(context,R.layout.listrow, resourceId,rowitems);
        this.context=context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Animation buttonmove= AnimationUtils.loadAnimation(context, R.anim.listviewanim);
        LayoutInflater myinflater= LayoutInflater.from(getContext());

View myView= myinflater.inflate(R.layout.listrow, parent, false);
        Rowitem rowitem=getItem(position);
        TextView title=(TextView) myView.findViewById(R.id.itemheader);
        TextView desc=(TextView)myView.findViewById(R.id.desc);
        ImageView icon=(ImageView)myView.findViewById(R.id.clientimage);
        title.setText(rowitem.getTitle() );
        title.setAnimation(buttonmove);
        desc.setText(rowitem.getDesc());
        desc.setAnimation(buttonmove);
        icon.setImageResource(rowitem.getImageid());
        icon.setAnimation(buttonmove);
        return myView;
    }
}
