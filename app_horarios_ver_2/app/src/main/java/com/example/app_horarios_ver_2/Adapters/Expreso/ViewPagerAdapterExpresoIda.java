package com.example.app_horarios_ver_2.Adapters.Expreso;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.app_horarios_ver_2.Fragments.Expreso.Ida.Bar_LV_Ida;
import com.example.app_horarios_ver_2.Fragments.Expreso.Ida.Jun_LV_Expreso_Ida;
import com.example.app_horarios_ver_2.Fragments.Expreso.Ida.Mza_LV_Ida;
import com.example.app_horarios_ver_2.Fragments.Expreso.Ida.Pal_LV_Ida;
import com.example.app_horarios_ver_2.Fragments.Expreso.Ida.RivLVExpresoIda;

public class ViewPagerAdapterExpresoIda extends FragmentPagerAdapter {

    private int numTabs;



    public ViewPagerAdapterExpresoIda(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs = numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;
        switch (position) {
            case 0:
                f = new RivLVExpresoIda();
                break;

            case 1:
                f = new Jun_LV_Expreso_Ida();
                break;

            case 2:
                f = new Bar_LV_Ida();
                break;
            case 3:
                f = new Pal_LV_Ida();
                break;
            case 4:
                f = new Mza_LV_Ida();
                break;

        } return f;
    }

    @Override
    public int getCount() {
        return numTabs;
    }



}
