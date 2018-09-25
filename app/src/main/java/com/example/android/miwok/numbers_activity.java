package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class numbers_activity extends AppCompatActivity {

    /*private MediaPlayer audio;
    public MediaPlayer.OnCompletionListener mCompletionListener=new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }


    };

    private AudioManager mAudioFocus;
    AudioManager.OnAudioFocusChangeListener audioChangeListerner=new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if(focusChange==AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange==AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK){
                audio.pause();
                audio.seekTo(0);
            }
            else if(focusChange==AudioManager.AUDIOFOCUS_GAIN){
                audio.start();
            }
            else if(focusChange==AudioManager.AUDIOFOCUS_LOSS){
                releaseMediaPlayer();
            }
        }
    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new NumbersFragment()).commit();
       /* mAudioFocus=(AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
        final ArrayList<Word> words=new ArrayList<Word>();

        words.add(new Word("one","lutti",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("two","otiiko",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("three","tolookosu",R.drawable.number_three, R.raw.number_three));
        words.add(new Word("four","oyyisa",R.drawable.number_four, R.raw.number_four));
        words.add(new Word("five","massokka",R.drawable.number_five, R.raw.number_five));
        words.add(new Word("six","temmokka",R.drawable.number_six, R.raw.number_six));
        words.add(new Word("seven","kenekaku",R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("eight","kawinta",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Word("nine","wo'e",R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("ten","na'aacha",R.drawable.number_ten, R.raw.number_ten));

        WordAdapter adapter=new WordAdapter(this,words,R.color.category_numbers);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                releaseMediaPlayer();
                int result=mAudioFocus.requestAudioFocus(audioChangeListerner, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                if(result==AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    //mAudioFocus.registerMediaButtonEventReceiver();
                    audio = MediaPlayer.create(numbers_activity.this, words.get(position).getmAudioResID());
                    audio.start();
                    audio.setOnCompletionListener(mCompletionListener);
                }
                };
            }
        );*/
    }

    /*private void releaseMediaPlayer(){
        if (audio != null) {
            audio.release();
            audio = null;
            mAudioFocus.abandonAudioFocus(audioChangeListerner);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }*/
}

