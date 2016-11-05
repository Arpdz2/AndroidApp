package umsl.edu.androidapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
//import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener
{
    private static final int DIALOG_ALERT = 10;
    public MediaPlayer mp;
    public MediaPlayer mp2;
    public MediaPlayer mp3;
    public MediaPlayer mp4;
    public Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    public int sweetdreams;
    public int vivalavida;
    public int problem;
    public int fancy;
    //public String urlholder = "http://www.hubharp.com/web_sound/BachGavotte.mp3";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mp = MediaPlayer.create(getBaseContext(), R.raw.sweetdreams);
        mp2 = MediaPlayer.create(getBaseContext(), R.raw.vivalavida);
        mp3 = MediaPlayer.create(getBaseContext(), R.raw.problem);
        mp4 = MediaPlayer.create(getBaseContext(), R.raw.fancy);

        b1=(Button) findViewById(R.id.button);
        b2= (Button) findViewById(R.id.button2);
        b3= (Button) findViewById(R.id.button3);
        b4= (Button) findViewById(R.id.button4);
        b5= (Button) findViewById(R.id.button5);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);

        sweetdreams = 0;
        vivalavida = 0;
        problem = 0;
        fancy = 0;


        /*b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //setContentView(R.layout.secondscene);
                mp.start();
            }
        });
        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //setContentView(R.layout.secondscene);
                mp2.start();
            }
        });
        b3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //setContentView(R.layout.secondscene);
                mp3.start();
            }
        });
        b4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //setContentView(R.layout.secondscene);
                mp4.start();
            }
        });
        b5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                MainActivity.this.finish();
            }
        });*/

    }

    public void secondScene()
    {
        setContentView(R.layout.secondscene);
        b6= (Button) findViewById(R.id.button6);
        b7= (Button) findViewById(R.id.button7);
        b8= (Button) findViewById(R.id.button8);
        b9= (Button) findViewById(R.id.button9);

        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        // TODO Auto-generated method stub
        if(v.getId() == R.id.button)
        {
            secondScene();
            sweetdreams = 1;
            //showDialog(DIALOG_ALERT);
            //setContentView(R.layout.secondscene);
            /*if (v.getId() == R.id.button8)
            {
                mp.start();
            }*/
        }
        else if (v.getId() == R.id.button2)
        {
            secondScene();
            vivalavida = 1;
            //showDialog(DIALOG_ALERT);
            //setContentView(R.layout.secondscene);
            /*if (v.getId() == R.id.button8)
            {
                mp2.start();
            }*/
        }
        else if (v.getId() == R.id.button3)
        {
            secondScene();
            problem = 1;
            //showDialog(DIALOG_ALERT);
            //setContentView(R.layout.secondscene);
           /* if (v.getId() == R.id.button8)
            {
                mp3.start();
            }*/
        }
        else if (v.getId() == R.id.button4)
        {
            secondScene();
            fancy = 1;
            //showDialog(DIALOG_ALERT);
            //setContentView(R.layout.secondscene);
            /*if (v.getId() == R.id.button8)
            {
                mp4.start();
            }*/
        }
        else if (v.getId() == R.id.button5)
        {
            MainActivity.this.finish();
        }
       else if (v.getId() == R.id.button6)
        {
            if (mp.isPlaying())
            {
                mp.reset();
                mp = MediaPlayer.create(getBaseContext(), R.raw.sweetdreams);
            }
            else if(mp2.isPlaying())
            {
                mp2.reset();
                mp2 = MediaPlayer.create(getBaseContext(), R.raw.vivalavida);
            }
            else if(mp3.isPlaying())
            {
                mp3.reset();
                mp3 = MediaPlayer.create(getBaseContext(), R.raw.problem);
            }
            else if(mp4.isPlaying())
            {
                mp4.reset();
                mp4 = MediaPlayer.create(getBaseContext(), R.raw.fancy);
            }

        }
        else if (v.getId() == R.id.button7)
        {
            if (mp.isPlaying())
            {
                mp.pause();
            }
            else if(mp2.isPlaying())
            {
                mp2.pause();
            }
            else if(mp3.isPlaying())
            {
                mp3.pause();
            }
            else if(mp4.isPlaying())
            {
                mp4.pause();
            }
        }
        else if (v.getId() == R.id.button8)
        {
            if (sweetdreams == 1)
            {
                mp.start();
            }
            else if (vivalavida == 1)
            {
                mp2.start();
            }
            else if (problem == 1)
            {
                mp3.start();
            }
            else if (fancy == 1)
            {
                mp4.start();
            }
        }
        else if (v.getId() == R.id.button9)
        {

            if (mp.isPlaying())
            {
                mp.stop();
            }
            else if(mp2.isPlaying())
            {
                mp2.stop();
            }
            else if(mp3.isPlaying())
            {
                mp3.stop();
            }
            else if(mp4.isPlaying())
            {
                mp4.stop();
            }
            onCreate(new Bundle());
        }
    }



    public void onPrepared(MediaPlayer player) {
        player.start();
    }



   /* @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DIALOG_ALERT:
                Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Do you want to stop the music?");
                builder.setCancelable(true);
                builder.setPositiveButton("Yes", new OkOnClickListener());
                builder.setNegativeButton("No", new CancelOnClickListener());
                AlertDialog dialog = builder.create();
                dialog.show();
        }
        return super.onCreateDialog(id);
    }

    private final class CancelOnClickListener implements
            DialogInterface.OnClickListener
    {
        public void onClick(DialogInterface dialog, int which) {
            Toast.makeText(getApplicationContext(), "Activity will continue",
                    Toast.LENGTH_LONG).show();
        }
    }

    private final class OkOnClickListener implements
            DialogInterface.OnClickListener
    {
        public void onClick(DialogInterface dialog, int which)
        {
            MainActivity ma = new MainActivity();
            ma.mp.stop();
            MainActivity.this.finish();

        }
    }*/


     /*public void doSomething(View v)
    {

        Log.d("Austin Paul", "Button was clicked");
    }*/
}
