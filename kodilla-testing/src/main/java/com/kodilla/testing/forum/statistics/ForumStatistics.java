package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics implements Statistics {
    Statistics statistics;

    public int calculateAdvStatistics(Statistics statistics) {
        this.statistics = statistics;
        return 0;

    }

    @Override
    public List<String> usersNames() {
        return null;
    }

    @Override
    public int postsCount() {
        return 0;
    }

    @Override
    public int commentsCount() {
        return 0;
    }
}