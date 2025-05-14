public class Circle {
    //    Private instance variable, not accessible from outside this class
    private double radius;
    private String color;

//    Constructor(overload)
//    Constructs a Circle instance with default value for radius and color

    public Circle(){    //1st default Constructor
        radius = 1.0;
        color = "Red" ;
    }
    public Circle(double r){   //2st  Constructor
        radius = r;
        color = "red";
    }

    //    Return the radius
    public double getRadius(){
        return radius;
    }
    //      Return the Area of the Circle instance
    public double getArea(){
        return radius*radius*Math.PI;
    }
}

