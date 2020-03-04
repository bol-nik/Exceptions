import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;
public class Expept {

	public static void main(String[] args){
		// TODO Auto-generated method stub
        int mas[]= {0,5,8,7,8,5,68,4,2,10,1008};
       System.out.println("Массив: ");
        for(int i:mas) {
        	System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Введите два числа: ");
    	Scanner in = new Scanner(System.in);
    	int a=0;
    	int b=0;
    	try{
    	a= in.nextInt();
    	b=in.nextInt();
    	if(a>1000||b>1000) {
        	throw new Exception("Семь раз отмерь,один раз отреж");
        }
    	if(a==666||b==666) {
    		throw new MyException("Kodzima genius");//Использует класс MyException
    	}
        int c=mas[a]+mas[b];
        System.out.println(mas[a]+"+"+mas[b]+"="+c);
    	}
    	catch (InputMismatchException e) {
		System.out.println("Не верный ввод");
		}
    	catch(ArrayIndexOutOfBoundsException e) {
   		System.out.println("Выход за пределы массива");
    	}
    	catch (MyException e) {
		System.out.println(e);
		}
    	catch(Exception e) {
    		System.out.println("Другая ошибка!!! ");
    		System.out.println(e.getMessage());
    		
    	}
        
	}

}
