package com.demo.learncomputercourse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.demo.learncomputercourse.Adapters.nextAdapter;
import com.demo.learncomputercourse.classes.RecyclerItemClickListener;
import com.demo.learncomputercourse.models.computermodel;
import java.util.ArrayList;


public class ComputerNetworkingActivity_application extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_computer_networking_application);


        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);


        getSupportActionBar().setTitle("Computer Networking");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));

      
        this.recyclerView = (RecyclerView) findViewById(R.id.computer_networking_application);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Introduction", R.drawable.btns_05));
        arrayList.add(new computermodel("Application Protocols", R.drawable.btns_05));
        arrayList.add(new computermodel("Network Services", R.drawable.btns_05));
        arrayList.add(new computermodel("Client Server Model", R.drawable.btns_05));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(ComputerNetworkingActivity_application.this.getApplicationContext(), receiving_activity_application.class);
                intent2.putExtra("new6", i);
                ComputerNetworkingActivity_application.this.startActivity(intent2);
            }
        }));
    }

}
