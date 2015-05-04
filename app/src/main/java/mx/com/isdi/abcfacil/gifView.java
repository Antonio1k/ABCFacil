package mx.com.isdi.abcfacil;

import android.content.Context;
import android.webkit.WebView;

/**
 * Created by Antonio on 04/05/2015.
 */
public class gifView extends WebView
{
    public gifView(Context context, String path) { super(context); loadUrl(path); }
}
