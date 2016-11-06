package com.bizarrepower.bizzarepowersolutions;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bizarre on 17-10-2016.
 */
public class testimonials extends Activity {

    private String [] clientnames;
    private int[] images={R.drawable.temple,
            R.drawable.govtorg,
            R.drawable.hospital,
            R.drawable.govtorg
           , R.drawable.organisation,
            R.drawable.college,
            R.drawable.college,
            R.drawable.college,
            R.drawable.college,
            R.drawable.college,
            R.drawable.govtorg,
            R.drawable.college,
            R.drawable.college,
            R.drawable.govtorg};
private String[] clientmessage;

    List<Rowitem> rowitems;

ListView mylist;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

  setContentView(R.layout.testimonials);
        clientnames=getResources().getStringArray(R.array.clientnames);
        clientmessage=getResources().getStringArray(R.array.clientmessages);
        rowitems = new ArrayList<Rowitem>();
for (int i=0;i<clientnames.length;i++){

    Rowitem item= new Rowitem(images[i],clientnames[i],clientmessage[i]);
    rowitems.add(item);

}
        ListView mylist= (ListView)findViewById(R.id.listView);
Myadapter myadapter = new Myadapter(this,R.layout.listrow,rowitems);
        mylist.setAdapter(myadapter);
    }
}
