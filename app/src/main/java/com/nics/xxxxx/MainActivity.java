package com.nics.xxxxx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String firstWord = "nicos";
        String lastWord = "waves";
       // TextView textView = findViewById(R.id.hello);
       // Spannable spannable = new SpannableString(firstWord + lastWord);
       // spannable.setSpan(new ForegroundColorSpan(firstWordColor),0 , firstWord.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
       // spannable.setSpan(new ForegroundColorSpan(lastWord),firstWord.length(), firstWord.length() + lastWord.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
       /// textView.setText(firstWord + lastWord);


    }
}
