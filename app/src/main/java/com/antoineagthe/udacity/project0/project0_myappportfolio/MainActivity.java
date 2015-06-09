package com.antoineagthe.udacity.project0.project0_myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity
{
    //--------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //--------------------------------------------------------------------------
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //--------------------------------------------------------------------------
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //--------------------------------------------------------------------------
    public void media_streamer_click_handler(View view)
    {
        sendMessage( getResources().getString( R.string.media_streamer_toast ) );
    }

    //--------------------------------------------------------------------------
    public void super_duo1_click_handler(View view)
    {
        sendMessage( getResources().getString( R.string.super_duo1_toast ) );
    }

    //--------------------------------------------------------------------------
    public void super_duo2_click_handler(View view)
    {
        sendMessage(getResources().getString(R.string.super_duo2_toast));
    }

    //--------------------------------------------------------------------------
    public void ant_terminator_click_handler ( View view )
    {
        sendMessage( getResources().getString( R.string.ant_terminator_toast ) );
    }

    //--------------------------------------------------------------------------
    public void materialize_click_handler ( View view )
    {
        sendMessage( getResources().getString( R.string.materialize_toast ) );
    }

    //--------------------------------------------------------------------------
    public void capstone_click_handler ( View view )
    {
        sendMessage(getResources().getString( R.string.capstone_toast ) );
    }

    //--------------------------------------------------------------------------
    void sendMessage ( String message )
    {
        Context context = getApplicationContext();
        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
