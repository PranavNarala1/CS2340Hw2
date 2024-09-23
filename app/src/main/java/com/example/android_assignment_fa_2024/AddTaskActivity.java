package com.example.android_assignment_fa_2024;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class AddTaskActivity extends AppCompatActivity {
    private List<Task> tasks;

    private EditText taskDescription; //Creating instance vars for button and edit text
    private Button btnSubmitTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        // TODO 6: Assign respective EditText and button to XML bindings
        // HINT: look at the error messages below to see what you should name the different entities

        //Setting button submit task first and then task description with findViewById method
        btnSubmitTask = findViewById(R.id.btnSubmitTask);

        taskDescription = findViewById(R.id.taskDescription);




        // DO NOT MODIFY
        btnSubmitTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String description = taskDescription.getText().toString().trim();
                if (!description.isEmpty()) {
                    Task task = new Task(description);
                    TaskManagerSingleton.getInstance().addTask(task);
                    Intent intent = new Intent(AddTaskActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
