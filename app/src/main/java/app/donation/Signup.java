package app.donation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by ari on 16/09/2016.
 */
public class Signup extends AppCompatActivity {
    private EditText firstName;
    private EditText lastName;
    private EditText email;
    private EditText password;
    public DonationApp app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        app = (DonationApp) getApplication();

        firstName = (EditText) findViewById(R.id.editFirstName);
        lastName = (EditText) findViewById(R.id.editLastName);
        email = (EditText) findViewById(R.id.editEmail);
        password = (EditText) findViewById(R.id.editPassword);
    }

    public void register(View view){
        String fName = this.firstName.getText().toString();
        String lName = this.lastName.getText().toString();
        String Email = this.email.getText().toString();
        String Password = this.password.getText().toString();

        User user = new User(fName, lName, Email, Password);
        app.addUser(user);
        startActivity(new Intent(this, login.class));
    }
}
