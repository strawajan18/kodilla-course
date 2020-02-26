package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public List<ForumUser> getList() {
        theForumUserList.add(new ForumUser(8890, "Balenciaga", 'F', 234,1987, 9, 17));
        theForumUserList.add(new ForumUser(8753, "LionKing33",'M',345, 1999, 7, 30));
        theForumUserList.add(new ForumUser(8553, "Green-ish",'F',456, 2000, 1, 18));
        theForumUserList.add(new ForumUser(8778, "Trish",'F',3768, 1990, 6, 6));
        theForumUserList.add(new ForumUser(8759, "Bangladesh",'M',789, 1998, 5, 30));
        theForumUserList.add(new ForumUser(8993, "Justa",'F',3455, 1994, 2, 15));
        theForumUserList.add(new ForumUser(8678, "Agarius5",'M',1256, 1995, 3, 27));
        theForumUserList.add(new ForumUser(8567, "XAmosX",'M',777, 1996, 12, 12));
        return new ArrayList<>(theForumUserList);
    }
}
