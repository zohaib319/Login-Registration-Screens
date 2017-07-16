package signin.zohaib.com.travelcheats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Zohaib on 7/13/2017.
 */

public class RegisterActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void gotologin(View v)
    {
        finish();
    }
}

