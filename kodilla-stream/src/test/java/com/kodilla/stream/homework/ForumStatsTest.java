package com.kodilla.stream.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    static ForumStats forumStats;

    @BeforeAll
    public static void setUp() {
        forumStats = new ForumStats();
    }

    @Test
    public void testAverageNumberOfPostsFromUsersWithMoreOrEqualsThan40Years() {
        assertEquals(2.25, ForumStats.averageNumberOfPostsFromUsersWithMoreOrEqualsThan40Years());
    }

    @Test
    public void testAverageNumberOfPostsFromUsersWithLessThan40Years() {
        assertEquals(2382, ForumStats.averageNumberOfPostsFromUsersWithLessThan40Years());
    }
}