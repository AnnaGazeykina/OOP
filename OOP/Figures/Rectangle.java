package Figures;
public class Rectangle {
	//поля
	protected double a,b;
	//конструктор
	public Rectangle(double a, double b){
		this.a=a;
		this.b=b;
	}
	//методы
	public double s(){
		return this.a*this.b;
	}
	public double p(){
		return 2*(this.a+this.b);
	}
	public String toString(){
		return "Прямоугольник со сторонами "+this.a+" , "+this.b;
	}
}
