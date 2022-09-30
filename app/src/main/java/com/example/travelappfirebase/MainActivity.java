package com.example.travelappfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Button bAddTravel, bShowImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button: upload food
        //
        bAddTravel = (Button) findViewById(R.id.bAddTravel);
        bAddTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAddTravel();
            }
        });

        // Button: show foods
        //
        bShowImages = (Button) findViewById(R.id.bShowTravels);
        bShowImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showTravels();
            }
        });

    }

    private void showAddTravel(){
        Intent intent = new Intent(MainActivity.this, AddTravel.class);
        MainActivity.this.startActivity(intent);
    }

    private void showTravels(){
        Intent intent = new Intent(MainActivity.this, ShowTravels.class);
        MainActivity.this.startActivity(intent);
    }

}