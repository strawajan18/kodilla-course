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

    public int getUsersCount() {
        return usersCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public double getAverageUserPost() {
        return averageUserPost;
    }

    public double getAverageUserComment() {
        return averageUserComment;
    }

    public double getAverageCommentPost() {
        return averageCommentPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        averageUserPost = calculateAverageUserPost();
        averageUserComment = calculateAverageUserComment();
        averageCommentPost = calculateAverageCommentPost();
    }

    private double calculateAverageUserPost() {
        if(usersCount > 0) {
            return (double)postCount/usersCount;
        } else {
            return 0;
        }
    }

    private double calculateAverageUserComment() {
        if(usersCount > 0) {
            return (double)commentsCount/usersCount;
        } else {
            return 0;
        }
    }

    private double calculateAverageCommentPost() {
        if(postCount >0) {
            return (double)commentsCount/postCount;
        } else {
            return 0;
        }
    }

    public void showStatistic() {
        System.out.println("Numbers of users : " + usersCount );
        System.out.println("Numbers of posts : " + postCount );
        System.out.println("Numbers of comments : " + commentsCount);
        System.out.println("Average of posts per user: " + averageUserPost);
        System.out.println("Average of comments per user: " + averageUserComment);
        System.out.println("Average of comments per post: " + averageCommentPost);
    }
}
