package com.prisar.networkalert;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.widget.Toast;

public class ConnectivityChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("*** Action: " + intent.getAction());
        if(intent.getAction().equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE")) {
            Toast.makeText(context, "Connection changed", Toast.LENGTH_SHORT).show();
            Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);

            Ringtone r = RingtoneManager.getRingtone(context.getApplicationContext(), notification);
            r.play();
        }

        if(intent.getAction().equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE")) {
            Toast.makeText(context, "Connection changed", Toast.LENGTH_SHORT).show();
        }
    }
}
