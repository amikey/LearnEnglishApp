package com.example.englishquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class DayandMonthActivity extends AppCompatActivity {

   ListView simpleList;
    ArrayList<Item> animalList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dayandmonth_category_activity_main);
        init();
        simpleList = (ListView) findViewById(R.id.simpleListView);
        animalList.add(new Item("February",R.drawable.feb,R.raw.february));
        animalList.add(new Item("March",R.drawable.march,R.raw.march));
        animalList.add(new Item("April",R.drawable.april,R.raw.april));
        animalList.add(new Item("June",R.drawable.junr,R.raw.june));
        animalList.add(new Item("August",R.drawable.aug,R.raw.august));
        animalList.add(new Item("October",R.drawable.oct,R.raw.october));
        animalList.add(new Item("November",R.drawable.nov,R.raw.november));
        animalList.add(new Item("December",R.drawable.dec,R.raw.december));
        animalList.add(new Item("Monday",R.drawable.monday,R.raw.monday));
        animalList.add(new Item("Tuesday",R.drawable.tuesday,R.raw.tuesday));
        animalList.add(new Item("Wednesday",R.drawable.wednesday,R.raw.wednesday));
        animalList.add(new Item("Friday",R.drawable.friday,R.raw.friday));
        animalList.add(new Item("Saturday",R.drawable.saturday,R.raw.satirday));
        animalList.add(new Item("Sunday",R.drawable.sunday,R.raw.sunday));

        MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,animalList);
        simpleList.setAdapter(myAdapter);

    }


    public Button but0;

    public void init() {
        but0 = (Button) findViewById(R.id.dayandmonthsdictionary);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(DayandMonthActivity.this,DictionaryDayandMonthActivity.class);
                startActivity(toy);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}