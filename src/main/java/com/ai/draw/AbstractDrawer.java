package com.ai.draw;

/**
 * Template Design pattern,
 *
 * Abstract Drawer, parent class for line, rectangle, bucket fill
 */
public abstract class AbstractDrawer implements Drawer {

    /**
     * Following Open Close principle, can not be overwrite
     *
     * 1. fill - fill by given command
     * 2. paint - print out based on filled data
     *
     * @param args
     */
    public final void draw(String... args) {
        fill(args);
        paint();
    }

    /**
     * Print out to console
     */
    protected abstract void paint() ;

    /**
     * Fill all the data based on arguments,
     *
     * @param args
     */
    protected abstract void fill(String[] args);

}
