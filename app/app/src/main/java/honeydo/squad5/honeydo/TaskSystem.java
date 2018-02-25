package honeydo.squad5.honeydo;

import java.util.ArrayList;

/**
 * Created by aaron on 2/25/2018.
 */

public class TaskSystem {
    private static ArrayList<Task> taskList = new ArrayList<Task>();

    public static ArrayList<Task> getTaskList() {
        return taskList;
    }

    public static void addTask(Task t)
    {
        taskList.add(t);
    }
}
