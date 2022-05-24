package sg.edu.rp.c346.id21012434.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtC346;
    TextView txtC206;
    TextView txtC218;
    TextView txtC235;
    TextView txtC203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtC346=findViewById(R.id.tvModC346);
        txtC206=findViewById(R.id.tvModC206);
        txtC218=findViewById(R.id.tvModName);
        txtC235=findViewById(R.id.tvModC235);
        txtC203=findViewById(R.id.tvModC203);

        txtC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Code", "Module Code: C346");
                intent.putExtra("Name", "Module Name: Android Programming");
                intent.putExtra("Year", "Academic Year: 2022");
                intent.putExtra("Sem", "Semester: 1");
                intent.putExtra("Credit", "Module Credit: 4");
                intent.putExtra("Venue", "Venue: E62E");
                startActivity(intent);
            }
        });

        txtC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, SecondActivity.class);
                intent2.putExtra("Code", "Module Code: C206");
                intent2.putExtra("Name", "Module Name: Software Development Process");
                intent2.putExtra("Year", "Academic Year: 2022");
                intent2.putExtra("Sem", "Semester: 1");
                intent2.putExtra("Credit", "Module Credit: 4");
                intent2.putExtra("Venue", "Venue: E66K");
                startActivity(intent2);
            }
        });

        txtC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, SecondActivity.class);
                intent3.putExtra("Code", "Module Code: C218");
                intent3.putExtra("Name", "Module Name: UI/UX Design");
                intent3.putExtra("Year", "Academic Year: 2022");
                intent3.putExtra("Sem", "Semester: 1");
                intent3.putExtra("Credit", "Module Credit: 4");
                intent3.putExtra("Venue", "Venue: E66B");
                startActivity(intent3);
            }
        });

        txtC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, SecondActivity.class);
                intent4.putExtra("Code", "Module Code: C235");
                intent4.putExtra("Name", "Module Name: IT Security and Management");
                intent4.putExtra("Year", "Academic Year: 2022");
                intent4.putExtra("Sem", "Semester: 1");
                intent4.putExtra("Credit", "Module Credit: 4");
                intent4.putExtra("Venue", "Venue: E66A");
                startActivity(intent4);
            }
        });

        txtC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, SecondActivity.class);
                intent4.putExtra("Code", "Module Code: C203");
                intent4.putExtra("Name", "Module Name: Web App In Development In PHP");
                intent4.putExtra("Year", "Academic Year: 2022");
                intent4.putExtra("Sem", "Semester: 1");
                intent4.putExtra("Credit", "Module Credit: 4");
                intent4.putExtra("Venue", "Venue: W65H");
                startActivity(intent4);
            }
        });

    }
}