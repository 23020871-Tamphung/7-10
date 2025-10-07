public class MainProgram {
    public static void main(String[] args) {
        // Tạo các hình
        Shape s1 = new Rectangle(new Point(1, 2), 4, 6);
        Shape s2 = new Square(new Point(3, 5), 5);
        Shape s3 = new Circle(new Point(0, 0), 3.5);

        // Mảng chứa tất cả hình
        Shape[] shapes = { s1, s2, s3 };

        // In số lượng hình đã tạo
        System.out.println("Số lượng hình đã khởi tạo: " + Shape.getCount());
        System.out.println("--------------------------------------------------");

        // Danh sách chi tiết các hình
        System.out.println("Danh sách chi tiết các hình:");
        for (Shape s : shapes) {
            System.out.println(s);
        }

        System.out.println("--------------------------------------------------");

        // Danh sách tâm điểm
        System.out.println("Danh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println(s.getCenterPoint());
        }
    }
}