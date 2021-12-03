package com.example.app_horarios_ver_2.Adapters.Robert;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.app_horarios_ver_2.Fragments.Robert.Ida.CarLucDomFerRobertIda;
import com.example.app_horarios_ver_2.Fragments.Robert.Ida.MzaDomFerRobertIda;
import com.example.app_horarios_ver_2.Fragments.Robert.Ida.RviaDomFerRobertIda;
import com.example.app_horarios_ver_2.Fragments.Robert.Vuelta.CarLucDomFerRobertVuelta;
import com.example.app_horarios_ver_2.Fragments.Robert.Vuelta.MzaDomFerRobertVuelta;
import com.example.app_horarios_ver_2.Fragments.Robert.Vuelta.RviaDomFerRobertVuelta;

public class ViewPagerAdapterDomFerVuelta extends FragmentPagerAdapter {

    int numTabs;

    public ViewPagerAdapterDomFerVuelta(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs=numTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 2:
                RviaDomFerRobertVuelta rivadaviaida= new RviaDomFerRobertVuelta();
                return rivadaviaida;
            case 1:
                CarLucDomFerRobertVuelta carLucIda= new CarLucDomFerRobertVuelta();
                return carLucIda;
            case 0:
                MzaDomFerRobertVuelta mzaIda= new MzaDomFerRobertVuelta();
                return mzaIda;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {

        return numTabs;
    }
}
