package com.levirchianca.viewpager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Taniro on 25/09/2016.
 */
 public class Personagem {
    private int imagem;
    private String nome;

    public Personagem(int imagem, String nome) {
        this.imagem = imagem;
        this.nome = nome;
    }

    public static List<Personagem> getListaPersonagem(){
        List<Personagem> listaPersonagens = new ArrayList<Personagem>();
        listaPersonagens.add(new Personagem(R.drawable.img1, "Harry Potter"));
        listaPersonagens.add(new Personagem(R.drawable.img2, "Ronald Weasley"));
        listaPersonagens.add(new Personagem(R.drawable.img3, "Hermione Granger"));
        listaPersonagens.add(new Personagem(R.drawable.img4, "Draco Malfoy"));
        listaPersonagens.add(new Personagem(R.drawable.img5, "Albus Dumbledore"));
        listaPersonagens.add(new Personagem(R.drawable.img6, "Severus Snape"));
        return listaPersonagens ;
    }

    public int getImagem (){
        return this.imagem;
    }

    public String getNome (){
        return this.nome;
    }

}
