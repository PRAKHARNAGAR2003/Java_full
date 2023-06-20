import java.util.*;

class ScannerClass2{
public static void main(String []arg){

Scanner scn = new Scanner(System.in);

String name;
int Rollno;
float marks;

System.out.println("Enter the name:");
name = scn.nextLine();
System.out.println("Enter the Rollno:");
Rollno = scn.nextInt();
System.out.println("Enter the marks:");
marks = scn.nextFloat();

System.out.println("Name=" + name);
System.out.println("Rollno=" + Rollno);
System.out.println("marks=" + marks);
}
};


