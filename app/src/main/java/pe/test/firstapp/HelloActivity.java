package pe.test.firstapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;


public class HelloActivity extends ActionBarActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Asigna el layout al activity
        setContentView(R.layout.activity_hello);
        //jala el extra creado en el Intent desde el Main
        final String username = getIntent().getStringExtra(MainActivity.USERNAME_EXTRA);
        //busca el textview hello y le pone el texto del username mandado por el extra intent que fue mandado por el view
        ((TextView)findViewById(R.id.activity_hello_textview_hello))
                .setText(getString(R.string.hello_username,username));
    }

}

