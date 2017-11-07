package com.example.abhaygoyal.mobileorder;

/**
 * Created by Abhay Goyal on 07-Jun-16.
 */
public class details {

    private int _id;
    private String _name;
    private String _password;


    public details(String name,String password) {
        this._name = name;
        this._password = password;
    }

    public int get_id() {
        return _id;
    }

    public String get_name() {
        return _name;
    }



    public String get_password() {
        return _password;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_password(String _password) {
        this._password= _password;
    }
}




