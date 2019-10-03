package com.example.myapplication;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Item.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract ItemDAO itemDAO();
    private static AppDatabase INSTANCE;

    public static synchronized AppDatabase getInstance(Context ctx){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(ctx,AppDatabase.class,"compras-db").allowMainThreadQueries().fallbackToDestructiveMigration().build();
        }
    return INSTANCE;
    }

}
