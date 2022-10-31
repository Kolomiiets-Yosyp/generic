import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;
public class Main {
    static String arr[];
     static Scanner scanner = new Scanner(System.in);
    static Scanner scannerr = new Scanner(System.in);
    static String sca;
    static String scannnnnnn;
    static String viewScan;
    static int scan = 1;
    private static int count=1;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static int count(){

        System.out.println("---------------------\nEnter view animal:");
        Animal<String > animal= new Animal<String>(viewScan=scanner.nextLine());


                System.out.println("Enter animal:");
                View<String>viewDog= new View<String>(viewScan, scannnnnnn=scanner.nextLine());

                System.out.println(viewDog);

        if (count>3) {
            System.out.println("You have entered too many animals");
            scan=2;
        }
        else{
            return ++count;
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        FileWriter fileWriter = new FileWriter("text.txt");

        while (scan!=3){
            System.out.println("----------------------- \nWrite number: \n 1.Add a new animal to the list"+
                    "\n 2.Output list of animals "+
                    "\n 3.Exit the program");
            scan = scannerr.nextInt();
            switch (scan){
            case 1:

                count();

                try {
                    fileWriter.write(" Animal: " + viewScan + ", view: " + scannnnnnn+ "\n");
                }
                catch(IOException e) {
                  fileWriter = new FileWriter("text.txt");
                    fileWriter.write(" Animal: " + viewScan + ", view: " + scannnnnnn+ "\n");
                }

                break ;
                case 2:
                    fileWriter.close();
                    FileReader fileReader =new FileReader("text.txt");

                    int i;
                    while ((i= fileReader.read())!=-1 ){
                        System.out.print((char)i);
                    }
                    fileReader.close();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println(ANSI_RED+"ERROR"+ ANSI_RESET);
                    break;
    }

        }
    }
}
