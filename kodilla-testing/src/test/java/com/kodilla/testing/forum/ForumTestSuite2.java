package com.kodilla.testing.forum;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumTestSuite2 {

    @Test
    public void test() {
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics mock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        userNames.add("Antoni");
        when(mock.usersNames()).thenReturn(userNames);
        forumStatistics.calculateAdvStatistics(mock);

    }

}
