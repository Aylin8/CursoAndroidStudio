package com.wc8gmail.merma.findmyage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText etDOB;
    TextView tvShowAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDOB=(EditText)findViewById(R.id.etDOB);
        tvShowAge=(TextView)findViewById(R.id.tvShowAge);
    }
    @TargetApi(Build.VERSION_CODES.N)
    public void buFindAge(View view){
        int DOB= Integer.parseInt(etDOB.getText().toString());
        Calendar calendar= Calendar.getInstance();
        int year= calendar.get(Calendar.YEAR);
        int Age=year-DOB;
        tvShowAge.setText("Your age is: "+Age+ " and in month " +Age * 12+", in days " + Age*365);
    }
}
