package in.udacity.learning.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialise();
    }

    public void initialise() {
        Button btn_spotify_Streamer = (Button) findViewById(R.id.btn_spotify_streamer);
        Button btn_source_app = (Button) findViewById(R.id.btn_source_app);
        Button btn_library_app = (Button) findViewById(R.id.btn_library_app);
        Button btn_build_it_bigger = (Button) findViewById(R.id.btn_build_it_bigger);
        Button btn_xyz_reader = (Button) findViewById(R.id.btn_xyz_reader);
        Button btn_capstone_my_app = (Button) findViewById(R.id.btn_capstone_my_app);

        btn_spotify_Streamer.setOnClickListener(this);
        btn_source_app.setOnClickListener(this);
        btn_library_app.setOnClickListener(this);
        btn_build_it_bigger.setOnClickListener(this);
        btn_xyz_reader.setOnClickListener(this);
        btn_capstone_my_app.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        Button temp = (Button)v;

        String prefix = "This app will launch my ";
        showToast(prefix+temp.getText().toString());
    }

    /** common toast message */
    public void showToast(String msg)
    {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
