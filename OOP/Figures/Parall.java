package Figures;
public class Parall extends Rectangle{
	//поля +
	private double h;
	//конструктор
	public Parall(double a, double b, double h){
		super(a,b);
		this.h=h;
	}
	//методы
	//унаследованные нужно переопределить
	@Override 
	public double s(){
		return 2*(this.a*this.b+this.a*this.h+this.b*this.h);
	}
	@Override 
	public double p(){
		return 4*(this.a+this.b+this.h);
	}
	//+новый метод
	public double v(){
		return this.a*this.b*this.h;
	}
	public String toString(){
		return "Параллелепипед со сторонами "+this.a+" , "+this.b+" , "+this.h;
	}
}
