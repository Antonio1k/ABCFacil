package mx.com.isdi.abcfacil;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;

/**
 * Splash Screen code
 * Created by vamsikrishna on 12-Feb-15.
 */
public class splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent openMainActivity= new Intent("mx.com.isdi.abcfacil.main");
                    startActivity(openMainActivity);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {

        super.onPause();
        finish();
    }

}