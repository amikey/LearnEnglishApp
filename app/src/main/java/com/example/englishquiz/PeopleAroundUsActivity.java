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

public class PeopleAroundUsActivity extends AppCompatActivity {

    ListView simpleList;
    ArrayList<Item> animalList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.peoplearoundus_category_activity_main);
        init();
        simpleList = (ListView) findViewById(R.id.simpleListView);
        animalList.add(new Item("Baby",R.drawable.baby,R.raw.baby));
        animalList.add(new Item("Boy",R.drawable.boy,R.raw.boy));
        animalList.add(new Item("Children",R.drawable.children,R.raw.childrent));
        animalList.add(new Item("Girl",R.drawable.girl,R.raw.girl));
        animalList.add(new Item("Granddaughter",R.drawable.granddaughter,R.raw.granddaughter));
        animalList.add(new Item("Grandparents",R.drawable.grandparents,R.raw.grandparents));
        animalList.add(new Item("Grandson",R.drawable.grandson,R.raw.grandson));
        animalList.add(new Item("Husband",R.drawable.husband,R.raw.husband));
        animalList.add(new Item("Man",R.drawable.man,R.raw.man));
        animalList.add(new Item("Parent",R.drawable.parent,R.raw.parent));
        animalList.add(new Item("Wife",R.drawable.wife,R.raw.wife));
        animalList.add(new Item("Woman",R.drawable.woman,R.raw.woman));

        MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,animalList);
        simpleList.setAdapter(myAdapter);

    }

    public Button but0;

    public void init() {
        but0 = (Button) findViewById(R.id.peoplearoundusdictionary);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(PeopleAroundUsActivity.this,DictionaryPeopleAroundUsActivity.class);
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
