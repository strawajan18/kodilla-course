package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userNickname;
    private final char sex;
    private final int numberOfPosts;
    private final LocalDate birthDate;


    public ForumUser(final int userID, final String userNickname, final char sex, final int numberOfPosts , final int yearOfBirth, final int monthOfBirth, final int dayOfBirth) {
        this.userID = userID;
        this.userNickname = userNickname;
        this.sex = sex;
        this.numberOfPosts = numberOfPosts;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public int getUserID() {
        return userID;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public char getSex() {
        return sex;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userNickname='" + userNickname + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
