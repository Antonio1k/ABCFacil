package mx.com.isdi.abcfacil;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;



public class main extends Activity {

    public void OpenOptionsActivity(View v){
        Intent ShowOpciones = new Intent(main.this, GIFtest.class);
        startActivity(ShowOpciones);
    }

    public void OpenWeasActivity(View v){
        Intent ShowActividades = new Intent(main.this, VocalNumeroActivity.class);
        startActivity(ShowActividades);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}
