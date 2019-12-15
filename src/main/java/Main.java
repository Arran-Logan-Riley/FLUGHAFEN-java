import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException  {
        /*Scanner input = new Scanner(System.in); //initilizing the line scanner

        System.out.println("Do you wish to start the simulation?:");
        String userInPut = input.next();
        System.out.print(userInPut);
`       */
        //Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String name = reader.readLine();

        // Printing the read line
        System.out.println(name);
    }
}

