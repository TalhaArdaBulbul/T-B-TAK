package com.example.tubitakproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] uygarliklar = {"Hititler","Frigler","Urartular","Lidyalılar","Mısır","Fenikeliler","İbraniler","Yunan Medeniyeti",
    "Sümerler","Babiller","Asurlar"};
    private int[] resimler = {R.drawable.resim1,R.drawable.resim2,R.drawable.resim3,R.drawable.resim4,R.drawable.resim5,R.drawable.resim6,R.drawable.resim7,R.drawable.resim8,R.drawable.resim9,R.drawable.resim10,R.drawable.resim11,R.drawable.resim12,R.drawable.resim13,R.drawable.resim14,R.drawable.resim15,R.drawable.resim16,R.drawable.resim17,R.drawable.resim18,R.drawable.resim19,R.drawable.resim20,R.drawable.resim21,R.drawable.resim22,R.drawable.resim23,R.drawable.resim24};
    private String[] tarihler = {"3000BC","2600BC","2500BC","2400BC","2300BC","2270BC","2200BC","2154BC","2000BC","1500BC","1400BC","1300BC","1274BC","1210BC","1200BC","1180BC","1170BC","1100BC","1068BC","860BC","700BC","600BC","500BC","400BC"};

    Button buttonNext,buttonPrev;
    ImageView imgView;
    TextView tvTarih;

    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView liste = (ListView) findViewById(R.id.uygarliklist);
        ArrayAdapter<String> veriAdaptor=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, uygarliklar);
        liste.setAdapter(veriAdaptor);

        tvTarih=(TextView)  findViewById(R.id.tarihText);
        imgView=(ImageView) findViewById(R.id.imageView);
        buttonNext=(Button) findViewById(R.id.nextbtn);
        buttonPrev=(Button) findViewById(R.id.geribtn);




        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgView.setImageResource(resimler[i]);
                tvTarih.setText(tarihler[i]);
                i++;
                if (i== tarihler.length){
                    i=0;
                }
            }

        });
        buttonPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgView.setImageResource(resimler[i]);
                tvTarih.setText(tarihler[i]);
                i--;
                if (i==0){
                    i=23;
                }
            }
        });
        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    startActivity(new Intent(view.getContext(),HititlerActivity.class));
                }
                if (i==1){
                    startActivity(new Intent(view.getContext(),FriglerActivity.class));
                }
                if (i==2){
                    startActivity(new Intent(view.getContext(),UrartularActivity.class));
                }
                if (i==3){
                    startActivity(new Intent(view.getContext(),LidyalilarActivity.class));
                }
                if (i==4){
                    startActivity(new Intent(view.getContext(),MisirActivity.class));
                }
                if (i==5){
                    startActivity(new Intent(view.getContext(),FenikelilerActivity.class));
                }
                if (i==6){
                    startActivity(new Intent(view.getContext(),IbranilerActivity.class));
                }
                if (i==7){
                    startActivity(new Intent(view.getContext(),YunanActivity.class));
                }
                if (i==8){
                    startActivity(new Intent(view.getContext(),SumerlerActivity.class));
                }
                if (i==9){
                    startActivity(new Intent(view.getContext(),BabillerActivity.class));
                }
                if (i==10){
                    startActivity(new Intent(view.getContext(),AsurlarActivity.class));
                }
            }
        });



    }

}