package com.in28minutes.junit;

import com.in28minutes.junit.MyMath;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {

    private MyMath math = new MyMath();

    @Test
    public void calculateSum_ThreeMemberArray(){
        assertEquals(6, math.calculateSum(new int[]{1, 2, 3}));
    }

    @Test
    public void calculateSum_ZeroLenghtArray(){
        assertEquals(0, math.calculateSum(new int[]{}));
    }
}
