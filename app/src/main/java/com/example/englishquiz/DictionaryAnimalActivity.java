package com.example.englishquiz;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class DictionaryAnimalActivity extends AppCompatActivity {

    ListView simpleList2;
    ArrayList<Item2> dictionary =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dictionary_activity_main);
        simpleList2 = (ListView) findViewById(R.id.simpleListView2);
        dictionary.add(new Item2("Butterfly","Kupu - kupu"));
        dictionary.add(new Item2("Camel","Unta"));
        dictionary.add(new Item2("Cat","Kucing"));
        dictionary.add(new Item2("Chicken","Ayam"));
        dictionary.add(new Item2("Cow","Sapi"));
        dictionary.add(new Item2("Deer","Rusa"));
        dictionary.add(new Item2("Dog","Anjing"));
        dictionary.add(new Item2("Dolphin","Lumba - lumba"));
        dictionary.add(new Item2("Elephant","Gajah"));
        dictionary.add(new Item2("Frog","Katak"));
        dictionary.add(new Item2("Giraffe","Jerapah"));
        dictionary.add(new Item2("Gorilla","Gorila"));
        dictionary.add(new Item2("Kangaroo","Kanguru"));
        dictionary.add(new Item2("Mosquito","Nyamuk"));
        dictionary.add(new Item2("Rabbit","Kelinci"));
        dictionary.add(new Item2("Spider","Laba-laba"));
        dictionary.add(new Item2("Squirrel","Tupai"));
        dictionary.add(new Item2("Starfish","Bintang Laut"));
        dictionary.add(new Item2("Tiger","Harimau"));
        dictionary.add(new Item2("Turtle","Penyu"));
        dictionary.add(new Item2("Zebra","Zebra"));
        MyAdapter2 myAdapter2=new MyAdapter2(this,R.layout.list_view_items2,dictionary);
        simpleList2.setAdapter(myAdapter2);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item2) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item2.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item2);
    }
}
