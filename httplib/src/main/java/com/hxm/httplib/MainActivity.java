package com.hxm.httplib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.blankj.utilcode.util.ToastUtils;
import com.hxm.httplib.http.Request;
import com.hxm.httplib.http.manger.BaseSubscriber;
import com.hxm.httplib.http.manger.NetException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        final TextView textView = (TextView) findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Request.getInstance().searchBook("Android", 1)
                        .subscribe(new BaseSubscriber<Book>() {
                            @Override
                            public void onError(NetException.ResponseThrowable e) {
                                ToastUtils.showShort(e.message);
                            }

                            @Override
                            public void onNext(Book book) {
                                textView.setText(book.toString());
                            }
                        });
            }
        });
    }
}
