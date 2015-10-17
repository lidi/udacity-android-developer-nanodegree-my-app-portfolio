package pm.diu.liutauras.myportfolioapp;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void launchSpotifyStreamer(View view) {
        //Placeholder for SpotifyStreamerLauncher
    }

    public void launchScoresApp(View view) {
        //Placeholder for ScoresAppLauncher
    }

    public void launchLibraryApp(View view) {
        //Placeholder for LibraryAppLauncher
    }

    public void launchBuilditBigger(View view) {
        //Placeholder for BuilditBiggerLauncher
    }

    public void launchXyzReader(View view) {
        //Placeholder for XyzReaderLauncher
    }

    public void launchCapstoneApp(View view) {
        //Placeholder for CapstoneAppLauncher
        //Toast
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.capstoneToastMsg);
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }
}
