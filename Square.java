class Square extends Rectangle {
    public Square(Point centerPoint, double side) {
        super(centerPoint, side, side);
    }

    @Override
    public String toString() {
        return "Hình vuông - " + "Tâm: " + centerPoint + 
               ", Cạnh: " + width +
               ", Diện tích: " + getArea() + ", Chu vi: " + getPerimeter();
    }
}