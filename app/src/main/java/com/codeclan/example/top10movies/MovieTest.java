package com.codeclan.example.top10movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 23/02/2017.
 */

public class MovieTest {

    Movie movie1;
    Movie movie2;


    @Before
    public void before() {
        movie1 = new Movie("Me, Myself & Irene", "Comedy", 1);
        movie2 = new Movie("Happy Gilmore", "Comedy", 2);
    }

    @Test
    public void testGetTitle() {
        assertEquals("Me, Myself & Irene", movie1.getTitle());
    }

}

