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

public class NumberActivity extends AppCompatActivity {

   ListView simpleList;
    ArrayList<Item> animalList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_category_activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        init();
        //animalList.add(new Item("Eight",R.drawable.eight,R.raw.ei));
        animalList.add(new Item("Eighteen",R.drawable.eighteen,R.raw.eighteen));
        animalList.add(new Item("Eighty",R.drawable.eighty,R.raw.eighty));
        animalList.add(new Item("Eleven",R.drawable.eleven,R.raw.eleven));
        animalList.add(new Item("Fifteen",R.drawable.fifteen,R.raw.fifteen));
        animalList.add(new Item("Fifty",R.drawable.fifty,R.raw.fifty));
        animalList.add(new Item("Forty",R.drawable.forty,R.raw.fourty));
        animalList.add(new Item("Fourteen",R.drawable.fourteen,R.raw.fourteen));
        //animalList.add(new Item("Hundred",R.drawable.hundred,R.raw.));
        animalList.add(new Item("Nineteen",R.drawable.nineteen,R.raw.nineteen));
        animalList.add(new Item("Ninety",R.drawable.ninty,R.raw.ninety));
        animalList.add(new Item("Seventeen",R.drawable.seventeen,R.raw.seventeen));
        animalList.add(new Item("Seventy",R.drawable.seventy,R.raw.seventy));
        animalList.add(new Item("Sixteen",R.drawable.sixteen,R.raw.sixteen));
        animalList.add(new Item("Sixty",R.drawable.sixty,R.raw.sixty));
        animalList.add(new Item("Ten",R.drawable.ten,R.raw.ten));
        animalList.add(new Item("Thirteen",R.drawable.thirteen,R.raw.thirteen));
        //animalList.add(new Item("Thirty",R.drawable.thirty,R.raw.thirteen));
        animalList.add(new Item("Twelve",R.drawable.twelve,R.raw.twelve));
        animalList.add(new Item("Twenty",R.drawable.twenty,R.raw.twenty));
        MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,animalList);
        simpleList.setAdapter(myAdapter);

    }

    public Button but0;

    public void init() {
        but0 = (Button) findViewById(R.id.numberdictionary);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(NumberActivity.this,DictionaryNumberActivity.class);
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
