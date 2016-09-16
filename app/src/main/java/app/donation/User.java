package app.donation;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by ahwww on 16/09/2016.
 */
public class User extends AppCompatActivity{
    String firstName;
    String lastName;
    String email;
    String password;

    public User(String firstName, String lastName, String email, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}

