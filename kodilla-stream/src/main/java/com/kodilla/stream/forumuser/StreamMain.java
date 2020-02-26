package com.kodilla.stream.forumuser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> theMap = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() = 'M')
                .filter(forumUser -> forumUser.getBirthDate.of(yearOfBirth) <= 2000)
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser: :getUserID, forumUser -> forumUser));

    }
}
