package homework5.paulreitz.com.uta_esports;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.Spinner;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by Paul on 11/23/2014.
 */
public class TeamA extends Activity {

    public void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.teama);
        String[] country={"Teams","Team A","Team B","Team C"};
        ArrayAdapter<String> stringArrayAdapter=
                new ArrayAdapter<String>(
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        country);

        Spinner spinner =
                (Spinner)  findViewById(R.id.spinnertv);
        spinner.setAdapter(stringArrayAdapter);

        /**
         * CRUD Operations
         * */
        // add Books

        AdapterView.OnItemSelectedListener onSpinner =
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent,View view,int position,long id)
                    {
                        //when an item is selected
                        if (parent.getSelectedItem().toString().contains("Team A"))
                        {
                            Intent intent = new Intent(parent.getContext(), TeamA.class);
                            startActivity(intent);


                        }
                        if (parent.getSelectedItem().toString().contains("Team B"))
                        {
                            Intent intent = new Intent(parent.getContext(), TeamB.class);
                            startActivity(intent);


                        }
                        if (parent.getSelectedItem().toString().contains("Team C"))
                        {
                            Intent intent = new Intent(parent.getContext(), TeamC.class);
                            startActivity(intent);


                        }


                    }
                    @Override
                    public void onNothingSelected( AdapterView<?>  parent)
                    {
                        //when nothing is selected
                        return;


                    }



                };

        spinner.setOnItemSelectedListener(onSpinner);


    }

    public void onButtonPress(View e)
    {
        Intent intent = new Intent(this, TwitchTV.class);
        startActivity(intent);


    }

}

