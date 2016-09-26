package com.levirchianca.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new PersonagemAdapter(this,Personagem.getListaPersonagem()));
        viewPager.addOnPageChangeListener(meulistener);
    }
    private ViewPager.OnPageChangeListener meulistener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            Log.i("Aula14","onPagerScrolled chamado,posicao:"+ position);
        }

        @Override
        public void onPageSelected(int position) {
            Log.i("Aula14","onPageselected chamado,posicao:"+ position);
            Toast.makeText(MainActivity.this, "Posicao" +position, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onPageScrollStateChanged(int state) {
            Log.i("Aula14","onPagerScrolled chamado,posicao:");
        }
    };
}
