package mx.com.isdi.abcfacil;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class GIFtest extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giftest);

        gifView view = new gifView(this, "file:///android_asset/marcianito.gif"); setContentView(view);

    }
}
