package pe.test.firstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public static final String USERNAME_EXTRA = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Busca el view por el Id para luego ponerle el click listener
        findViewById(R.id.activity_main_button_sendname)
                //se ha creado una clase anonima para la acción del boton
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Se está sacando el objeto como view, transformalo a Edittext y luego sacar su valor en text para pasarlo en String
                        final String username = ((EditText) findViewById(R.id.activity_main_edittext_username)).getText().toString();
                        //intencion de ejecutar el activity HelloActivity, sintexis de un intent para crear un nuevo activity.
                        final Intent intent = new Intent(MainActivity.this, HelloActivity.class);
                        intent.putExtra(USERNAME_EXTRA, username);
                        startActivity(intent);

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

        switch(item.getItemId()){
            case R.id.menu_main_test_button_1:
                Toast.makeText(this, R.string.menu_button_1_pressed, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_main_test_button_2:
                Toast.makeText(this, R.string.menu_button_2_pressed, Toast.LENGTH_SHORT).show();

                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}