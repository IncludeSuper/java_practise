package OO_CircleAreaTest;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("input the circle of r:");
        double r2=scanner.nextDouble();
        method m=new method();
        m.r=r2;
        double area;
        area=m.getArea();
        System.out.println("cirle of the Area is : "+area);
    }
}
class method{
    double r;
    public double getArea(){
        return r*r*Math.PI;
    }
}
