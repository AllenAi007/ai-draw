package com.ai.draw;

import org.junit.Before;

public class AbstractCanvasTests {

    protected Canvas canvas;

    @Before
    public void beofre() {
        canvas = new Canvas();
        canvas.draw("C 20 4".split(" "));
    }
}
