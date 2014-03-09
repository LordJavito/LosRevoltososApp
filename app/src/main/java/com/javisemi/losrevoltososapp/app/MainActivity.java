package com.javisemi.losrevoltososapp.app;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    private Button historiaButton;
    private Button calendarioButton;
    private Button componentesButton;
    private Button contactoButton;
    private Button facebookButton;
    private Button webButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        historiaButton = (Button) findViewById(R.id.historia_button);
        historiaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarHistoria();
            }
        });

        contactoButton = (Button) findViewById(R.id.contacto_button);
        contactoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarContacto();
            }
        });

        calendarioButton = (Button) findViewById(R.id.calendario_button);
        calendarioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarCalendario();
            }
        });

        componentesButton = (Button) findViewById(R.id.componentes_button);
        componentesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarComponentes();
            }
        });

        facebookButton= (Button) findViewById(R.id.facebook_button);
        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Abriría la web de facebook con la página de los revoltosos", Toast.LENGTH_LONG).show();
            }
        });

        webButton = (Button) findViewById(R.id.web_button);
        webButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Abriría la página web los revoltosos", Toast.LENGTH_LONG).show();
            }
        });
    }

    // Lanza la actividad Historia
    public void lanzarHistoria(){
        Intent i = new Intent(this, HistoryActivity.class);
        startActivity(i);
    }

    // Lanza la actividad Calendario
    private void lanzarCalendario() {
        Intent i = new Intent(this, CalendarioActivity.class);
        startActivity(i);
    }

    // Lanza la actividad Componentes
    private void lanzarComponentes() {
        Intent i = new Intent(this, ComponentesActivity.class);
        startActivity(i);
    }

    // Lanza la actividad Contacto
    private void lanzarContacto() {
        Intent i = new Intent(this, ContactoActivity.class);
        startActivity(i);
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
        if (id == R.id.acerca_de){
            Toast.makeText(getApplicationContext(), "Aplicación creada por lord_javito para charanga \"Los Revoltosos\"", Toast.LENGTH_LONG).show();
            return true;
        }
        else if (id == R.id.salir){
            finish();
            return true;
        }
        else return super.onOptionsItemSelected(item);
    }

}
