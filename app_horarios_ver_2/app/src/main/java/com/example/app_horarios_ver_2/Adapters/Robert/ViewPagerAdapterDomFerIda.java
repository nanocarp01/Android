package com.example.app_horarios_ver_2.Adapters.Robert;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.app_horarios_ver_2.Fragments.Robert.Ida.CarLucDomFerRobertIda;

import com.example.app_horarios_ver_2.Fragments.Robert.Ida.MzaDomFerRobertIda;

import com.example.app_horarios_ver_2.Fragments.Robert.Ida.RviaDomFerRobertIda;

public class ViewPagerAdapterDomFerIda  extends FragmentPagerAdapter {
    int numTabs;

    public ViewPagerAdapterDomFerIda(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs=numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                RviaDomFerRobertIda rivadaviaida= new RviaDomFerRobertIda();
                return rivadaviaida;
            case 1:
                CarLucDomFerRobertIda carLucIda= new CarLucDomFerRobertIda();
                return carLucIda;
            case 2:
                MzaDomFerRobertIda mzaIda= new MzaDomFerRobertIda();
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
