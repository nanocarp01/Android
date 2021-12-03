package com.example.app_horarios_ver_2.Adapters.Robert;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.app_horarios_ver_2.Fragments.Robert.Vuelta.CarLucLVRobertVuelta;
import com.example.app_horarios_ver_2.Fragments.Robert.Vuelta.MzaLVRobertVuelta;
import com.example.app_horarios_ver_2.Fragments.Robert.Vuelta.RivLVRobertVuelta;

public class ViewPagerAdapterVuelta extends FragmentPagerAdapter {

    int numTabs;

    public ViewPagerAdapterVuelta(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs=numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                MzaLVRobertVuelta mza= new MzaLVRobertVuelta();
                return mza;

            case 1:
                CarLucLVRobertVuelta carLuc= new CarLucLVRobertVuelta();
                return carLuc;
            case 2:
                RivLVRobertVuelta rivadavia= new RivLVRobertVuelta();
                return rivadavia;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {

        return numTabs;
    }
}