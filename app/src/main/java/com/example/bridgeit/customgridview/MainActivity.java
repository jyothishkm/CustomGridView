package com.example.bridgeit.customgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView grid;
    String[] web = {"Google","Github","Instagram","Facebook","Flickr",
            "Pinterest","Quora","Twitter","Vimeo","WordPress","Youtube",
            "Stumbleupon","SoundCloud","Reddit","Blogger"};

    int[] image = {R.drawable.google,R.drawable.github,R.drawable.instagram,
            R.drawable.facebook,R.drawable.flickr,R.drawable.pinterest,
            R.drawable.quora,R.drawable.twitter,R.drawable.vimeo,R.drawable.wordpress,
            R.drawable.youtube,R.drawable.stumbleupon,R.drawable.soundcloud,R.drawable.reddit,R.drawable.blogger};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGrid adapter = new CustomGrid(this,web,image);
        grid = (GridView)findViewById(R.id.gridview);
        grid.setAdapter(adapter);

grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(MainActivity.this,web[position],Toast.LENGTH_SHORT).show();
    }
});
    }
}
