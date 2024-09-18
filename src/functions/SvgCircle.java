package functions;

import java.io.FileWriter;
import java.io.IOException;

public class SvgCircle {
    public static String outputFile = "resources/svgHere.html"; // your file path

    public static int x = 10; // your infos to the circle in x axis
    public static int y = 10; //  your infos to the circle in y axis

    // public static double r = 2.686; //  your infos to the circle in radius

    public static int min = 10;
    public static int max = 20;
    public static double r = min + Math.random() * (max-min); //  randomize radius

    public static void write() {

        System.out.println("-> Input x and y coordinates respectfully:");
        // Scanner to get input from user. use nextDouble for Double and nextLine for String.
        int cx = new java.util.Scanner(System.in).nextInt(); // btw you need to write it console through enter
        int cy = new java.util.Scanner(System.in).nextInt();

        x = cx;
        y = cy;

        String theCircle = "<svg height=\"400\" width=\"1000\">%n   <circle cx=\""+ x +"\" cy=\""+ y +"\" r=\""+ r +"\" />%n</svg>";

        try {
            FileWriter writer = new FileWriter(outputFile);
            writer.write(theCircle);
            writer.close();
            System.out.println("-> content is written");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void clear() {
        try {
            FileWriter writer = new FileWriter(outputFile);
            writer.write("");
            writer.close();
            System.out.println("-> all of the content deleted");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
