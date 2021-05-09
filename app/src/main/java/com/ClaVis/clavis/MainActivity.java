package com.ClaVis.clavis;

import androidx.annotation.IntRange;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import com.ClaVis.clavis.fracments.Activity2_2fragment;
import com.ClaVis.clavis.fracments.PianoFragment;
import com.ClaVis.clavis.model.Stats;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final String MSG_NAME = "msg_name";
    private Activity2_2fragment fragment2;
    private Integer mod;
    private Integer score;
    private Integer fails_score;
    private Random random;
    private Integer[] ids = new Integer[]{R.id.bt1,
            R.id.bt2, R.id.bt3, R.id.bt4, R.id.bt5, R.id.bt6, R.id.bt7
    ,R.id.bt8, R.id.bt9, R.id.bt10, R.id.bt11, R.id.bt12 };

    private Integer tmp;

    public static final ArrayList<Stats> statsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.Mytobbar);
        setActionBar(toolbar);
        random = new Random();
        tmp = getItemRandom();
        PianoFragment.setImage(this);

        statsList.add(new Stats("Скрепичный ключ", "основная инфа", ""));
        statsList.get(0).setList(new ArrayList<>());
        statsList.get(0).getList().add(new Stats("Введение", "Звук как физическое явление возникает от колебаний какоголибо упругого тела - например, струны (у тех инструментов, где\n" +
                "есть струны), воздушного столба (у духовых инструментов, баяна,\n" +
                "аккордеона, органа), голосовых связок у человека. Эти колебания\n" +
                "создают звуковые волны. ч\n" +
                "Звуки бывают музыкальные и шумовые. Для музыкального звука\n" +
                "главное — точная, ясно выраженная высота. Она зависит от частоты\n" +
                "звуковых колебаний: чем чаще колебания, тем звук выше.\n", null));
        statsList.add(new Stats("", "", ""));
        statsList.add(new Stats("", "", ""));


        statsList.add(new Stats("", "", ""));
        statsList.add(new Stats("", "", ""));
        statsList.add(new Stats("", "", ""));

    }
    public void setMod_id(Integer mod){
        this.mod = mod;
    }
    public Integer getItemRandom(){
        return random.nextInt(ids.length);
    }


    public synchronized void click(View v){
        PianoFragment.setImage(this);
        new Thread(()->{
            int id = v.getId();
            if (ids[tmp] == id){
                MediaPlayer mediaPlayer = PlayerSetMusic.setMusic(this, id);
                mediaPlayer.start();
                tmp = getItemRandom();

            }else {

            }



        }).start();

    }
}