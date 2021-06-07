package com.example.statelist;

import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView tvt;
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvt = (TextView) findViewById(R.id.textView);

        tvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvt.setTextColor(ContextCompat.getColorStateList(context, R.color.color_state_list));
            }
        });
    }
}