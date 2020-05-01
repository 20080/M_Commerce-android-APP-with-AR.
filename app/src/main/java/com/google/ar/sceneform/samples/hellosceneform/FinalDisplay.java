package com.google.ar.sceneform.samples.hellosceneform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class FinalDisplay extends AppCompatActivity {

    private ImageView imageView;
    private TextView prodT;
    private TextView prodD;
    private TextView proP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_display);
        imageView = findViewById(R.id.ProductImageS);
        prodT=findViewById(R.id.TitleS);
        proP=findViewById(R.id.PriceS);
        prodD=findViewById(R.id.DescriptionS);

        Intent intent = this.getIntent();
        imageView.setImageResource(intent.getExtras().getInt("ProductI"));
        prodT.setText(intent.getExtras().getString("ProductN"));
        proP.setText("MRP: \n"+intent.getExtras().getString("ProductP"));
        prodD.setText("Description:\n"+intent.getExtras().getString("ProductD"));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(FinalDisplay.this,Catalogue.class));
    }

    public void CallAR(View view) {

        Intent intent = this.getIntent();
        String swn= intent.getExtras().getString("ProductN");
        Intent n = new Intent();
        n.setClass(FinalDisplay.this,HelloSceneformActivity.class);

        switch (swn){
            case "Chair":{
                n.putExtra("Data",R.raw.chair);
                FinalDisplay.this.startActivity(n);
                break;
            }
            case "Bed":{
                n.putExtra("Data",R.raw.bed);
                FinalDisplay.this.startActivity(n);
                break;
            }
            case "Stool":{
                n.putExtra("Data",R.raw.stool);
                FinalDisplay.this.startActivity(n);
                break;
            }
            case "Table":{
                n.putExtra("Data",R.raw.table);
                FinalDisplay.this.startActivity(n);
                break;
            }
            case "Desk":{
                n.putExtra("Data",R.raw.desk);
                FinalDisplay.this.startActivity(n);
                break;
            }



        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.cart_icon1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.appbarCart:{
                Toast.makeText(this,"This is a cart icon",Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.Logout:
            {
                //FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(FinalDisplay.this,MainActivity.class));
                Toast.makeText(this,"Logout",Toast.LENGTH_SHORT).show();
                return true;
            }
        }
        return true;
    }
}


