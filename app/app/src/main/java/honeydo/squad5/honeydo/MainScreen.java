package honeydo.squad5.honeydo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Date;

public class MainScreen extends AppCompatActivity {

    ArrayList<Task> taskList;
    RecyclerView taskListView;
    TaskAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        Button settings = (Button) findViewById(R.id.settings);
        Button rewards = (Button) findViewById(R.id.rewards);
        Button add = (Button) findViewById(R.id.add);

        taskListView = findViewById(R.id.task_list);
        taskListView.setHasFixedSize(true);
        taskListView.setLayoutManager(new LinearLayoutManager(this));

        taskList = new ArrayList<Task>();

        taskList.add(new Task("Test body", "Test 1", true, null, null, null));
        taskList.add(new Task("Test body", "Test 2", true, null, null, null));
        taskList.add(new Task("Test body", "Test 3", true, null, null, null));
        taskList.add(new Task("Test body", "Test 4", true, null, null, null));
        taskList.add(new Task("Test body", "Test 5", true, null, null, null));

        adapter = new TaskAdapter(this, taskList);
        taskListView.setAdapter(adapter);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

}
