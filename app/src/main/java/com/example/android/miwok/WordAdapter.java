package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 5/10/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResID;

    public WordAdapter(Activity context, ArrayList<Word> Words,int resID) {

        super(context, 0, Words);
        mColorResID=resID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        final Word currentWord=getItem(position);

        TextView englishWord=(TextView)listItemView.findViewById(R.id.default_text_view);
        englishWord.setText(currentWord.getDefaultTranslation());

        TextView miwokWord=(TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokWord.setText(currentWord.getMiwokTranslation());

        ImageView img = (ImageView) listItemView.findViewById(R.id.imagId);
        if(currentWord.hasImage()) {

            img.setImageResource(currentWord.getmImageResId());
            img.setVisibility(View.VISIBLE);
        }
        else {
            img.setVisibility(View.GONE);
        }

        int color= ContextCompat.getColor(getContext(),mColorResID);
        listItemView.setBackgroundColor(color);

        /*listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer audio=MediaPlayer.create(getContext(),currentWord.getmAudioResID());
                audio.start();
            }
        });*/

        return listItemView;
    }
}
