class localvariable{
public static void main(String []arg){

int x = 10; // It is the local variable in the code.
String message = "Hello world"; // It is the local variable in the code.


System.out.println("x = " + x);
System.out.println("message = " + message);

if(x>5){
String result = "x is greate than 5";
System.out.println(result);
}

for(int i = 0; i<3; i++){
String loopMessage = "Iteration " + i;
System.out.println(loopMessage);
}
}
};