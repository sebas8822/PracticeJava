/**
 (Area of regular polygon) A regular polygon is an n-sided polygon
 in which all sides are of the same length and all angles have the
 same degree (i.e., the polygon is both equilateral and equiangular).
 The formula for computing the area of a regular polygon is where n
 is the number of sides and s is the side of the polygon.

 Write a Java method that returns the area of a regular
 polygon using the following header: public static double
 area(int n, double side). (Hints: You may need Math.tan()
 function and Math.PI for area calculations.)
 */

public class ExamQ {
    public static void main(String[] args) {

        int n = 7;
        double s = 6.0;

        System.out.println(area(n,s));
    }


    public static double area(int n, double s){
        double area = 0;

        area = (n*Math.pow(s,2))/((4) * Math.tan(Math.PI/n));

        return area;


    }


}


