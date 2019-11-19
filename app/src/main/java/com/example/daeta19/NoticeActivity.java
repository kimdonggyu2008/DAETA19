package com.example.daeta19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class NoticeActivity extends AppCompatActivity {

    private ImageButton btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        ArrayList<NoticeClass> data = new ArrayList<>();
        data.add(new NoticeClass("notice1", "date"));
        data.add(new NoticeClass("notice2", "date"));
        data.add(new NoticeClass("notice3", "date"));
        data.add(new NoticeClass("notice4", "date"));
        NoticeAdapter adapter = new NoticeAdapter(data);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        // 뒤로가기
        btn_back = (ImageButton) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
