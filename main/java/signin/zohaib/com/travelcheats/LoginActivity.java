package signin.zohaib.com.travelcheats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void gotoregister(View v)
    {
        Intent i = new Intent(getApplicationContext(),RegisterActivity.class);
        startActivity(i);
    }
}
