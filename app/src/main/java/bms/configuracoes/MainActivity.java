package bms.configuracoes;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); 

        Configuration configuration = getResources().getConfiguration();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int orientation = configuration.orientation;
        float density = displayMetrics.density;
        float height = displayMetrics.heightPixels;
        float width = displayMetrics.widthPixels;
        int mcc = configuration.mcc;
        int mnc = configuration.mnc;
        Locale locale = configuration.locale;

        Log.d("NGVL", "density: "+density);
        Log.d("NGVL", "orientation: "+orientation);
        Log.d("NGVL", "height: "+height);
        Log.d("NGVL", "width: "+width);
        Log.d("NGVL", "language: "+locale.getLanguage()+"-"+locale.getCountry());
        Log.d("NGVL", "mcc: "+mcc);
        Log.d("NGVL", "mnc: "+mnc);
    }
}
