package com.example.video;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //for playing video.
        VideoView v1 = findViewById(R.id.v1);
        v1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
    //for controlling video by button
        MediaController mediaController=new MediaController(this);
        v1.setMediaController(mediaController);
        mediaController.setAnchorView(v1);
        v1.start();
    }
}

/*how to add video.mp4 in android studio
  steps:-
        1. res->new->Android Resource Directory
        give any file_name .,but Resource type should be selected as a raw.
        it will generate new file as a row in res folder.
        2.copy and paste the video.mp4 in raw file. remember that name of video should contain lowercase only.
        3.Now add new widget(VideoView) in .xml file.
        4.In .java file types this code;-
           VideoView v1 = findViewById(R.id.v1);
           v1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
           v1.start();
   */