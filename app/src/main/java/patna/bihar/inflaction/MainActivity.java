package patna.bihar.inflaction;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import patna.bihar.inflaction.activity.ChangePassword;
import patna.bihar.inflaction.activity.FirstStepActivity;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn = (BottomNavigationView) findViewById(R.id.navigation);
        bn.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.navigation_new_register:

                        startActivity(new Intent(getApplicationContext(), FirstStepActivity.class));
                        break;

                    case R.id.navigation_change_password:
                        startActivity(new Intent(getApplicationContext(), ChangePassword.class));
                        break;




                }
                return true;
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }


}
