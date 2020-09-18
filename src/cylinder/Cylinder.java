package cylinder;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
    private static double getArea(double radius){
        return Math.PI * radius * radius;
    }
    private static double getPerimeter(double radius){
        return  2 * radius * Math.PI;
    }
}
