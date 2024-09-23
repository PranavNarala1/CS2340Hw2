package com.example.android_assignment_fa_2024;

import org.junit.Test;

import static org.junit.Assert.*;


import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    // TODO 7: Write a unit test for ensuring correct behavior of the addTask function you implemented in TODO 2 in TaskManagerSingleton
    @Test
    public void add_task_test() {

        //Creating task manager instance with three tests
        TaskManagerSingleton taskManager = TaskManagerSingleton.getInstance();
        taskManager.getTasks().clear();
        Task newTask1 = new Task("Test 1 task");
        Task newTask2 = new Task("Test 2 task");
        Task newTask3 = new Task("Do laundry");

        taskManager.addTask(newTask1);
        taskManager.addTask(newTask2);
        taskManager.addTask(newTask3);

        List<Task> tasks = taskManager.getTasks();
        //Making sure there are only 3 tasks
        assertEquals(3, tasks.size());


        assertEquals("Test 1 task", tasks.get(0).getDescription());
        assertEquals("Test 2 task", tasks.get(1).getDescription());
        assertEquals("Do laundry", tasks.get(2).getDescription());

        assertFalse(tasks.get(0).isCompleted());
        assertFalse(tasks.get(1).isCompleted());
        assertFalse(tasks.get(2).isCompleted());


    }
}