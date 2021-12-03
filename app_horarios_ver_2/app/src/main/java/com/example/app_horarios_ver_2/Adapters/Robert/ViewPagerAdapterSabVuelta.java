package com.example.app_horarios_ver_2.Adapters.Robert;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.app_horarios_ver_2.Fragments.Robert.Vuelta.CarLucLVRobertVuelta;
import com.example.app_horarios_ver_2.Fragments.Robert.Vuelta.CarLucSabRobertVuelta;
import com.example.app_horarios_ver_2.Fragments.Robert.Vuelta.MzaLVRobertVuelta;
import com.example.app_horarios_ver_2.Fragments.Robert.Vuelta.MzaSabRobertVuelta;
import com.example.app_horarios_ver_2.Fragments.Robert.Vuelta.RivLVRobertVuelta;
import com.example.app_horarios_ver_2.Fragments.Robert.Vuelta.RviaSabRobertVuelta;

public class ViewPagerAdapterSabVuelta extends FragmentPagerAdapter {

    int numTabs;

    public ViewPagerAdapterSabVuelta(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs=numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 2:
                RviaSabRobertVuelta rivadavia= new RviaSabRobertVuelta();
                return rivadavia;
            case 1:
                CarLucSabRobertVuelta carLuc= new CarLucSabRobertVuelta();
                return carLuc;
            case 0:
                MzaSabRobertVuelta mza= new MzaSabRobertVuelta();
                return mza;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {

        return numTabs;
    }
}
