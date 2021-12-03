package com.example.app_horarios_ver_2.Adapters.SM_UNC;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.app_horarios_ver_2.Fragments.SM_UNC.Vuelta.Jun_Sab_Vuelta;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Vuelta.LC_Sab_Vuelta;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Vuelta.MzaT_Sab_Vuelta;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Vuelta.Rvia_Sab_Vuelta;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Vuelta.SMT_Sab_Vuelta;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Vuelta.SMUNC_Sab_Vuelta;

public class ViewPagerAdapterSMUNCSabVuelta extends FragmentPagerAdapter {

    private int numTabs;

    public ViewPagerAdapterSMUNCSabVuelta(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs = numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;
        switch (position) {
            case 5:
                f = new Rvia_Sab_Vuelta();
                break;
            case 4:
                f = new Jun_Sab_Vuelta();
                break;
            case 3:
                f = new LC_Sab_Vuelta();
                break;
            case 2:
                f = new SMT_Sab_Vuelta();
                break;
            case 1:
                f = new MzaT_Sab_Vuelta();
                break;
            case 0:
                f = new SMUNC_Sab_Vuelta();
                break;

        } return f;
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
