package com.gegesha.criminalintent.activity;

import android.support.v4.app.Fragment;
import com.gegesha.criminalintent.fragment.CrimeFragment;
import com.gegesha.criminalintent.util.SingleFragmentActivity;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }

}