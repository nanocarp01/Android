package com.example.app_horarios_ver_2.Adapters.Robert;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.app_horarios_ver_2.Fragments.Robert.Ida.CarLucLVRobertIda;
import com.example.app_horarios_ver_2.Fragments.Robert.Ida.MzaLVRobertIda;
import com.example.app_horarios_ver_2.Fragments.Robert.Ida.RivLVRobertIda;
import com.example.app_horarios_ver_2.R;


public class ViewPagerAdapterIda extends FragmentPagerAdapter {

    private int numTabs;


    public ViewPagerAdapterIda(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs = numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new RivLVRobertIda();
            case 1:
                return new CarLucLVRobertIda();
            case 2:
                return new MzaLVRobertIda();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {

        return numTabs;
    }


}
