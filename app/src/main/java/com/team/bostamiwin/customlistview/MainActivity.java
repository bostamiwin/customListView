package com.team.bostamiwin.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[]text;
    ListView listView;
    int[]picture={R.drawable.c,R.drawable.c,R.drawable.c,R.drawable.c,R.drawable.c};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=getResources().getStringArray(R.array.text);

        listView=findViewById(R.id.list_item);

        MyAdapter adapter=new MyAdapter(MainActivity.this,text,picture);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),""+position,Toast.LENGTH_LONG).show();
            }
        });
    }
}
