package com.javisemi.losrevoltososapp.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ComponentesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componentes);

        // Arrays de componentes por cuerdas
        String[] lista_clarinetes = new String[] {"Manolo Madruga", "Pepe Olivares", "Manolo Madruga", "Pepe Olivares", "Manolo Madruga", "Pepe Olivares", "Manolo Madruga"};
        /*
        String[] lista_clarinetes = new String[] {"Manolo Madruga", "Pepe Olivares"};
        String[] lista_sax_altos = new String[]{"Alba", "Chema", "Juan Banana", "Mari Carmen", "Solís"};
        String[] lista_sax_tenores = new String[] {"Andrés Ramos", "Jose Pascual", "Pascual Marín", "Victor Puche"};
        String[] lista_percusion = new String[]{"Andrés Juán", "Antonio Francisco", "Carlos", "Juan Antonio", "Plácido"};
        String[] lista_tubas = new String[]{"Diego Piñera", "Javi"};
        String[] lista_trombones = new String[]{"Andrés Fernández", "Jose Antonio Carrasco", "Juan Ríos"};
        String[] lista_trompetas = new String[]{"Antonio Mauri", "Jose Gabriel"};
*/
        // Definimos los adaptadores para los arrays
        ArrayAdapter adapter_clarinetes = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista_clarinetes);
        /*
        ArrayAdapter adapter_clarinetes = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista_clarinetes);
        ArrayAdapter adapter_sax_altos = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista_sax_altos);
        ArrayAdapter adapter_sax_tenores = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista_sax_tenores);
        ArrayAdapter adapter_percusion = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista_percusion);
        ArrayAdapter adapter_tubas = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista_tubas);
        ArrayAdapter adapter_trombones = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista_trombones);
        ArrayAdapter adapter_trompetas = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista_trompetas);
*/
        // Obtenemos el objeto ListView del fichero xml y conectamos el objeto con la vista
        ListView listViewClarinetes = (ListView) findViewById(R.id.list_clarinetes);
        listViewClarinetes.setAdapter(adapter_clarinetes);

        /**
        ListView listViewSaxAltos = (ListView) findViewById(R.id.list_sax_altos);
        listViewSaxAltos.setAdapter(adapter_sax_altos);

        ListView listViewSaxTenores = (ListView) findViewById(R.id.list_sax_tenores);
        listViewSaxTenores.setAdapter(adapter_sax_tenores);

        ListView listViewPercusion = (ListView) findViewById(R.id.list_percusion);
        listViewPercusion.setAdapter(adapter_percusion);

        ListView listViewTubas = (ListView) findViewById(R.id.list_tubas);
        listViewTubas.setAdapter(adapter_tubas);

        ListView listViewTrombones = (ListView) findViewById(R.id.list_trombones);
        listViewTrombones.setAdapter(adapter_trombones);

        ListView listViewTrompetas = (ListView) findViewById(R.id.list_trompetas);
        listViewTrompetas.setAdapter(adapter_trompetas);
        */
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
