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

public class TimesActivity extends AppCompatActivity {

    ListView simpleList;
    ArrayList<Item> animalList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.times_category_activity_main);
        init();
        simpleList = (ListView) findViewById(R.id.simpleListView);
        animalList.add(new Item("Tiger",R.drawable.tiger,R.raw.dog));
        animalList.add(new Item("Elephant",R.drawable.elephant,R.raw.dog));
        animalList.add(new Item("Dog",R.drawable.dog,R.raw.dog));
        animalList.add(new Item("Cat",R.drawable.cat,R.raw.dog));
        animalList.add(new Item("Tiger",R.drawable.tiger,R.raw.dog));
        animalList.add(new Item("Elephant",R.drawable.elephant,R.raw.dog));
        animalList.add(new Item("Dog",R.drawable.dog,R.raw.dog));
        animalList.add(new Item("Cat",R.drawable.cat,R.raw.dog));
        animalList.add(new Item("Tiger",R.drawable.tiger,R.raw.dog));
        animalList.add(new Item("Elephant",R.drawable.elephant,R.raw.dog));
        animalList.add(new Item("Dog",R.drawable.dog,R.raw.dog));
        animalList.add(new Item("Cat",R.drawable.cat,R.raw.dog));
        animalList.add(new Item("Tiger",R.drawable.tiger,R.raw.dog));
        animalList.add(new Item("Elephant",R.drawable.elephant,R.raw.dog));
        animalList.add(new Item("Dog",R.drawable.dog,R.raw.dog));
        animalList.add(new Item("Cat",R.drawable.cat,R.raw.dog));

        MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,animalList);
        simpleList.setAdapter(myAdapter);

    }

    public Button but0;

    public void init() {
        but0 = (Button) findViewById(R.id.timesdictionary);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(TimesActivity.this,DictionaryTimesActivity.class);
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
