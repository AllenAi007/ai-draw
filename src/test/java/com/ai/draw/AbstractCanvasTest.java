package com.ai.draw;

import org.junit.Before;

public class AbstractCanvasTest {

    protected Canvas canvas;

    @Before
    public void before() {
        canvas = new Canvas();
        canvas.draw("C 20 4".split(" "));
    }
}
