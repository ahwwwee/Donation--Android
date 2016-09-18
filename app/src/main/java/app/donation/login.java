package app.donation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ari on 16/09/2016.
 */
public class login extends AppCompatActivity {
    TextView email;
    TextView password;
    private DonationApp app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        app = (DonationApp) getApplication();

        email = (TextView) findViewById(R.id.logEmail);
        password = (TextView) findViewById(R.id.logpassword);
    }

    public void signin(View view){
        String Email = this.email.getText().toString();
        String Password = this.password.getText().toString();
        if(app.findByEmail(Email, Password )) {
            startActivity(new Intent(this, Donate.class));
        }
        email.setText("");
        password.setText("");
    }
}
