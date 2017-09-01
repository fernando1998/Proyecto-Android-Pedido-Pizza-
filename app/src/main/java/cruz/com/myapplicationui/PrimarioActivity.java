package cruz.com.myapplicationui;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class PrimarioActivity extends AppCompatActivity {

     VideoView videoView;
     Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primario);


        videoView = (VideoView)findViewById(R.id.video1);
        videoView.setMediaController(new MediaController(this));
//        videoView.setVideoURI(Uri.parse("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"));
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vid_pizza));
        videoView.start();

        btn1=(Button)findViewById(R.id.btn_order);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ordernar();
            }
        });

    }


    public void ordernar(){
        startActivity(new Intent(PrimarioActivity.this,OrdenarPizzaActivity.class));
    }
}
