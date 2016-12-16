package com.udacity.gradle.builditbigger;

import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by kikkos on 12/16/2016.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class EndpointAsyncTaskTest {

    @Test
    public void validateAsyncTask() throws Exception{
        EndpointAsyncTask task = new EndpointAsyncTask();
        String result = task.execute().get(30, TimeUnit.SECONDS);

        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

}