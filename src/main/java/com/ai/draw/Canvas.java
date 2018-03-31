package com.ai.draw;

import java.util.stream.IntStream;

/**
 * Canvas drawer to draw canvas
 *
 * Noted: inherit from AbstractDrawer
 */
public class Canvas extends AbstractDrawer {

    /**
     * 2D array to hold the data
     */
    private String[][] table;
    /**
     * Width of 2D array
     */
    private int width;
    /**
     * Height of 2D array
     */
    private int height;

    /**
     * Print out the 2D array
     */
    public void paint() {
        // before
        paintLine();
        IntStream.range(0, height).forEach(h -> {
            IntStream.range(0, width).forEach(w -> {
                if (w == 0) {
                    System.out.print("|");
                }
                System.out.print(table[w][h]);
            });
            System.out.println("|");
        });
        // after
        paintLine();
    }

    /**
     * Print top and bottom line
     */
    protected void paintLine() {
        // pretty the layout
        IntStream.range(0, width + 2).forEach(i -> {
            System.out.print("-");
        });
        System.out.println();
    }

    /**
     * Fill the 2D with default value " "
     * @param args
     */
    @Override
    protected void fill(String... args) {
        width = Integer.parseInt(args[1]);
        height = Integer.parseInt(args[2]);
        table = new String[width][height];
        IntStream.range(0, height).forEach(h -> {
            IntStream.range(0, width).forEach(w -> {
                table[w][h] = " ";
            });
        });
    }

    /**
     * Return 2D array
     * @return
     */
    public String[][] getTable() {
        return this.table;
    }

    /**
     * Return width of 2D array
     * @return
     */
    public int getWidth() {
        return width;
    }

    /**
     * Return height of 2D array
     * @return
     */
    public int getHeight() {
        return height;
    }
}
