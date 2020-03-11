package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {
    private int usersCount;
    private int postCount;
    private int commentsCount;
    private double averageUserPost;
    private double averageUserComment;
    private double averageCommentPost;


    public void calculateAdvStatistics(Statistics statistics) {
        countUsers(statistics);
        countPosts(statistics);
    }

    private void countPosts(Statistics statistics) {
        postCount = statistics.postsCount();
    }

    private void countUsers(Statistics statistics) {
        usersCount = statistics.usersNames().size();
    }

    public void showStatistic() {

    }
}
