package Drobi;
import java.util.*;
public class Program {
	public static void main(String[] args) {
		new Program();
	}
	Program(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Введите числитель и знаменатель первой дроби");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Введите числитель и знаменатель второй дроби");
		int c=sc.nextInt();
		int d=sc.nextInt();
		Fraction f1=new Fraction(a,b);
		Fraction f2=new Fraction(c,d);
		System.out.println("Первая дробь: "+f1.toString());
		System.out.println("Вторая дробь: "+f2.toString());
		f1.add(f2);
		System.out.println("Сумма = "+f1.toString());
		//f1.reduce();
		//System.out.println("Сумму сократили "+f1.toString());
		System.out.println("Числитель первой дроби "+f1.getNum());
		//f1.setNum(a);
		//f1.setDenom(b);
		//или вызвать конструктор:
		f1=new Fraction(a,b);
		f1.sub(f2);
		System.out.println("Разность = "+f1.toString());	
		
	}

}
