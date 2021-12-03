package com.example.app_horarios_ver_2.Adapters.SM_UNC;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.app_horarios_ver_2.Fragments.SM_UNC.Ida.Jun_LV_Ida;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Ida.LC_LV_ida;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Ida.MzaT_LV_Ida;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Ida.Rvia_LV_Ida;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Ida.SMT_LV_Ida;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Ida.SMUNC_LV_Ida;

public class ViewPagerAdapterSMUNCIda extends FragmentPagerAdapter {

    private int numTabs;



    public ViewPagerAdapterSMUNCIda(FragmentManager fm, int numTabs) {
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
                f = new Jun_LV_Ida();
                break;
            case 2:
                f = new LC_LV_ida();
                break;
            case 3:
                f = new SMT_LV_Ida();
                break;
            case 4:
                f = new MzaT_LV_Ida();
                break;
            case 5:
                f = new SMUNC_LV_Ida();
                break;

        } return f;
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
