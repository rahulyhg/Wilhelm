/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.util;

import com.radixpro.share.exceptions.ParametersInWrongSequenceException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RangeTest {

    private final double margin = 0.000000001;


    @Test
    public void limitToRange() throws Exception {
        double value = 100.0;
        double expected = 20.0;
        assertEquals(expected, Range.limitToRange(value, 10, 50), margin);
    }

    @Test
    public void limitToRangeTooLow() throws Exception {
        double value = 10.0;
        double expected = 80.0;
        assertEquals(expected, Range.limitToRange(value, 20, 90), margin);
    }

    @Test
    public void limitToRangeTooHigh() throws Exception {
        double value = 300.0;
        double expected = 20.0;
        assertEquals(expected, Range.limitToRange(value, 20, 90), margin);
    }

    @Test
    public void limitToRangeBottomLimit() throws Exception {
        double value = 20.0;
        double expected = 20.0;
        assertEquals(expected, Range.limitToRange(value, 20, 90), margin);
    }

    @Test
    public void limitToRangeTopLimit() throws Exception {
        double value = 90.0;
        double expected = 20.0;
        assertEquals(expected, Range.limitToRange(value, 20, 90), margin);
    }

    @Test (expected = ParametersInWrongSequenceException.class)
    public void limitToRangeLimitsSequenceError() throws Exception {
        double value = 90.0;
        Range.limitToRange(value, 90, 20);
    }

    @Test
    public void limitToCircle() throws Exception {
        double value = 100.0;
        double expected = 100.0;
        assertEquals(expected, Range.limitToCircle(value), margin);
    }

    @Test
    public void limitToCircleTooLow() throws Exception {
        double value = -100.0;
        double expected = 260.0;
        assertEquals(expected, Range.limitToCircle(value), margin);
    }

    @Test
    public void limitToCircleTooHigh() throws Exception {
        double value = 500.0;
        double expected = 140.0;
        assertEquals(expected, Range.limitToCircle(value), margin);
    }

    @Test
    public void limitToCircleBottomLimit() throws Exception {
        double value = 0.0;
        double expected = 0.0;
        assertEquals(expected, Range.limitToCircle(value), margin);
    }

    @Test
    public void limitToCircleTopLimit() throws Exception {
        double value = 360.0;
        double expected = 0.0;
        assertEquals(expected, Range.limitToCircle(value), margin);
    }




}