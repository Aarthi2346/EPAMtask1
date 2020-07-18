class Calculator{
int num1;
int num2;
static void powerInt(int num1,int num2){
System.out.println((int)Math.pow(num1,num2));
}
static void powerDouble(double num1,double num2){
System.out.println((double)Math.pow(num1,num2));
}
public static void main(String args[]){
Calculator c=new Calculator();
c.powerInt(5,2);
c.powerDouble(9,2);
}
}
