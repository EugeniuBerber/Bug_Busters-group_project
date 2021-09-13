package Task2;
/*
Create an Interface 'Shape' with undefined
        methods as calculateArea and
        calculatePerimiter. Create 2 classes Circle &
        Square that implements functionality defined in
        the Shape Interface. Test your code.
        2. We have to calculate the average of marks
        obtained in three subjects by student A and by
        student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
        the average percentage of marks. Provide
        implementation of abstract method in classes 'A'
        and 'B'. The constructor of student A takes the
        marks in three subjects as its parameters and
        the marks in four subjects as its parameters for
        student B. Test your code
*/

interface Shape {
    void calculateArea(double r);

    void calculatePerimeter(double l);

}

class Circle implements Shape {

   public void calculateArea(double r){
        double area = (Math.PI)*Math.pow(r,2);
        System.out.printf("The area of a Circle is: %.2f\n",area);
    }
    public void calculatePerimeter(double r){
       double perimeter = 2*Math.PI*r;
        System.out.printf("The perimeter of a Circle is: %.2f\n",perimeter);
    }
}
class Square implements Shape{
    public void calculatePerimeter(double l){
        double perimeter = l*4;
        System.out.printf("The perimeter of a Square is: %.2f\n",perimeter);
    }
    public void calculateArea(double l){
        double area = Math.pow(l,2);
        System.out.printf("The area of a Square is: %.2f\n",area);

    }
}