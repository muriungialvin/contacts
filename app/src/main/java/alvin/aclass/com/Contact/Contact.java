package alvin.aclass.com.Contact;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class Contact {
    //private variables
    private int _id;
    private String _name;
    private String _phone_number;

    //empty constructor
    public Contact(){

    }

    //constructor
    public Contact(int id, String name, String _phone_number){
        this._id = id;
        this._name = name;
        this._phone_number = _phone_number;
    }

    //constructor
    public Contact(String name, String _phone_number){
        this._name = name;
        this._phone_number = _phone_number;
    }

    //getting ID
    public int getID(){
        return this._id;
    }

    //setting ID
    public void setID(int id){
        this._id = id;
    }
    //getting name
    public String getName(){
        return this._name;
    }
    //setting name
    public void setName(String name){
        this._name = name;
    }
    //getting phone number
    public String getPhoneNumber(){
        return this._phone_number;
    }
    //setting phone number
    public void setPhoneNumber(String phone_number){
        this._phone_number = phone_number;
    }

}

