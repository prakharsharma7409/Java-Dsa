import java.util.Scanner;

public class ArraysInput {
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();//phy
        marks[1] = sc.nextInt();//che
        marks[2] = sc.nextInt();//maths
        System.out.println("Physics: " +marks[0]);
        System.out.println("Chemistry: " +marks[1]);
        System.out.println("Mathematics: " +marks[2]);
        //if bye mistake teacher given you wrong marks in maths then
        //marks[2] = 90;
        //System.out.println("Mathematics: " +marks[2]);
        //or
        //marks[2] = marks[2] + 2;
        //System.out.println("Mathematics: " +marks[2]);
        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Percentage " + percentage + "%");
        System.out.println("Length of array is " +marks.length);
    }
}