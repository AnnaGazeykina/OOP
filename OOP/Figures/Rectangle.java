package Figures;
public class Rectangle {
	//����
	protected double a,b;
	//�����������
	public Rectangle(double a, double b){
		this.a=a;
		this.b=b;
	}
	//������
	public double s(){
		return this.a*this.b;
	}
	public double p(){
		return 2*(this.a+this.b);
	}
	public String toString(){
		return "������������� �� ��������� "+this.a+" , "+this.b;
	}
}
