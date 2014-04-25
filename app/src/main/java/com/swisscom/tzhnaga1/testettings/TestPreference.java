package com.swisscom.tzhnaga1.testettings;

import android.content.Context;
import android.preference.TwoStatePreference;
import android.util.AttributeSet;

/**
 * Created by tzhnaga1 on 25/04/14.
 */
public class TestPreference  extends TwoStatePreference{
    public TestPreference(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

}
