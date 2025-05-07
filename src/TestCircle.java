public class TestCircle {
    public static void main(String[] args) {
//        Declare an instance of Circle class called c1
//        Construct the instance c1 by invoking the "default" constructor
//        which sets its radius and color to their default value
        Circle c1 = new Circle();
        System.out.println("The Circle has radius of "+ c1.getRadius()+" and area of "+c1.getArea());
//        Invoke public methods on instance c1, via dot operation



//        Declare an instance of Circle class called c1
//        Construct the instance c1 by invoking the "default" constructor
//        which sets its radius and color to their default value
        Circle c2 = new Circle(2.0);
//        Invoke public methods on instance c2, via dot operation.
        System.out.println("The Circle has radius of "+ c2.getRadius()+" and area of "+c2.getArea());

    }
}
