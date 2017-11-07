package gas.geny.com.companion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button reh=(Button)findViewById(R.id.rehab);


    }

    public void onClick(View view)
    {
        Intent intent=new Intent(this,login_rehab_new.class);

        //final EditText applesInput=(EditText)findViewById(R.id.applesInput);
        //intent.putExtra("applesMessage",applesInput.getText().toString());
        startActivity(intent);
    }
}
