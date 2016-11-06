package com.bizarrepower.bizzarepowersolutions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ImageButton gallery = (ImageButton)findViewById(R.id.gallery);
        final ImageButton testimonials= (ImageButton) findViewById(R.id.testimonials);
        ImageButton aboutus=(ImageButton)findViewById(R.id.aboutus);
        ImageButton contactus=(ImageButton)findViewById(R.id.contactus);
        ImageView header=(ImageView)findViewById(R.id.header);
        ImageView footer=(ImageView)findViewById(R.id.footer);
        final Animation hyperspacein= AnimationUtils.loadAnimation(getBaseContext(), R.anim.hyperspace_in);

        Animation buttonmove= AnimationUtils.loadAnimation(getBaseContext(),R.anim.buttonmove);
        header.startAnimation(hyperspacein);
        footer.startAnimation(hyperspacein);
      ImageButton[] buttons = {gallery,testimonials,aboutus,contactus};
        final Animation pushleftin= AnimationUtils.loadAnimation(getBaseContext(), R.anim.pushupleftin);
        for (ImageButton id:buttons){

            id.startAnimation(buttonmove);




        }


gallery.setOnLongClickListener(new View.OnLongClickListener() {
    @Override
    public boolean onLongClick(View v) {
       Toast.makeText(MainActivity.this,"Products & Services", Toast.LENGTH_SHORT).show();
        return false;
    }
});

aboutus.setOnLongClickListener(new View.OnLongClickListener() {
    @Override
    public boolean onLongClick(View v) {
        Toast.makeText(MainActivity.this,"About Us", Toast.LENGTH_SHORT).show();
        return false;
    }
});

        testimonials.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                Toast.makeText(MainActivity.this,"Testimonials", Toast.LENGTH_SHORT).show();


                return false;
            }
        });


        contactus.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                Toast.makeText(MainActivity.this,"Contact Us", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
gallery.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent gallery = new Intent(MainActivity.this, gallery.class);

        startActivity(gallery);
        MainActivity.this.overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
});


testimonials.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent testi = new Intent(MainActivity.this,testimonials.class);
        startActivity(testi);
        MainActivity.this.overridePendingTransition(R.anim.fadein, R.anim.fadeout);

    }
});


aboutus.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent abt = new Intent(MainActivity.this,AboutUs.class);
        startActivity(abt);
        MainActivity.this.overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
});

contactus.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent contact= new Intent(MainActivity.this,ContactUs.class);
        startActivity(contact);

        MainActivity.this.overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.info) {
            Intent inf = new Intent(MainActivity.this,Info.class);
            startActivity(inf);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
