public class Program {
    public static void main(String[] args) {
        Point point1 = new Point(1,1);
        Point point2 = new Point(2,2);
        Point point3 = new Point(4,3);
        Point point4 = new Point(5,5);
        Point point = new Point(2, 2);
        Point point5 = new Point(5, 6);

        Vector vector4 = new Vector(point, point5);
        Vector vector = new Vector(point1,point2);
        Vector vector1 = new Vector(point3,point4);

        Vector vector3 = Vector.SumVector(vector,vector1);
        System.out.println(vector3.lengthVector());

        Vector vector2 = Vector.DifVector(vector,vector1);
        System.out.println(vector2);
        System.out.println(vector4.lengthVector());
    }
}
