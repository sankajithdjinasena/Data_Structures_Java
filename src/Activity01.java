import java.util.Scanner;

public class Activity01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentName = new String[10];

        for (int i = 0; i < studentName.length;i++){
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            studentName[i] = name;
        }
        System.out.println();
        System.out.println("Students are: ");
        for (String name:studentName) {
            System.out.println(name);
        }
    }
}
