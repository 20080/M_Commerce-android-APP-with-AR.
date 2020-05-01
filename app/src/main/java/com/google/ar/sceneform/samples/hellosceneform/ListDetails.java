package com.google.ar.sceneform.samples.hellosceneform;

import java.util.ArrayList;

public class ListDetails {


    public static ArrayList<DataGetterSetter> getList(){

        ArrayList<DataGetterSetter> ProductList= new ArrayList<>();
        ProductList.add(new DataGetterSetter(R.drawable.bed,"Bed","This is the Google Poly Bed Model","RS 33000"));
        ProductList.add(new DataGetterSetter(R.drawable.tablerender,"Table","A very basic table","RS 3000"));
        ProductList.add(new DataGetterSetter(R.drawable.chair,"Chair","Very Classy Chair","RS 2900"));
        ProductList.add(new DataGetterSetter(R.drawable.stool,"Stool","A fashionable stool","RS 2000"));
        ProductList.add(new DataGetterSetter(R.drawable.desk,"Desk","A desk for all your productivity needs","RS 9000"));
        return ProductList;

    }

}
