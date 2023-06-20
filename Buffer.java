import java.io.*;

class Buffer{

public static void main(String []arg)
throws IOException

{
BufferedReader bfn = new BufferedReader( new InputStreamReader(System.in));

String str = bfn.readLine();
int it = Integer.parseInt(bfn.readLine());

System.out.println("The entered string is:" + str);
System.out.println("The entered Integer is:" + it);
}
};
