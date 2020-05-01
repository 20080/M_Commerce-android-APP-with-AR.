package com.google.ar.sceneform.samples.hellosceneform;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class Catalogue extends AppCompatActivity {

    private ListView listView;
    private ArrayList<DataGetterSetter> GSList;
    private Listadapter listadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogue);

        listView = findViewById(R.id.list_view);

        GSList= ListDetails.getList();

        listadapter= new Listadapter(Catalogue.this,GSList);
        listView.setAdapter(listadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                DataGetterSetter dataGetterSetter = GSList.get(i);
                Intent intent = new Intent();
                intent.setClass(Catalogue.this,FinalDisplay.class);
                intent.putExtra("ProductN",dataGetterSetter.getPdNamel());
                intent.putExtra("ProductD",dataGetterSetter.getPdDes());
                intent.putExtra("ProductP",dataGetterSetter.getPdPrice());
                intent.putExtra("ProductI",dataGetterSetter.getProductImage());
                Catalogue.this.startActivity(intent);


            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.cart_icon1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.Logout:
            {
               // FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(Catalogue.this,MainActivity.class));
                Toast.makeText(this,"Logout",Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.appbarCart:{
                Toast.makeText(this,"Under Construction",Toast.LENGTH_SHORT).show();
            }
        }
        return true;
    }
}
