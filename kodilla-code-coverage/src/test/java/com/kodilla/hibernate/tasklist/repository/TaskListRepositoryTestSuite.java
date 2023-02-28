package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate more";

    @Test
    void TaskListRepositoryTestSuite() {
        //Given
        TaskList taskList = new TaskList(DESCRIPTION, "new");
        taskListRepository.save(taskList);
        String description = taskList.getDescription();

        //when
        List<TaskList> readTasks = taskListRepository.findByListName("new");

        //Then
        Assertions.assertEquals(1, readTasks.size());

        //CleanUp
        int id = readTasks.get(0).getId();
        taskListRepository.deleteById(id);
    }
}