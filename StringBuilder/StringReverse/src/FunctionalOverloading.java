public class FunctionalOverloading {
    public static void main(String args[]){
        MethodOverloading obj1 = new MethodOverloading();
        int areaOfTriangle = obj1.area(4,5,7);
        int areaOfRectangle = obj1.area(3,8);
        int areaOfSquare = obj1.area(2);

        System.out.println("area of triangle "+areaOfTriangle);
        System.out.println("area of rectangle "+areaOfRectangle);
        System.out.println("area of square "+areaOfSquare);
    }

}
class MethodOverloading{
    public int area(int height, int base, int inclind){
        int area = height*base*inclind;
        return area;
    }
    public int area(int height, int width) {
        int area = height * width;
        return area;
    }
    public int area(int width){
        int area = width*width;
        return area;
    }
}


