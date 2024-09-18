import functions.SvgCircle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    // Don't forget to update the -c list

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        while (!input.equals("-q")) {

            System.out.println("\nGive the command you want to run (-c for list of commands, -q for quit)");

            input = scanner.nextLine();
            switch (input) {
                case "svgCircle":
                    SvgCircle.write();
                    break;
                case "svgCircle clear":
                    SvgCircle.clear();
                    break;
                case "-c":
                    try {
                        // Specify the existing file (relative or absolute path)
                        BufferedReader reader = new BufferedReader(new FileReader("resources/commandsList.md"));
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "-q":
                    break;
                default:
                    System.out.println("-> Unknown program");
            }
        }
    }
}