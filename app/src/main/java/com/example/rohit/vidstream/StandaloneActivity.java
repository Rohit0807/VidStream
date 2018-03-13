package com.example.rohit.vidstream;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

/**
 * Created by ROHIT on 07-03-2018.
 */

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_standalone);

        Button btnPlayVideo =findViewById(R.id.btnPlayVideo);
        Button btnPlaylist=findViewById(R.id.btnPlaylist);

        btnPlayVideo.setOnClickListener(this);
        btnPlaylist.setOnClickListener(this);

//        View.OnClickListener onClickListener=new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//
//        }
//    };
//        btnPlayVideo.setOnClickListener(onClickListener);
//        btnPlaylist.setOnClickListener(onClickListener);

}

    @Override
    public void onClick(View view) {
        Intent intent=null;
        switch (view.getId()){
            case R.id.btnPlayVideo:
                intent= YouTubeStandalonePlayer.createVideoIntent(this,YouTubeActivity.GOOGLE_API_KEY,YouTubeActivity.YOUTUBE_VIDEO_ID,0,true,false);
                break;

            case R.id.btnPlaylist:
                intent=YouTubeStandalonePlayer.createPlaylistIntent(this,YouTubeActivity.GOOGLE_API_KEY,YouTubeActivity.YOUTUBE_PLAYLIST,0,0,true,true);
                break;

                default:

        }
        if (intent!=null){
            startActivity(intent);
        }
    }
}
