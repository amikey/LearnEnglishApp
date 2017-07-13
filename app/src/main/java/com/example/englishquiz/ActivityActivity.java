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

public class ActivityActivity extends AppCompatActivity {

   ListView simpleList;
    ArrayList<Item> animalList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        init();

        animalList.add(new Item("Cooking",R.drawable.cooking,R.raw.cooking));
        animalList.add(new Item("Crying",R.drawable.crying,R.raw.crying));
        animalList.add(new Item("Dancing",R.drawable.dancing,R.raw.dancing));
        animalList.add(new Item("Drinking",R.drawable.drinking,R.raw.drinking));
        //animalList.add(new Item("Driving",R.drawable.driving,R.raw.driving));
        animalList.add(new Item("Eating",R.drawable.eating,R.raw.eating));
        animalList.add(new Item("Hiding",R.drawable.hiding,R.raw.hiding));
       animalList.add(new Item("Jumping",R.drawable.jumping,R.raw.jumping));
        animalList.add(new Item("Knocking",R.drawable.knocking,R.raw.knocking));
        animalList.add(new Item("Reading",R.drawable.reading,R.raw.dog));
        animalList.add(new Item("Riding",R.drawable.riding,R.raw.riding));
        animalList.add(new Item("Singing",R.drawable.singing,R.raw.singing));
        animalList.add(new Item("Sitting",R.drawable.sitting,R.raw.sitting));
        animalList.add(new Item("Washing",R.drawable.washing,R.raw.washing));
        animalList.add(new Item("Writing",R.drawable.writing,R.raw.writing));

        MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,animalList);
        simpleList.setAdapter(myAdapter);

    }

    public Button but0;

    public void init() {
        but0 = (Button) findViewById(R.id.activitydictionary);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(ActivityActivity.this,DictionaryActivityActivity.class);
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
