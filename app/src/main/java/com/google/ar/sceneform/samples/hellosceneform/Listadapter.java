package com.google.ar.sceneform.samples.hellosceneform;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class Listadapter extends BaseAdapter {

    private Context context;
    private ArrayList<DataGetterSetter> list;

    public Listadapter(Context context, ArrayList<DataGetterSetter> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            view= View.inflate(context,R.layout.list_item,null);
        }

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView PDname = view.findViewById(R.id.TitleProduct);
        TextView PDDescription = view.findViewById(R.id.ContentDescription);
        TextView Price = view.findViewById(R.id.priceItem);

        DataGetterSetter getterSetter = list.get(i);

        imageView.setImageResource(getterSetter.getProductImage());
        PDname.setText(getterSetter.getPdNamel());
        PDDescription.setText(getterSetter.getPdDes());
        Price.setText(getterSetter.getPdPrice());
        return view;
    }
}
