package com.example.app_horarios_ver_2.Adapters.SM_UNC;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.app_horarios_ver_2.Fragments.SM_UNC.Vuelta.Jun_LV_Vuelta;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Vuelta.LC_LV_Vuelta;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Vuelta.MzaT_LV_Vuelta;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Vuelta.Rvia_LV_Vuelta;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Vuelta.SMT_LV_Vuelta;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Vuelta.SMUNC_LV_Vuelta;

public class ViewPagerAdapterSMUNCVuelta extends FragmentPagerAdapter {

    private int numTabs;



    public ViewPagerAdapterSMUNCVuelta(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs = numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;
        switch (position) {
            case 5:
                f = new Rvia_LV_Vuelta();
                break;
            case 4:
                f = new Jun_LV_Vuelta();
                break;
            case 3:
                f = new LC_LV_Vuelta();
                break;
            case 2:
                f = new SMT_LV_Vuelta();
                break;
            case 1:
                f = new MzaT_LV_Vuelta();
                break;
            case 0:
                f = new SMUNC_LV_Vuelta();
                break;

        } return f;
    }

    @Override
    public int getCount() {
        return numTabs;
    }

}
