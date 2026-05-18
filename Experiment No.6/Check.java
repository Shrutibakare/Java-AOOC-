class DivisionException extends Exception{
   DivisionException(String msg){
         super(msg);
}
}

class Calculator{
void divide(int a,int b) throws DivisionException{
  if(b==0){
 throw new DivisionException("Cannot divide by zero");
}

int res = a/b;
System.out.println("Result is: "+ res);
}
}

public class Check{
  public static void main(String[] args){
      Calculator c = new Calculator();

try{
 
c.divide(7,6);
c.divide(2,0);
}catch(DivisionException e){
   System.out.println("Exception :" +e.getMessage());
}
}
}