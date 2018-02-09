package gr.hellenicparliament.feminism;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.content.Intent;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class Video extends AppCompatActivity implements MediaPlayer.OnCompletionListener {
    protected boolean pausedInOnStop = false;
    private VideoView videoView;

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
        if (videoView.isPlaying()) {
            pausedInOnStop = true;
            videoView.pause();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (pausedInOnStop) {
            videoView.start();
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
        videoView = (VideoView) findViewById(R.id.video_play_activity_video_view);
        MediaController media = new MediaController(Video.this);

        videoView.setMediaController(new MediaController(this) {
            @Override
            public boolean dispatchKeyEvent(KeyEvent event) {
                if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
                    if (event.getAction() == KeyEvent.ACTION_DOWN) {
                        return true;
                    } else if (event.getAction() == KeyEvent.ACTION_UP) {
                        ((Activity) getContext()).onBackPressed();
                        return true;
                    }
                }
                return super.dispatchKeyEvent(event);
            }
        });

        //videoView.setMediaController(media);
        videoView.setVideoPath(videoId);
        videoView.getBufferPercentage();
        videoView.getCurrentPosition();
        videoView.start();
    }


    @Override
    public void onCompletion(MediaPlayer player) {
        Intent p = new Intent(Video.this, MainActivity.class);
        startActivity(p);
    }

    @Override
    public void onBackPressed() {
        // clean up or send result here
        finish();
    }
}