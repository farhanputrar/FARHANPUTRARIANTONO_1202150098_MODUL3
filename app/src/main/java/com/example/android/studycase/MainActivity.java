package com.example.android.studycase;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter Adapterz;
    public static ArrayList<Model> datazz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.listRecycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        datazz = new ArrayList<>();

        Adapterz = new Adapter(this, datazz);
        recyclerView.setAdapter(Adapterz);

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

        initialiseData();
    }

    private void initialiseData() {
        String[] title = getResources().getStringArray(R.array.title);
        String[] desc1 = getResources().getStringArray(R.array.descl);
        TypedArray airImageResource = getResources().obtainTypedArray(R.array.merek_image);
        datazz.clear();

        for (int i=0; i<title.length; i++){
            datazz.add(new Model(title[i], desc1[i], airImageResource.getResourceId(i, 0)));
        }

        airImageResource.recycle();

        Adapterz.notifyDataSetChanged();
    }
    }


}
