package com.example.englishquiz;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class DictionaryNumberActivity extends AppCompatActivity {

    ListView simpleList2;
    ArrayList<Item2> dictionary =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dictionary_activity_main);
        simpleList2 = (ListView) findViewById(R.id.simpleListView2);
        dictionary.add(new Item2("Eighteen","Delapan belas"));
        dictionary.add(new Item2("Eighty","Delapan puluh"));
        dictionary.add(new Item2("Eleven","Sebelas"));
        dictionary.add(new Item2("Fifteen","Luma belas"));
        dictionary.add(new Item2("Fifty","Lima puluh"));
        dictionary.add(new Item2("Forty","Empat puluh"));
        dictionary.add(new Item2("Fourteen","Empat belas"));
        dictionary.add(new Item2("Nineteen","Sembilan belas"));
        dictionary.add(new Item2("Ninety","Sembilan puluh"));
        dictionary.add(new Item2("Seventeen","Tujuh belas"));
        dictionary.add(new Item2("Seventy","Tujuh puluh"));
        dictionary.add(new Item2("Sixteen","Enam belas"));
        dictionary.add(new Item2("Sixty","Enam puluh"));
        dictionary.add(new Item2("Ten","Sepuluh"));
        dictionary.add(new Item2("Thirteen","TIga belas"));
        dictionary.add(new Item2("Twelve","Dua belas"));
        dictionary.add(new Item2("Twenty","Dua puluh"));

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
