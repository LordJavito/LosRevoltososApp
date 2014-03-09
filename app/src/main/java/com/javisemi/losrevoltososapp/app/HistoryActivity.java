package com.javisemi.losrevoltososapp.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class HistoryActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        animarTituloHistoria();


    }

    public void animarTituloHistoria(){

        // ID to TextView object
        TextView title_textView = (TextView) findViewById(R.id.history_title_textView);
        // ID to Animation object
        Animation title_animation = AnimationUtils.loadAnimation(this, R.anim.title_animation);

        // Asignamos la animación al texto
        title_textView.startAnimation(title_animation);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.otrosmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();
        if (id == R.id.acerca_de){
            Toast.makeText(getApplicationContext(), "Aplicación creada por lord_javito para charanga \"Los Revoltosos\"", Toast.LENGTH_LONG).show();
            return true;
        }
        else if (id == R.id.volver){
            finish();
            return true;
        }
        else return super.onOptionsItemSelected(item);
    }

}
