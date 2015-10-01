package com.aviabooking.DAO;

import com.aviabooking.DAO_impl.UserDAOImpl;

/**
 * Created by vataga on 01.10.2015.
 */
public class Factory {
    private static UserDAO userDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public UserDAO getUserDAO(){
        if (userDAO == null){
            userDAO = new UserDAOImpl();
        }
        return userDAO;
    }
}

