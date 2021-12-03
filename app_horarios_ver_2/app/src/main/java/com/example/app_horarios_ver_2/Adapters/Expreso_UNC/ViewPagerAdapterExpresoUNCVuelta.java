package com.example.app_horarios_ver_2.Adapters.Expreso_UNC;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.app_horarios_ver_2.Fragments.Expreso_UNC.Vuelta.Bar_LV_Vuelta;
import com.example.app_horarios_ver_2.Fragments.Expreso_UNC.Vuelta.Chi_LV_Vuelta;
import com.example.app_horarios_ver_2.Fragments.Expreso_UNC.Vuelta.Jun_LV__Vuelta;
import com.example.app_horarios_ver_2.Fragments.Expreso_UNC.Vuelta.Mar_LV_Vuelta;
import com.example.app_horarios_ver_2.Fragments.Expreso_UNC.Vuelta.Mza_LV_Vuelta;
import com.example.app_horarios_ver_2.Fragments.Expreso_UNC.Vuelta.Pal_LV_Vuelta;
import com.example.app_horarios_ver_2.Fragments.Expreso_UNC.Vuelta.Rvia_LV_Vuelta;
import com.example.app_horarios_ver_2.Fragments.Expreso_UNC.Vuelta.UNC_LV_Vuelta;

public class ViewPagerAdapterExpresoUNCVuelta extends FragmentPagerAdapter {

    private int numTabs;

    public ViewPagerAdapterExpresoUNCVuelta(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs = numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;
        switch (position) {
            case 7:
                f = new Rvia_LV_Vuelta();
                break;
            case 6:
                f = new Jun_LV__Vuelta();
                break;
            case 5:
                f = new Bar_LV_Vuelta();
                break;
            case 4:
                f = new Chi_LV_Vuelta();
                break;
            case 3:
                f = new Pal_LV_Vuelta();
                break;
            case 2:
                f = new Mar_LV_Vuelta();
                break;
            case 1:
                f = new Mza_LV_Vuelta();
                break;
            case 0:
                f = new UNC_LV_Vuelta();
                break;

        } return f;
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
