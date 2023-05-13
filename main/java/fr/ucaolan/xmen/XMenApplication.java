package fr.ucaolan.xmen;


import android.app.Application;
import android.content.res.Resources;
import android.content.res.TypedArray;

import java.util.ArrayList;
import java.util.List;

public class XMenApplication extends Application
{
    private final List<XMen> liste = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();

        Resources res = getResources();
        final String[] noms = res.getStringArray(R.array.noms);
        final String[] alias = res.getStringArray(R.array.alias);
        final String[] description = res.getStringArray(R.array.descriptions);
        final String[] pouvoirs = res.getStringArray(R.array.pouvoirs);


        TypedArray images = res.obtainTypedArray(R.array.idimages);

        for (int i = 0 ; i < noms.length; i++){
            XMen xm = new XMen(
                    noms[i],
                    alias[i],
                    description[i],
                    pouvoirs[i],
                    images.getResourceId(i, R.drawable.undef)
            );

            liste.add(xm);
        }

        images.recycle();
    }

    public List<XMen> getListe() {
        return liste;
    }
}
