import java.io.*;
class Buffer2{
public static void main(String []arg){
BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
String name;
try{
System.out.println("Enter your name:");
name = reader.readLine();
System.out.println("The entered name is:" + name);
}
catch(Exception e){
}
}
};
