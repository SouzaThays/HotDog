package com.example.android.hotdog.entity;

/**
 * Created by thays on 26/07/2016.
 */
public class HotDog {
    private String sabor;
    private int quantidade;
    private int preço;

    public HotDog(String sabor, int quantidade, int preço) {
        this.sabor = sabor;
        this.quantidade = quantidade;
        this.preço = preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }



    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }


}
