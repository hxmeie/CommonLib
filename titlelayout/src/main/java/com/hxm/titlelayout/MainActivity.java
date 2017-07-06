package com.hxm.titlelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TitleLayout titleLayout= (TitleLayout) findViewById(R.id.layout_title);
        titleLayout.setTitleClickListener(new TitleLayout.TitleClickListener() {
            @Override
            public void click() {
                titleLayout.setTitleText("哦哦哦");
                Toast.makeText(MainActivity.this,"点击标题",Toast.LENGTH_SHORT).show();
            }
        });
        titleLayout.setRightIconClickListener(new TitleLayout.TitleClickListener() {
            @Override
            public void click() {
                Toast.makeText(MainActivity.this,"点击右侧图标",Toast.LENGTH_SHORT).show();
            }
        });
        titleLayout.setRightTextClickListener(new TitleLayout.TitleClickListener() {
            @Override
            public void click() {
                titleLayout.setRightTextVisible(false);
                Toast.makeText(MainActivity.this,"点击右侧文字",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
