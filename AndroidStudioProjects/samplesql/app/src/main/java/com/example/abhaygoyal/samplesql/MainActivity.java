package com.example.abhaygoyal.samplesql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText abhaysInput;
    TextView abhaysText;
    MyDBHandler dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abhaysInput=(EditText)findViewById(R.id.abhaysInput);
        abhaysText=(TextView)findViewById(R.id.abhaysText);
        dbHandler=new MyDBHandler(this, null, null, 1);
        printDatabase();

    }

    public void addButtonClicked(View view){
        Products products=new Products(abhaysInput.getText().toString());
        products.set_id(1);
        dbHandler.addProduct(products);
        printDatabase();
    }

    public void deleteButtonClicked(View view){
        String inputText=abhaysInput.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDatabase();
        //abhaysText.setText("");
    }

    public void printDatabase(){
        String dbString=dbHandler.databasetoString();
        abhaysText.setText(dbString);
        abhaysInput.setText("");
    }

}
