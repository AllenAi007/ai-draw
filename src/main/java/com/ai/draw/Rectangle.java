package com.ai.draw;

import java.util.stream.IntStream;

/**
 * Rectangle
 */
public class Rectangle extends AbstractCanvasDrawer {

    /**
     * @param canvas given canvas
     * @Exception IllegalArgumentException if the given canvas is null
     */
    public Rectangle(Canvas canvas) {
        super(canvas);
    }

    @Override
    protected void fill(String[] args) {
        int x1, y1, x2, y2;
        x1 = Integer.parseInt(args[1]);
        y1 = Integer.parseInt(args[2]);
        x2 = Integer.parseInt(args[3]);
        y2 = Integer.parseInt(args[4]);
        IntStream.range(x1 - 1, x2).forEach(w -> {
            IntStream.range(y1 - 1, y2).forEach(h -> {
                if (w == x1 - 1 || w == x2 - 1 || h == y1 - 1 || h == y2 - 1) {
                    if (getTable()[w][h] == null || getTable()[w][h].equals(" "))
                        getTable()[w][h] = "x";
                }
            });
        });
    }
}
