package com.kodilla.testing.forum;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumTestSuite2 {
    private Statistics mockStatistics = mock(Statistics.class);
    private ForumStatistics forumStatistics = new ForumStatistics();


    @Test
    public void testWithZeroPosts() {
        //Given
        when(mockStatistics.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(forumStatistics.getPostCount(), 0, 0.01);
        Assert.assertEquals(forumStatistics.getAverageUserPost(), 0, 0.01);

    }

    @Test
    public void testWithThousandPosts() {
        //Given
        when(mockStatistics.postsCount()).thenReturn(1000);
        List<String> users = new ArrayList<>();
        for (int n = 0; n < 10; n++) {
            users.add("User");
        }
        when(mockStatistics.usersNames()).thenReturn(users);
        //When
        forumStatistics.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(forumStatistics.getPostCount(), 1000, 0.01);
        Assert.assertEquals(forumStatistics.getAverageUserPost(), 100, 0.01);
    }

    @Test
    public void testWithZeroComments() {
        //Given
        when(mockStatistics.commentsCount()).thenReturn(0);
        List<String> users = new ArrayList<>();
        for (int n = 0; n < 10; n++) {
            users.add("User");
        }
        when(mockStatistics.usersNames()).thenReturn(users);
        //When
        forumStatistics.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(forumStatistics.getCommentsCount(), 0, 0.01);
        Assert.assertEquals(forumStatistics.getAverageUserComment(), 0, 0.01);
    }

    @Test
    public void testWithLessCommentsThanPosts() {
        //Given
        when(mockStatistics.commentsCount()).thenReturn(5);
        List<String> users = new ArrayList<>();
        for (int n = 0; n < 10; n++) {
            users.add("User");
        }
        when(mockStatistics.usersNames()).thenReturn(users);
        //When
        forumStatistics.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(forumStatistics.getCommentsCount(), 5, 0.01);
        Assert.assertEquals(forumStatistics.getAverageUserComment(), 0.5, 0.01);
    }

    @Test
    public void testWithMoreCommentsThanPosts() {
        //Given
        when(mockStatistics.commentsCount()).thenReturn(100);
        List<String> users = new ArrayList<>();
        for (int n = 0; n < 10; n++) {
            users.add("User");
        }
        when(mockStatistics.usersNames()).thenReturn(users);
        //When
        forumStatistics.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(forumStatistics.getCommentsCount(), 100, 0.01);
        Assert.assertEquals(forumStatistics.getAverageUserComment(), 10, 0.01);
    }

    @Test
    public void testWithZeroUsers() {
        //Given
        List<String> users = new ArrayList<>();
        when(mockStatistics.usersNames()).thenReturn(users);
        //When
        forumStatistics.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(forumStatistics.getUsersCount(), 0, 0.01);
        Assert.assertEquals(forumStatistics.getAverageUserComment(), 0, 0.01);
        Assert.assertEquals(forumStatistics.getAverageUserPost(), 0, 0.01);
    }

    @Test
    public void testWithHundredUsers() {
        //Given
        List<String> users = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            users.add("User");
        }
        when(mockStatistics.usersNames()).thenReturn(users);
        when(mockStatistics.commentsCount()).thenReturn(1000);
        when(mockStatistics.postsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(forumStatistics.getUsersCount(), 100, 0.01);
        Assert.assertEquals(forumStatistics.getAverageUserPost(), 1, 0.01);
        Assert.assertEquals(forumStatistics.getAverageUserComment(), 10, 0.01);

    }
}
