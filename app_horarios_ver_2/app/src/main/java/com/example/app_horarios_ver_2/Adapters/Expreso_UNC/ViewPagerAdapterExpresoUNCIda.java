package com.example.app_horarios_ver_2.Adapters.Expreso_UNC;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.app_horarios_ver_2.Fragments.Expreso_UNC.Ida.Bar_LV_Ida;
import com.example.app_horarios_ver_2.Fragments.Expreso_UNC.Ida.Chi_LV_Ida;
import com.example.app_horarios_ver_2.Fragments.Expreso_UNC.Ida.Jun_LV__Ida;
import com.example.app_horarios_ver_2.Fragments.Expreso_UNC.Ida.Mar_LV_Ida;
import com.example.app_horarios_ver_2.Fragments.Expreso_UNC.Ida.Mza_LV_Ida;
import com.example.app_horarios_ver_2.Fragments.Expreso_UNC.Ida.Pal_LV_Ida;
import com.example.app_horarios_ver_2.Fragments.Expreso_UNC.Ida.Rvia_LV_Ida;
import com.example.app_horarios_ver_2.Fragments.Expreso_UNC.Ida.UNC_LV_Ida;

public class ViewPagerAdapterExpresoUNCIda extends FragmentPagerAdapter {

    private int numTabs;



    public ViewPagerAdapterExpresoUNCIda(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs = numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;
        switch (position) {
            case 0:
                f = new Rvia_LV_Ida();
                break;
            case 1:
                f = new Jun_LV__Ida();
                break;
            case 2:
                f = new Bar_LV_Ida();
                break;
            case 3:
                f = new Chi_LV_Ida();
                break;
            case 4:
                f = new Pal_LV_Ida();
                break;
            case 5:
                f = new Mar_LV_Ida();
                break;
            case 6:
                f = new Mza_LV_Ida();
                break;
            case 7:
                f = new UNC_LV_Ida();
                break;

        } return f;
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
