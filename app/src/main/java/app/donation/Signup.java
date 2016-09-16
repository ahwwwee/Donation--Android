package app.donation;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ari on 16/09/2016.
 */
public class Signup extends AppCompatActivity {
    /*String firstName;
    String lastName;
    String email;
    String password;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public boolean register(){
        /*firstName =  findViewById(R.id.fName).toString();
        lastName = findViewById(R.id.lName).toString();
        email = findViewById(R.id.email).toString();
        password = findViewById(R.id.password).toString();

        User user = new User(firstName, lastName, email, password);*/
        Intent intent = new Intent(this, Donate.class);
        startActivity(intent);
        return true;
    }
}
