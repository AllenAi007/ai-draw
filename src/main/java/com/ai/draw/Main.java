package com.ai.draw;

import java.util.Scanner;

/**
 * Main Class
 */
public class Main {

    /**
     * Main method
     *
     * @param args
     * @Return 0 exit success, 1 exit with failure
     */
    public static void main(String... args) {
        System.out.print("enter command: ");
        Scanner scanner = new Scanner(System.in, "UTF-8");
        String command;
        Drawer drawer;
        Canvas canvas = null;
        while ((command = scanner.nextLine()) != null) {
            try {
                String cmdType = command.split(" ")[0];
                switch (cmdType) {
                    case "Q":
                        System.exit(0);
                    case "C":
                        canvas = new Canvas();
                        drawer = canvas; // drawer is also canvas;
                        break;
                    case "L":
                        drawer = new Line(canvas);
                        break;
                    case "R":
                        drawer = new Rectangle(canvas);
                        break;
                    case "B":
                        drawer = new BucketFill(canvas);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown command: " + command);
                }
                drawer.draw(command.split(" "));
            } catch (Exception e) {
                System.out.println("Wrong Command was given: " + e.getMessage());
            }
            System.out.print("enter command: ");
        }

    }
}