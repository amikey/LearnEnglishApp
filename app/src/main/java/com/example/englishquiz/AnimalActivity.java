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

public class AnimalActivity extends AppCompatActivity {

    ListView simpleList;
    ArrayList<Item> animalList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animal_category_activity_main);
        init();
        simpleList = (ListView) findViewById(R.id.simpleListView);
        animalList.add(new Item("Butterfly",R.drawable.butterfly,R.raw.butterfly));
        animalList.add(new Item("Camel",R.drawable.camel,R.raw.camel));
        animalList.add(new Item("Cat",R.drawable.cat,R.raw.cat));
        animalList.add(new Item("Chicken",R.drawable.chicken,R.raw.chicken));
        animalList.add(new Item("Cow",R.drawable.cow,R.raw.cow));
        animalList.add(new Item("Deer",R.drawable.deer,R.raw.deer));
        animalList.add(new Item("Dog",R.drawable.dog,R.raw.dog));
        animalList.add(new Item("Dolphin",R.drawable.dolphin,R.raw.dolphin));
        animalList.add(new Item("Elephant",R.drawable.elephant,R.raw.elephant));
        animalList.add(new Item("Frog",R.drawable.frog,R.raw.frog));
        animalList.add(new Item("Giraffe",R.drawable.giraffe,R.raw.giraffe));
        animalList.add(new Item("Gorilla",R.drawable.gorilla,R.raw.gorilla));
        animalList.add(new Item("Kangaroo",R.drawable.kangaroo,R.raw.kangaroo));
        animalList.add(new Item("Mosquito",R.drawable.mosquito,R.raw.mosquito));
        animalList.add(new Item("Rabbit",R.drawable.rabbit,R.raw.rabbit));
        animalList.add(new Item("Spider",R.drawable.spider,R.raw.spider));
        animalList.add(new Item("Squirrel",R.drawable.squirrel,R.raw.squirrel));
        animalList.add(new Item("Starfish",R.drawable.starfish,R.raw.starfish));
        animalList.add(new Item("Tiger",R.drawable.tiger,R.raw.tiger));
        animalList.add(new Item("Turtle",R.drawable.turtle,R.raw.turtle));
        animalList.add(new Item("Zebra",R.drawable.zebra,R.raw.zebra));

        MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,animalList);
        simpleList.setAdapter(myAdapter);

    }


    public Button but0;

    public void init() {
        but0 = (Button) findViewById(R.id.animaldictionary);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(AnimalActivity.this,DictionaryAnimalActivity.class);
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
