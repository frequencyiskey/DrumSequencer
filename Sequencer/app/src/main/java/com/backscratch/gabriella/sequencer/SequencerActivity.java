package com.backscratch.gabriella.sequencer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class SequencerActivity extends AppCompatActivity {

    public MediaPlayer kickWav, snareWav, hihatWav, highTomWav,
            midTomWav, lowTomWav, crashWav, clapWav;

    private int tempo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sequencer);

        kickWav = MediaPlayer.create(this, R.raw.kick);
        snareWav = MediaPlayer.create(this, R.raw.snare3);
        hihatWav = MediaPlayer.create(this, R.raw.hihat2);
        highTomWav = MediaPlayer.create(this, R.raw.high_tom);
        midTomWav = MediaPlayer.create(this, R.raw.mid_tom);
        lowTomWav = MediaPlayer.create(this, R.raw.low_tom);
        crashWav = MediaPlayer.create(this, R.raw.crash);
        clapWav = MediaPlayer.create(this, R.raw.clap);

        setTempo();
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo() {
        EditText edit = (EditText) findViewById(R.id.tempo);
        tempo = Integer.parseInt(edit.getText().toString());
    }

    public void onSeqClick(View view) {
        String btnTag = "";
        btnTag = (String) view.getTag();

        if (btnTag.contains("kick")) {
            kickWav.start();
        } else if (btnTag.contains("snare")) {
            snareWav.start();
        } else if (btnTag.contains("hihat")) {
            hihatWav.start();
        } else if (btnTag.contains("highTom")) {
            highTomWav.start();
        } else if (btnTag.contains("midTom")) {
            midTomWav.start();
        } else if (btnTag.contains("lowTom")) {
            lowTomWav.start();
        } else if (btnTag.contains("crash")) {
            crashWav.start();
        } else if (btnTag.contains("clap")) {
            clapWav.start();
        }
    }
}
