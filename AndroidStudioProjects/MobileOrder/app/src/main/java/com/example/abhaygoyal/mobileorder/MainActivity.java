package com.example.abhaygoyal.mobileorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText password;
    Button registerbutton;
    detailsHandling dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.password);
        dbHandler=new detailsHandling(this,null,null,1);


        final EditText input=(EditText)findViewById(R.id.name);
        Intent intent=new Intent(this,newintent.class);

        intent.putExtra("name",input.getText().toString());
        startActivity(intent);



        //Button registerbutton=(Button)findViewById(R.id.registerbutton);
    }

    public void onRegisterClicked(View view){
        details details1=new details(name.getText().toString(),password.getText().toString());

        //details1.set_id(1);
        dbHandler.addDetail(details1);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
