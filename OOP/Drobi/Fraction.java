package Drobi;

public class Fraction {
	//поля
	private int num,denom;
	//конструктор
	public Fraction(int num, int denom){
		this.num=num;
		this.denom=Math.abs(denom);
	}
	//методы
	public String toString(){ // num / denom
		return this.num+" / "+this.denom;
	}
	public void add(Fraction f){
		this.num=this.num*f.denom+f.num*this.denom;
		this.denom=this.denom*f.denom;
		this.reduce();
	}
	public void reduce(){
		int a=Math.abs(this.num);
		int b=this.denom;
		while (a!=b)
			if (a>b) a=a-b;
			else b=b-a;
		this.num/=a;
		this.denom/=a;
	}
	public void sub(Fraction f){
		this.num=this.num*f.denom-f.num*this.denom;
		this.denom=this.denom*f.denom;
		this.reduce();
	}
	public int getNum(){
		return this.num;
	}
	public int getDenom(){
		return this.denom;
	}
	public void setNum(int num){
		this.num=num;
	}
	public void setDenom(int denom){
		this.denom=Math.abs(denom);
	}

}
