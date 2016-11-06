package com.bizarrepower.bizzarepowersolutions;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Bizarre on 20-10-2016.
 */
public class ContactUs extends Activity {

    TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            checktext();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactus);
        final EditText topic = (EditText) findViewById(R.id.topic);
        final EditText mobilenumber = (EditText) findViewById(R.id.mobilenumber);
        final EditText query = (EditText) findViewById(R.id.query);

        topic.addTextChangedListener(textWatcher);
        mobilenumber.addTextChangedListener(textWatcher);
        query.addTextChangedListener(textWatcher);
        checktext();
        Button mail = (Button) findViewById(R.id.mail);
        ImageView fb=(ImageView)findViewById(R.id.fb);
        TextView fbtext=(TextView)findViewById(R.id.fbtext);
        ImageButton call = (ImageButton) findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+919400623700"));
                startActivity(call);
            }
        });
        ImageButton loc = (ImageButton) findViewById(R.id.location);
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = getResources().getString(R.string.location);
                Uri uri = Uri.parse(link);
                Intent loc = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(loc);
            }
        });

        TextView addressdesc = (TextView) findViewById(R.id.adreesdesc);
        addressdesc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = getResources().getString(R.string.location);
                Uri uri = Uri.parse(link);
                Intent loc = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(loc);
            }
        });
        TextView number = (TextView) findViewById(R.id.phonenum);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+919400623700"));
                startActivity(call);
            }
        });


        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent mail = new Intent(Intent.ACTION_SEND);
                mail.setData(Uri.parse("mailto:"));
                mail.setType("text/plain");
                mail.putExtra(Intent.EXTRA_EMAIL, new String[]{"bizarrepower@gmail.com"});
                mail.putExtra(Intent.EXTRA_SUBJECT,topic.getText().toString());
                mail.putExtra(Intent.EXTRA_TEXT,query.getText().toString()+"\n"+mobilenumber.getText().toString());
                try{
                    startActivity(Intent.createChooser(mail,"Send email.."));


                }
                catch (android.content.ActivityNotFoundException ex){

                    Toast.makeText(ContactUs.this,"No email client found",Toast.LENGTH_SHORT).show();

                }
            }
        });
fb.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String link = getResources().getString(R.string.fb);
        Uri uri = Uri.parse(link);
        Intent fblink = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(fblink);
    }
});
        fbtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = getResources().getString(R.string.fb);
                Uri uri = Uri.parse(link);
                Intent fblink = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(fblink);
            }
        });

    }

    public void checktext() {

        EditText topic = (EditText) findViewById(R.id.topic);
        EditText mobilenumber = (EditText) findViewById(R.id.mobilenumber);
        EditText query = (EditText) findViewById(R.id.query);
        Button mail = (Button) findViewById(R.id.mail);

          if (!(topic.getText().toString().trim().equals("")) && mobnum() &&
       !( query.getText().toString().trim().equals(""))) {
              mail.setEnabled(true);
        }
            else{

              mail.setEnabled(false);




          }


    }
    public Boolean mobnum(){
        EditText mobilenumber = (EditText) findViewById(R.id.mobilenumber);
        if (!(mobilenumber.getText().toString().trim().equals(""))&& mobilenumber.getText().toString().trim().length()==10){

            return true;

        }
        else return false;

    }


    }






