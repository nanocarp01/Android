package com.example.app_horarios_ver_2.Adapters.Expreso;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.app_horarios_ver_2.Fragments.Expreso.Vuelta.Bar_SDF_Vuelta;
import com.example.app_horarios_ver_2.Fragments.Expreso.Vuelta.Jun_SDF_Vuelta;
import com.example.app_horarios_ver_2.Fragments.Expreso.Vuelta.Mza_SDF_Vuelta;
import com.example.app_horarios_ver_2.Fragments.Expreso.Vuelta.Pal_SDF_Vuelta;
import com.example.app_horarios_ver_2.Fragments.Expreso.Vuelta.Rvia_SDF_Vuelta;

public class ViewPagerAdapterExpresoSabDomFerVuelta extends FragmentPagerAdapter {

    private int numTabs;

    public ViewPagerAdapterExpresoSabDomFerVuelta(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs = numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;
        switch (position) {
            case 4:
                f = new Rvia_SDF_Vuelta();
                break;

            case 3:
                f = new Jun_SDF_Vuelta();
                break;

            case 2:
                f = new Bar_SDF_Vuelta();
                break;
            case 1:
                f = new Pal_SDF_Vuelta();
                break;
            case 0:
                f = new Mza_SDF_Vuelta();
                break;

        } return f;
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
