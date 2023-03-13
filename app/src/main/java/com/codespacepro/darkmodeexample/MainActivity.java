package com.codespacepro.darkmodeexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    CardView SelectTheme;
    ImageView ThemeIcon;
    TextView ThemeText, LogoText;
    LinearLayout layout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        LogoText = (TextView) findViewById(R.id.logo_tex);
        layout = (LinearLayout) findViewById(R.id.LinearLayout);
        ThemeIcon = (ImageView) findViewById(R.id.theme_icon);
        ThemeText = (TextView) findViewById(R.id.theme_text);
        SelectTheme = (CardView) findViewById(R.id.cardview_select);

        SelectTheme.setOnClickListener(new View.OnClickListener() {
            boolean isFirstTime = true;

            @Override
            public void onClick(View v) {

                if (isFirstTime) {
                    ThemeIcon.setImageResource(R.drawable.baseline_wb_sunny_24);
                    ThemeText.setText("Enable Light Mode");
                    layout.setBackgroundColor(Color.BLACK);
                    LogoText.setTextColor(Color.WHITE);
                    isFirstTime = false;
                } else {
                    ThemeIcon.setImageResource(R.drawable.baseline_dark_mode_24);
                    ThemeText.setText("Enable Dark Mode");
                    layout.setBackgroundColor(Color.WHITE);
                    LogoText.setTextColor(Color.BLACK);
                    isFirstTime = true;
                }

            }
        });
    }
}