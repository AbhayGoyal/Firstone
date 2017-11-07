package gas.geny.com.companion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.util.Scanner;

public class basic_chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_chat);

        EditText txt1=(EditText)findViewById(R.id.textinput);
        EditText txt2=(EditText)findViewById(R.id.textshow);
        Scanner sc=new Scanner(System.in);
        StringBuffer s=new StringBuffer();
        s.append("Yes");
        txt1.setText("wanna play a game");
        String s1=txt2.getText().toString();
        if(s.indexOf(s1)!=-1)
        {
            Intent intent=new Intent(this,image_find.class);
        }
        else
        {
            System.out.println("Should i enter"+s1+"into mu memory");
            if(sc.next().toString().equals("Yes"))
            {
                s.append(s1);
            }

        }
    }
}
