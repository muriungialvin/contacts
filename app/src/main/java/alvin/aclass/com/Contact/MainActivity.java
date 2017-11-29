package alvin.aclass.com.Contact;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import java.util.List;

import alvin.aclass.com.contacts.R;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        /**
         * CRUD OPERATIONS
         */
        //INSERTING CONTACTS
        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Contact("Ravi","415486832147891"));
        db.addContact(new Contact("paul","415486832147891"));
        db.addContact(new Contact("mary","415486832147891"));
        db.addContact(new Contact("jane","415486832147891"));

        //reading all Contact
        Log.d("Reading: ", "Reading all Contact ..");
        List<Contact> contacts = db.getAllContacts();

        for (Contact cn : contacts){
            String log = "Id: "+cn.getID()+" ,Name: " +cn.getName()+",Phone: " +cn.getPhoneNumber();

            //writing Contact to log
            Log.d("Name: ", log);
        }
    }
}