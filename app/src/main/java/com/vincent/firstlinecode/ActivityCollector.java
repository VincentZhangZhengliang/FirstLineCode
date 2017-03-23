package com.vincent.firstlinecode;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vincent on 2017/3/23 15:37.
 */

public class ActivityCollector {

    public static List<Activity> sActivities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        sActivities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        sActivities.remove(activity);
    }

    public static void removeAll() {
        for (Activity activity : sActivities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
