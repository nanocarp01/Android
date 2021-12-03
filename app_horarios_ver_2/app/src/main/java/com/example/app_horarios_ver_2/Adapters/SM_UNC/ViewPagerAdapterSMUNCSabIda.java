package com.example.app_horarios_ver_2.Adapters.SM_UNC;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.app_horarios_ver_2.Fragments.SM_UNC.Ida.Jun_Sab_Ida;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Ida.LC_Sab_Ida;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Ida.MzaT_Sab_Ida;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Ida.Rvia_Sab_Ida;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Ida.SMT_Sab_Ida;
import com.example.app_horarios_ver_2.Fragments.SM_UNC.Ida.SMUNC_Sab_Ida;

public class ViewPagerAdapterSMUNCSabIda extends FragmentPagerAdapter {

    private int numTabs;

    public ViewPagerAdapterSMUNCSabIda(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs = numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;
        switch (position) {
            case 0:
                f = new Rvia_Sab_Ida();
                break;
            case 1:
                f = new Jun_Sab_Ida();
                break;
            case 2:
                f = new LC_Sab_Ida();
                break;
            case 3:
                f = new SMT_Sab_Ida();
                break;
            case 4:
                f = new MzaT_Sab_Ida();
                break;
            case 5:
                f = new SMUNC_Sab_Ida();
                break;

        }
        return f;
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
