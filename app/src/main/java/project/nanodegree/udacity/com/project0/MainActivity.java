package project.nanodegree.udacity.com.project0;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button mSpotifyButton;
    private Button mScoresButton;
    private Button mLibraryButton;
    private Button mBiggerButton;
    private Button mReaderButton;
    private Button mCapstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpotifyButton=(Button) findViewById(R.id.main_button_spotify);
        mScoresButton=(Button) findViewById(R.id.main_button_scores);
        mLibraryButton=(Button) findViewById(R.id.main_button_library);
        mBiggerButton=(Button) findViewById(R.id.main_button_bigger);
        mReaderButton=(Button) findViewById(R.id.main_button_reader);
        mCapstoneButton=(Button) findViewById(R.id.main_button_capstone);

        mSpotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),String.format(getString(R.string.main_toast),"spotify"),Toast.LENGTH_LONG).show();
            }
        });
        mScoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),String.format(getString(R.string.main_toast),"scores"),Toast.LENGTH_LONG).show();
            }
        });
        mLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),String.format(getString(R.string.main_toast),"library"),Toast.LENGTH_LONG).show();
            }
        });
        mBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),String.format(getString(R.string.main_toast),"build it bigger"),Toast.LENGTH_LONG).show();
            }
        });
        mReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),String.format(getString(R.string.main_toast),"xyz reader"),Toast.LENGTH_LONG).show();
            }
        });
        mCapstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),String.format(getString(R.string.main_toast),"capstone"),Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
