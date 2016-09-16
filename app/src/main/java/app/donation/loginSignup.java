package app.donation;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by ari on 16/09/2016.
 */
public class loginSignup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginsignup);
    }

    public boolean loginRender()
    {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
        return true;
    }

    public boolean signupRender()
    {
        Intent intent = new Intent(this, Signup.class);
        startActivity(intent);
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_donate, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.menuReport : startActivity (new Intent(this, Report.class));
                break;
            case R.id.menuDonate : startActivity (new Intent(this, Donate.class));
                break;
        }
        return true;
    }
}
