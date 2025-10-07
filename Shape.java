abstract class Shape {
    protected Point centerPoint;
    protected static int count = 0; // đếm số lượng hình đã tạo

    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Tâm: " + centerPoint;
    }
}