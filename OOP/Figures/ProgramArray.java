package Figures;
import java.util.*;
public class ProgramArray {
	public static void main(String[] args) {
		new ProgramArray();
	}
	ProgramArray(){
		Scanner sc=new Scanner (System.in);
		System.out.println("введите количество фигур ");
		int n=sc.nextInt();
		Rectangle figure []=new Rectangle[n];
		Random r=new Random();
		for (int i=0; i<figure.length; i++){
			int x=r.nextInt(5)+1;
			int y=r.nextInt(5)+1;
			int z=r.nextInt(3);
			if (z==0)
				figure[i]=new Rectangle(x,y);
			else figure[i]=new Parall(x,y,z);
		}
		System.out.println("Созданы фигуры");
		for (int i=0; i<figure.length; i++){
			System.out.println(figure[i].toString());
		}			
		int kr=0,kp=0;
		for (int i=0; i<figure.length; i++)
			if (figure[i] instanceof Parall)
				kp++;
		System.out.println("Кол-во прямоугольников "+(figure.length-kp));
		System.out.println("Кол-во параллелепипедов "+kp);
		//
		double maxS=0;
		for (int i=0; i<figure.length; i++)
			if (!(figure[i] instanceof Parall)&& figure[i].s()>maxS) 
				maxS=figure[i].s();
		System.out.println("Максимальная площадь прямоугоьника "+maxS);
		double minV=Double.MAX_VALUE;
		for (int i=0; i<figure.length; i++)
			if ((figure[i] instanceof Parall)&& ((Parall)figure[i]).v()<minV) 
				minV=((Parall)figure[i]).v();
		System.out.println("Минимальный объем параллелепипеда "+minV);
	}
}
