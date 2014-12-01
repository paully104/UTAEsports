package homework5.paulreitz.com.uta_esports;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.roomorama.caldroid.CaldroidFragment;

import java.util.Calendar;


public class MyActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        String[] country = {"Teams", "Team A", "Team B", "Team C"};
        ArrayAdapter<String> stringArrayAdapter =
                new ArrayAdapter<String>(
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        country);

        Spinner spinner =
                (Spinner) findViewById(R.id.spinnertv);
        spinner.setAdapter(stringArrayAdapter);

        /**
         * CRUD Operations
         * */
        // add Books

        AdapterView.OnItemSelectedListener onSpinner =
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        //when an item is selected

                        if (parent.getSelectedItem().toString().contains("Team A")) {
                            Intent intent = new Intent(parent.getContext(), TeamA.class);
                            startActivity(intent);


                        }
                        if (parent.getSelectedItem().toString().contains("Team B")) {
                            Intent intent = new Intent(parent.getContext(), TeamB.class);
                            startActivity(intent);


                        }
                        if (parent.getSelectedItem().toString().contains("Team C")) {
                            Intent intent = new Intent(parent.getContext(), TeamC.class);
                            startActivity(intent);


                        }

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        //when nothing is selected
                        return;


                    }
                };

        spinner.setOnItemSelectedListener(onSpinner);





    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onButtonPress(View e)
    {
        Intent intent = new Intent(this, TwitchTV.class);
        startActivity(intent);


    }
}
