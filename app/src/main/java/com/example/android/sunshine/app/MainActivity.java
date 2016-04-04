package com.example.android.sunshine.app;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            String[] weathers = {
                    "Today-Sunny-88/64",
                    "Tomorrow-Sunny-78/66",
                    "Monday-Rain-70/64",
                    "Tuesday-Stormy-88/64",
                    "Wednesday-Foggy-81/56",
                    "Thursday-Cloudy-78/77",
                    "Friday-Sunny-98/65",
                    "Saturday-Sunny-88/64",
                    "Sunday-Sunny-83/63",
                    "Monday-Rain-80/55",
                    "Tuesday-Rain-88/64",
                    "Wednesday-Foggy-81/56",
                    "Thursday-Cloudy-86/61",
                    "Friday-Sunny-87/66",
                    "Saturday-Rain-88/67",
                    "Sunday-Rain-87/64",
                    "Monday-Rain-89/65",
                    "Tuesday-Sunny-65/45",
                    "Wednesday-Sunny-65/55",
                    "Thursday-Foggy-77/67",
                    "Friday-Sunny-90/65"
            };

            ArrayAdapter<String> forecastAdapter = new ArrayAdapter<String>(
                    getActivity(),
                    R.layout.list_item_forecast,
                    R.id.list_item_forecast_Text,
                    weathers);

            ListView listView = (ListView)rootView.findViewById(R.id.listview_forecast);
            listView.setAdapter(forecastAdapter);
            return rootView;
        }
    }
}
