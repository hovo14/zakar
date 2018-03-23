public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public void createPoint1(int x, int y){
        p1 = new Point(x, y);
    }

    public void createPoint2(int x, int y){
        p2 = new Point(x, y);
    }

    public void createPoint3(int x, int y){
        p3 = new Point(x, y);
    }

    class Point{
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
