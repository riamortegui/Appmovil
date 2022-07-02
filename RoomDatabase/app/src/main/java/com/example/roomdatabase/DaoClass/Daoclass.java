package com.example.roomdatabase.DaoClass;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.roomdatabase.EntityClass.UserModel;

import java.util.List;

@Dao
public interface Daoclass {

    @Insert
    void insertAllData(UserModel model);

    @Query("select * from  user")
    List<UserModel> getAllData();

    @Query("delete from user where `key`= :id")
    void deleteData(int id);

    @Query("update user SET name= :name ,address =:address, phoneno =:phoneno where `key`= :key")
    void updateData(String name, String phoneno, String address, int key);


}
