package com.example.myapplication;

import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ItemDAO {

    @Query("select * from item")
    List<Item> getAll();
    @Insert
    long insert(Item item);

}
