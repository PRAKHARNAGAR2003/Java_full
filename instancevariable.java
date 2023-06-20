class instancevariable{
public String geek;
public int i;
public Integer I;
public instancevariable(){
this.geek = "Prakhar Nagar";
}

public static void main(String []args){
instancevariable name = new instancevariable();
System.out.println("Geek name is: " + name.geek);
System.out.println("Defalut value of int is " + name.i);

System.out.println("Defalut value for Interger is" + name.i);
}
};