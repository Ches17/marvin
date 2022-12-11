import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Filipino Grade: ");
        int fil = input.nextInt();
        System.out.print("Enter English Grade: ");
        int eng = input.nextInt();
        System.out.print("Enter Math Grade: ");
        int math = input.nextInt();
        System.out.print("Enter Science Grade: ");
        int sci = input.nextInt();
        System.out.print("Enter Ap Grade: ");
        int ap = input.nextInt();
        System.out.print("Enter Esp Grade: ");
        int esp = input.nextInt();
        System.out.print("Enter Tle Grade: ");
        int tle = input.nextInt();
        System.out.print("Enter Mapeh Grade: ");
        int mapeh = input.nextInt();
        int average = (fil+eng+math+sci+ap+esp+tle+mapeh)/8;
            System.out.println(average);
            if (average >= 75){
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        }
    }