
public class MyException extends Exception{
   String mes;
   public MyException() {
	mes="Ошибка";
}
   public MyException(String a) {
	   mes=a;
   }
   public String toString() {
	   return "My Exception ["+mes+"]";
   }
   public void Show() {
	   System.out.println("My Exception ["+mes+"]");
   }
}
