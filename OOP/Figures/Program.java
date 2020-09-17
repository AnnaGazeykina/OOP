package Figures;
import java.util.*;
public class Program {
	public static void main(String[] args) {
		new Program();
	}
	Program(){
		Scanner sc=new Scanner (System.in);
		System.out.println("введите длину, ширину, высоту ");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		double z=sc.nextDouble();
		Rectangle figure;
		if (z==0.0)
			figure=new Rectangle(x,y);
		else figure=new Parall(x,y,z);
		System.out.println("Площадь фигуры "+figure.s());
		System.out.println("Периметр фигуры "+figure.p());
		if (figure instanceof Parall)
			System.out.println("Объем параллелепипеда "+ ((Parall)figure).v());			
	}
}
