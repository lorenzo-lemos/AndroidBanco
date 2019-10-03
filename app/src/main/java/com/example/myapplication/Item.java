package com.example.myapplication;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Item {
    @PrimaryKey(autoGenerate = true)
    private long id;
    @ColumnInfo(name = "nome_item")
    private String nome;
    @ColumnInfo(name = "qtde_item")
    private int qtde;
    

    public Item(String nome, int qtde) {
        this.nome = nome;
        this.qtde = qtde;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public Item(){

    }
}
