package com.gegesha.criminalintent.activity;

import android.support.v4.app.Fragment;
import com.gegesha.criminalintent.fragment.CrimeListFragment;
import com.gegesha.criminalintent.util.SingleFragmentActivity;

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}