package com.ai.draw;

/**
 * Abstract Canvas Drawer which depends on a Canvas
 */
public abstract class AbstractCanvasDrawer extends AbstractDrawer {

    protected final Canvas canvas;

    /**
     * @param canvas given canvas
     * @Exception IllegalArgumentException if the given canvas is null
     */
    public AbstractCanvasDrawer(Canvas canvas) {
        checkCanvas(canvas);
        this.canvas = canvas;
    }

    protected void checkCanvas(Canvas canvas) {
        if (canvas == null || canvas.getTable() == null) {
            throw new IllegalArgumentException("Canvas is not initialized, please start with command: C w h");
        }
    }

    protected Canvas getCanvas() {
        return canvas;
    }

    protected String[][] getTable() {
        return getCanvas().getTable();
    }

    /**
     * Print out to console
     */
    protected void paint() {
        getCanvas().paint();
    }


    protected int getCanvasWidth() {
        return getCanvas().getWidth();
    }


    protected int getCanvasHeight() {
        return getCanvas().getHeight();
    }
}
