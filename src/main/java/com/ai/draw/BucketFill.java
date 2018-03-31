package com.ai.draw;

/**
 * BucketFill drawer
 */
public class BucketFill extends AbstractCanvasDrawer {

    public BucketFill(Canvas canvas) {
        super(canvas);
    }

    @Override
    protected void fill(String[] args) {
        int x, y;
        x = Integer.parseInt(args[1]);
        y = Integer.parseInt(args[2]);
        String color = args[3];
        String previousColor = getTable()[x][y];
        bucketFill(x, y, previousColor, color);
    }

    /**
     * Reclusive method
     * @param x
     * @param y
     * @param previousColor
     * @param newColor
     */
    private void bucketFill(int x, int y, String previousColor, String newColor) {
        if (x < 0 || x >= getCanvasWidth()
                || y < 0 || y >= getCanvasHeight()
                || !previousColor.equals(getTable()[x][y])) return;
        getTable()[x][y] = newColor;
        bucketFill(x + 1, y, previousColor, newColor);
        bucketFill(x - 1, y, previousColor, newColor);
        bucketFill(x, y + 1, previousColor, newColor);
        bucketFill(x, y - 1, previousColor, newColor);
    }
}
