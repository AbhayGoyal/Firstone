package com.example.abhaygoyal.retreivingandsavingdata;

/**
 * Created by Abhay Goyal on 30-Mar-16.
 */
public class details {

    private int _id;
    private String _name;
    private int _age;
    private String _college;


    public details(String name, int age, String college) {
        this._name = name;
        this._age = age;
        this._college = college;
    }

    public int get_id() {
        return _id;
    }

    public String get_name() {
        return _name;
    }

    public int get_age() {
        return _age;
    }

    public String get_college() {
        return _college;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public void set_college(String _college) {
        this._college = _college;
    }
}

