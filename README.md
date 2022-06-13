# VideoView-AndroidStudio

In Android, VideoView is used to display a video file


# Some Important Methods Used in VideoView:

1. setVideoUri(Uri uri): This method is used to set the absolute path of the video file which is going to be played. This method takes a Uri object as an argument.

Below we set the uri of video which is saved in Android Studio:


        videoView = findViewById(R.id.videoView); // initiate a video view
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.Video_name));




If wanted to Set Video From Online Web Source:

• First add internet permision in Manifest.xml file.

        <uses-permission android:name="android.permission.INTERNET" />  

if you getting error like can't play video! try this.,


        Uri uri = Uri.parse("http://abhiandroid.jobxfryqt.netdna-cdn.com/ui/wp-content/uploads/2016/04/videoviewtestingvideo.mp4");
        VideoView simpleVideoView = (VideoView) findViewById(R.id.simpleVideoView); //initiate a video view
        simpleVideoView.setVideoURI(uri);
        simpleVideoView.start();




https://user-images.githubusercontent.com/101108540/166226133-384026a3-5228-45e1-b660-4766b8219003.mp4




![demo](https://user-images.githubusercontent.com/101108540/166226251-566f3a26-82a3-415e-9d83-28f7041bf3f3.png)




