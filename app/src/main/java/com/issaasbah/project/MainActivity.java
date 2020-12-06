package com.issaasbah.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView card1, card2, card3;
    Button logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logoutBtn = findViewById(R.id.logoutBtn);

        card1 = findViewById(R.id.cardView);
        card2 = findViewById(R.id.cardView2);
        card3 = findViewById(R.id.cardView3);

        card1.setBackgroundResource(R.drawable.my_button_bg);
        card2.setBackgroundResource(R.drawable.my_button_bg);
        card3.setBackgroundResource(R.drawable.my_button_bg);


        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();

                /*
                here add intent
                Intent intent = new Intent(MainActivity.this, ....);
                 */
            }
        });



        card1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();

                /*
                here add intent
                Intent intent = new Intent(MainActivity.this, ....);
                 */
            }
        }));

        card2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();

                /*
                here add intent
                Intent intent = new Intent(MainActivity.this, ....);
                 */
            }
        }));

        card3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();

                /*
                here add intent
                Intent intent = new Intent(MainActivity.this, ....);
                 */
            }
        }));
    }
}
