package com.vincent.forceoffline;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class OfflineReceiver extends BroadcastReceiver {
    private static final String TAG = "OfflineReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, "onReceive: ++++++++++++++++++++++=");
        ActivityCollector.removeAll();
        context.startActivity(new Intent(context,LoginActivity.class));
    }
}
