package com.levirchianca.viewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Taniro on 25/09/2016.
 */
public class PersonagemAdapter extends PagerAdapter{

    Context context;
    List<Personagem> listaPersonagens;

    public PersonagemAdapter(Context context, List<Personagem> listaPersonagens){
        this.context = context;
        this.listaPersonagens = listaPersonagens;
    }

    /*
    * Insctancia a próxima view que será exibida.
     */

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        Log.i("AULA14", "chamou instantiateItem, posição = "+ position);
        View view = LayoutInflater.from(context).inflate(R.layout.item_personagem_inflater,container,false);
        ImageView img = (ImageView) view.findViewById(R.id.imagemPersonagem);
        img.setImageResource(listaPersonagens.get(position).getImagem());
        container.addView(view);
        return view;
    }
    /*
    * Destroi um item da ViewPager para otimizar memória.
     */

    @Override
    public void destroyItem(ViewGroup container, int position, Object view){
        Log.i("AULA14", "chamou destroyItem, posição = "+ position);
        container.removeView((View) view);
    }
    /*
    * Informa o número de itens do adapter
     */

    @Override
    public int getCount() {
        return listaPersonagens != null ? listaPersonagens.size() : 0;
    }

    /*
    * Valida se a view informada como parâmetro é igual ao objeto-chave informado.
     */
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    /*
    * Esse método deve ser implementado quando queremos adicionar uma android.support.v4.view.PagerTitleStrip.
    * Nenhuma outra implementação é necessária. Basta que esse adapter esteja ligado ao pagerView.
     */

    @Override
    public CharSequence getPageTitle(int position){
        return listaPersonagens.get(position).getNome();
    }


}