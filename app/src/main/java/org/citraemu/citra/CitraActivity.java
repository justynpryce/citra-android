package org.citraemu.citra;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class CitraActivity extends Activity {

    CitraView mView;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        mView = new CitraView(getApplication());
        setContentView(mView);

        View imgame_overlay = this.getLayoutInflater().inflate(R.layout.ingame_overlay, null,false);
        this.addContentView(imgame_overlay, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

    }

    @Override protected void onPause() {
        super.onPause();
        mView.onPause();
    }

    @Override protected void onResume() {
        super.onResume();
        mView.onResume();
    }
}