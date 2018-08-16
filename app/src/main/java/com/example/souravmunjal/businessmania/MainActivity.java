package com.example.souravmunjal.businessmania;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.plattysoft.leonids.ParticleSystem;

import static android.view.animation.Animation.INFINITE;

public class MainActivity extends AppCompatActivity {
    ImageView no1,no2,no3;
    MediaPlayer m;
    ParticleSystem particlesystem2;
    ImageView img1, img2, img3, img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }
    public void onClick1(View v) {
        int i = INFINITE;
        final Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        // intent = new Intent(this,Playoffline4.class);
        Dialog dialog=new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.activity_noofplayer);
        m = MediaPlayer.create(MainActivity.this, R.raw.coinflip2);
        img1 = (ImageView) findViewById(R.id.imageView1);
        img1.setAlpha(205);
        img3 = (ImageView) findViewById(R.id.imageView);
        img3.setAlpha(205);
        no1=(ImageView) dialog.findViewById(R.id.imageView15);
        no2=(ImageView) dialog.findViewById(R.id.imageView16);
        no3=(ImageView) dialog.findViewById(R.id.imageView17);
        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent i = new Intent(MainActivity.this,Play_Offline.class);
                callpartice();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(2000);
                            particlesystem2.stopEmitting();
                            startActivity(i);
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "" + e, Toast.LENGTH_SHORT).show();
                        }
                    }
                }).start();
                m.start();

                no1.startAnimation(rotateAnimation);
            }
        });
        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent i = new Intent(MainActivity.this,Playoffline3.class);
                final ParticleSystem particlesystem2 = new ParticleSystem(MainActivity.this, 100, R.drawable.notes, 5000);
                particlesystem2.setSpeedModuleAndAngleRange(-1f, 1f, 0, 0);
                particlesystem2.setRotationSpeed(144);
                particlesystem2.setAcceleration(0.0009f, 90);
                particlesystem2.emit(1000, -350, 100);

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(2000);
                            particlesystem2.stopEmitting();
                            startActivity(i);
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "" + e, Toast.LENGTH_SHORT).show();
                        }
                    }
                }).start();
                m.start();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(600);
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "" + e, Toast.LENGTH_SHORT).show();
                        }
                    }
                }).start();

                no2.startAnimation(rotateAnimation);
            }
        });
        no3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent i = new Intent(MainActivity.this,Playoffline4.class);
                particlesystem2 = new ParticleSystem(MainActivity.this, 100, R.drawable.notes, 5000);
                particlesystem2.setSpeedModuleAndAngleRange(-1f, 1f, 0, 0);
                particlesystem2.setRotationSpeed(144);
                particlesystem2.setAcceleration(0.0009f, 90);
                particlesystem2.emit(1000, -350, 100);

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(2000);
                            particlesystem2.stopEmitting();
                            startActivity(i);
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "" + e, Toast.LENGTH_SHORT).show();
                        }
                    }
                }).start();
                m.start();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(600);
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "" + e, Toast.LENGTH_SHORT).show();
                        }
                    }
                }).start();

                no3.startAnimation(rotateAnimation);
            }
        });
        dialog.show();







        img1.startAnimation(rotateAnimation);
        m.start();
    }
    public void callpartice()
    {
        particlesystem2 = new ParticleSystem(this, 100, R.drawable.notes, 5000);
        particlesystem2.setSpeedModuleAndAngleRange(-1f, 1f, 0, 0);
        particlesystem2.setRotationSpeed(144);
        particlesystem2.setAcceleration(0.0009f, 90);
        particlesystem2.emit(1000, -350, 100);
    }
    public void onClick2(View view)
    {

    }
    public void onClick3(View view)
    {
        int i = INFINITE;
        final Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        // intent = new Intent(this,Playoffline4.class);
        Dialog dialog=new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.activity_noofplayer);
        m = MediaPlayer.create(MainActivity.this, R.raw.coinflip2);
        img1 = (ImageView) findViewById(R.id.imageView1);
        img1.setAlpha(205);
        no1=(ImageView) dialog.findViewById(R.id.imageView15);
        no2=(ImageView) dialog.findViewById(R.id.imageView16);
        no3=(ImageView) dialog.findViewById(R.id.imageView17);
        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent i = new Intent(MainActivity.this,Offlinebot3.class);
                callpartice();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(2000);
                            particlesystem2.stopEmitting();
                            startActivity(i);
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "" + e, Toast.LENGTH_SHORT).show();
                        }
                    }
                }).start();
                m.start();

                no1.startAnimation(rotateAnimation);
            }
        });
        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent i = new Intent(MainActivity.this,Playoffline3.class);
                final ParticleSystem particlesystem2 = new ParticleSystem(MainActivity.this, 100, R.drawable.notes, 5000);
                particlesystem2.setSpeedModuleAndAngleRange(-1f, 1f, 0, 0);
                particlesystem2.setRotationSpeed(144);
                particlesystem2.setAcceleration(0.0009f, 90);
                particlesystem2.emit(1000, -350, 100);

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(2000);
                            particlesystem2.stopEmitting();
                            startActivity(i);
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "" + e, Toast.LENGTH_SHORT).show();
                        }
                    }
                }).start();
                m.start();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(600);
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "" + e, Toast.LENGTH_SHORT).show();
                        }
                    }
                }).start();

                no2.startAnimation(rotateAnimation);
            }
        });
        no3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent i = new Intent(MainActivity.this,Playoffline4.class);
                particlesystem2 = new ParticleSystem(MainActivity.this, 100, R.drawable.notes, 5000);
                particlesystem2.setSpeedModuleAndAngleRange(-1f, 1f, 0, 0);
                particlesystem2.setRotationSpeed(144);
                particlesystem2.setAcceleration(0.0009f, 90);
                particlesystem2.emit(1000, -350, 100);

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(2000);
                            particlesystem2.stopEmitting();
                            startActivity(i);
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "" + e, Toast.LENGTH_SHORT).show();
                        }
                    }
                }).start();
                m.start();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(600);
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "" + e, Toast.LENGTH_SHORT).show();
                        }
                    }
                }).start();

                no3.startAnimation(rotateAnimation);
            }
        });
        dialog.show();







        img3.startAnimation(rotateAnimation);
        m.start();
    }
}
