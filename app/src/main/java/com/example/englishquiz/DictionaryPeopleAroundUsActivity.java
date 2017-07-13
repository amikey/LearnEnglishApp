package com.example.englishquiz;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class DictionaryPeopleAroundUsActivity extends AppCompatActivity {

    ListView simpleList2;
    ArrayList<Item2> dictionary =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dictionary_activity_main);
        simpleList2 = (ListView) findViewById(R.id.simpleListView2);
        dictionary.add(new Item2("Baby","bayi"));
        dictionary.add(new Item2("Boy","laki - laki"));
        dictionary.add(new Item2("Children","anak - anak"));
        dictionary.add(new Item2("Girl","perempuan"));
        dictionary.add(new Item2("Granddaughter","cucu perempuan"));
        dictionary.add(new Item2("Grandparents","Kakek nenek"));
        dictionary.add(new Item2("Grandson","Cucu laki - laki"));
        dictionary.add(new Item2("Husband","SUami"));
        dictionary.add(new Item2("Man","Pria"));
        dictionary.add(new Item2("Parent","Orang tua"));
        dictionary.add(new Item2("Wife","Istri"));
        dictionary.add(new Item2("Woman","Wanita"));
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
