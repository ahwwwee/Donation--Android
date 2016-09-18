package app.donation;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class DonationApp extends Application {

    public final int target = 10000;
    public int totalDonated = 0;
    public List<Donation> donations = new ArrayList<Donation>();
    public List<User> users = new ArrayList<>();

    public boolean newDonation(Donation donation){
        boolean targetAchieved = totalDonated > target;
        if(!targetAchieved){
            donations.add(donation);
            totalDonated += donation.amount;
        }
        else{
            Toast toast = Toast.makeText(this, "Target Exceeded!", Toast.LENGTH_SHORT);
            toast.show();
        }
        return targetAchieved;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        Log.v("Donate", "Donation App Started");
    }

    public void addUser(User user){
        users.add(user);
    }

    public boolean findByEmail(String email, String password){
        for(User u : users){
            if(email.equals(u.email) && password.equals(u.password)){
                return true;
            }
        }
        return false;
    }
}
