package marshal.demos.landscape;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MyActivity extends Activity {

    private static final String TAG="DemosLandscape";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.d(TAG,"on create..");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"on start..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"on resume..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"on pause..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"on stop..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"on destroy..");
    }
}
