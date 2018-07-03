package net.muhendishanim.bemyeye;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.muhendishanim.bemyeye.fragment.CameraFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, CameraFragment.newInstance())
                .commit();
    }

}
