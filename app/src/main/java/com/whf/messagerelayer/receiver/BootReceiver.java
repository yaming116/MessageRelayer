package com.whf.messagerelayer.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.whf.messagerelayer.activity.MainActivity;
import com.whf.messagerelayer.activity.StartActivity;

/**
 * Created by ucmed on 2018/3/7.
 */
public class BootReceiver extends BroadcastReceiver {

    static final String action_boot ="android.intent.action.BOOT_COMPLETED";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("charge start", "启动完成");

        if (intent.getAction().equals(action_boot)){

            Intent mBootIntent = new Intent(context, StartActivity.class);
            mBootIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(mBootIntent);
        }
    }
}
