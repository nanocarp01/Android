package com.example.app_horarios_ver_2.Adapters.Expreso;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.app_horarios_ver_2.Fragments.Expreso.Vuelta.Bar_LV_Vuelta;
import com.example.app_horarios_ver_2.Fragments.Expreso.Vuelta.Jun_LV_Expreso_Vuelta;
import com.example.app_horarios_ver_2.Fragments.Expreso.Vuelta.Mza_LV_Vuelta;
import com.example.app_horarios_ver_2.Fragments.Expreso.Vuelta.Pal_LV_Vuelta;
import com.example.app_horarios_ver_2.Fragments.Expreso.Vuelta.RivLVExpresoVuelta;

public class ViewPagerAdapterExpresoVuelta extends FragmentPagerAdapter {

    private int numTabs;

    public ViewPagerAdapterExpresoVuelta(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs = numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;
        switch (position) {
            case 4:
                f = new RivLVExpresoVuelta();
                break;

            case 3:
                f = new Jun_LV_Expreso_Vuelta();
                break;

            case 2:
                f = new Bar_LV_Vuelta();
                break;
            case 1:
                f = new Pal_LV_Vuelta();
                break;
            case 0:
                f = new Mza_LV_Vuelta();
                break;

        } return f;
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
