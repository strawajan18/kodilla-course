package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> theMap = forum.getList().stream()
                 .filter(x -> x.getSex() == ('M'))
                 .filter(forumUser -> forumUser.getBirthDate().getYear() <= 2000)
                 .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                 .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));
                 theMap.entrySet().stream()
                 .map(entry -> entry.getKey() + ": " + entry.getValue())
                 .forEach(System.out::println);


    }
}
