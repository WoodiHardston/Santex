package com.example.artur;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int i1;
    private int ress1;
    private int ress2;
    private int ress3;
    private int ress4;
    private int ress5;
    private int totalres;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t2 =findViewById(R.id.res2);
        TextView t3 =findViewById(R.id.res3);
        TextView t4 =findViewById(R.id.res4);
        TextView t5 =findViewById(R.id.res5);
        TextView result = findViewById(R.id.result);
        ImageView i1 = findViewById(R.id.m500);
        ImageView i2 = findViewById(R.id.m1500);
        ImageView i3 = findViewById(R.id.m5000);
        ImageView i4 = findViewById(R.id.m10000);
        ImageView i5 = findViewById(R.id.m14999);
        ImageView i6 = findViewById(R.id.p500);
        ImageView i7 = findViewById(R.id.p1500);
        ImageView i8 = findViewById(R.id.p5000);
        ImageView i9 = findViewById(R.id.p10000);
        ImageView i10 = findViewById(R.id.p14999);


    }
    public void p500(View view)
    {
        ress1++;
        TextView t1 =findViewById(R.id.res1);
        t1.setText(String.valueOf(ress1));
        totalres += 500;
        TextView result = findViewById(R.id.result);
        result.setText(String.valueOf(totalres));
    }
    public void p1500(View view)
    {
        ress2++;
        TextView t1 =findViewById(R.id.res2);
        t1.setText(String.valueOf(ress2));
        totalres += 1500;
        TextView result = findViewById(R.id.result);
        result.setText(String.valueOf(totalres));
    }
    public void p5000(View view)
    {
        ress3++;
        TextView t1 =findViewById(R.id.res3);
        t1.setText(String.valueOf(ress3));
        totalres += 5000;
        TextView result = findViewById(R.id.result);
        result.setText(String.valueOf(totalres));
    }
    public void p10000(View view)
    {
        ress4++;
        TextView t1 =findViewById(R.id.res4);
        t1.setText(String.valueOf(ress4));
        totalres += 10000;
        TextView result = findViewById(R.id.result);
        result.setText(String.valueOf(totalres));
    }
    public void p14999(View view)
    {
        ress5++;
        TextView t1 =findViewById(R.id.res5);
        t1.setText(String.valueOf(ress5));
        totalres += 14999;
        TextView result = findViewById(R.id.result);
        result.setText(String.valueOf(totalres));
    }
    public void m500(View view)
    {
        if (totalres > 0 & ress1 >0 )
        {
            ress1--;
            TextView t1 = findViewById(R.id.res1);
            t1.setText(String.valueOf(ress1));
            totalres -= 500;
            TextView result = findViewById(R.id.result);
            result.setText(String.valueOf(totalres));
        }
    }
    public void m1500(View view)
    {
        if(totalres > 0& ress2 >0) {
            ress2--;
            TextView t1 = findViewById(R.id.res2);
            t1.setText(String.valueOf(ress2));
            totalres -= 1500;
            TextView result = findViewById(R.id.result);
            result.setText(String.valueOf(totalres));
        }
    }
    public void m5000(View view)
    {
        if (totalres >0 & ress3>0) {
            ress3--;
            TextView t1 = findViewById(R.id.res3);
            t1.setText(String.valueOf(ress3));
            totalres -= 5000;
            TextView result = findViewById(R.id.result);
            result.setText(String.valueOf(totalres));
        }
    }
    public void m1000(View view)
    {
        if (totalres > 0& ress4 >0) {
            ress4--;
            TextView t1 = findViewById(R.id.res4);
            t1.setText(String.valueOf(ress4));
            totalres -= 10000;
            TextView result = findViewById(R.id.result);
            result.setText(String.valueOf(totalres));
        }
    }
    public void m14999(View view)
    {
        if (totalres >0& ress5 >0) {
            ress5--;
            TextView t1 = findViewById(R.id.res5);
            t1.setText(String.valueOf(ress5));
            totalres -= 14999;
            TextView result = findViewById(R.id.result);
            result.setText(String.valueOf(totalres));
        }
    }


}