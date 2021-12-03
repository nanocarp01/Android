package com.example.app_horarios_ver_2.Adapters.Robert;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.app_horarios_ver_2.Fragments.Robert.Ida.CarLucLVRobertIda;
import com.example.app_horarios_ver_2.Fragments.Robert.Ida.CarLucSabRobertIda;
import com.example.app_horarios_ver_2.Fragments.Robert.Ida.MzaLVRobertIda;
import com.example.app_horarios_ver_2.Fragments.Robert.Ida.MzaSabRobertIda;
import com.example.app_horarios_ver_2.Fragments.Robert.Ida.RivLVRobertIda;
import com.example.app_horarios_ver_2.Fragments.Robert.Ida.RviaSabRobertIda;

public class ViewPagerAdapterSabIda extends FragmentPagerAdapter {

    int numTabs;

    public ViewPagerAdapterSabIda(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs=numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                RviaSabRobertIda rivadaviaida= new RviaSabRobertIda();
                return rivadaviaida;
            case 1:
                CarLucSabRobertIda carLucIda= new CarLucSabRobertIda();
                return carLucIda;
            case 2:
                MzaSabRobertIda mzaIda= new MzaSabRobertIda();
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
