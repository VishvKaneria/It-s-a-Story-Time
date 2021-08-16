package com.example.itsstorytime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Home_Activity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listView = findViewById(R.id.list_view);
        String[] title_story = getResources().getStringArray(R.array.story_title);
        String[] desc_story = getResources().getStringArray(R.array.desc_story);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, title_story);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String title = title_story[i];
                //Toast.makeText(MainActivity.this, "title", Toast.LENGTH_SHORT).show();
                String title_position = desc_story[i];
                Intent intent = new Intent(Home_Activity.this, StoryActivity.class);
                intent.putExtra("story_title", title);
                intent.putExtra("story", title_position);
                startActivity(intent);
            }
        });
    }
}