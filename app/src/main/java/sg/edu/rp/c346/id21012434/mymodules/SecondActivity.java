package sg.edu.rp.c346.id21012434.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvModCode;
    TextView tvModName;
    TextView tvAcademicYear;
    TextView tvSemester;
    TextView tvModCredit;
    TextView tvVenue;
    Button GoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvModCode=findViewById(R.id.tvModCode);
        tvModName=findViewById(R.id.tvModName);
        tvAcademicYear=findViewById(R.id.tvAcademicYear);
        tvSemester=findViewById(R.id.tvSemester);
        tvModCredit=findViewById(R.id.tvModCredit);
        tvVenue=findViewById(R.id.tvVenue);
        GoBack=findViewById(R.id.Goback);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("Code");
        String name = intentReceived.getStringExtra("Name");
        String year = intentReceived.getStringExtra("Year");
        String sem = intentReceived.getStringExtra("Sem");
        String credit = intentReceived.getStringExtra("Credit");
        String venue = intentReceived.getStringExtra("Venue");

        tvModCode.setText(code);
        tvModName.setText(name);
        tvAcademicYear.setText(year);
        tvSemester.setText(sem);
        tvModCredit.setText(credit);
        tvVenue.setText(venue);

        GoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {finish();}

        });
    }
}