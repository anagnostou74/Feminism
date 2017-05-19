package gr.hellenicparliament.feminism;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.content.Intent;

import com.devbrackets.android.exomedia.EMVideoView;


public class Video extends AppCompatActivity implements MediaPlayer.OnCompletionListener {
    protected EMVideoView emVideoView;
    protected boolean pausedInOnStop = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_video);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        init();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (emVideoView.isPlaying()) {
            pausedInOnStop = true;
            emVideoView.pause();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (pausedInOnStop) {
            emVideoView.start();
            pausedInOnStop = false;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    protected void init() {
        Bundle extras = getIntent().getExtras();
        String videoId = extras.getString("videoId");

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        emVideoView = (EMVideoView) findViewById(R.id.video_play_activity_video_view);
        emVideoView.setOnCompletionListener(this);
        emVideoView.setVideoPath(videoId);
        emVideoView.setDefaultControlsEnabled(true);
        emVideoView.getBufferPercentage();
        emVideoView.getCurrentPosition();
        emVideoView.startProgressPoll();
        emVideoView.start();
    }

    @Override
    public void onCompletion(MediaPlayer player) {
        Intent p = new Intent(Video.this, MainActivity.class);
        startActivity(p);
    }
}