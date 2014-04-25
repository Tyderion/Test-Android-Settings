package com.swisscom.tzhnaga1.testettings;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

import java.util.List;

/**
 * Created by tzhnaga1 on 25/04/14.
 */
public class SettingsActivity extends PreferenceActivity {

    @Override
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.preferences_headers, target);
    }

    @Override
    protected boolean isValidFragment(String fragmentName) {
        return SettingsFragment.class.getName().equals(fragmentName);
    }

    public static class SettingsFragment extends PreferenceFragment {
        public SettingsFragment() {}
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            String settings = getArguments().getString("settings");
            if ("test".equals(settings)) {
                addPreferencesFromResource(R.xml.settings_category_test);
            } else if ("test2".equals(settings)) {
                addPreferencesFromResource(R.xml.settings_category_test2);
            }
        }
    }
}
