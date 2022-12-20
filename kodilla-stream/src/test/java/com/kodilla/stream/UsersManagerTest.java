package com.kodilla.stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    static UsersManager usersManager;

    @BeforeAll
    public static void setUp() {
        usersManager = new UsersManager();
    }

    @Test
    public void testFilterChemistsGroupUsernames() {
        assertEquals(2, usersManager.filterChemistsGroupUsernames().size());
    }

    @Test
    public void testUsersOlderThan() {
        assertEquals(5, usersManager.usersOlderThan(30).size());
    }

    @Test
    public void testUserNamesWithMoreThan13Letters() {
        assertEquals(4, usersManager.userNamesWithMoreThan13Letters(13).size());
    }

    @Test
    public void testFilterSecurityGroupUsernames() {
        assertTrue(1 == usersManager.filterSecurityGroupUsernames().size());
    }
}