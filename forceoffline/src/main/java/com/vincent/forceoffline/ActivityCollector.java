package com.vincent.forceoffline;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vincent on 2017/3/23 22:36.
 */

public class ActivityCollector {

    private static List<Activity> mActivities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        mActivities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        mActivities.remove(activity);
    }

    public static void removeAll() {
        for (Activity activity : mActivities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
