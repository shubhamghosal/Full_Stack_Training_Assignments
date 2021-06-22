class Point2D {
    double x, y;

    Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    String getDetails() {

        return x +", "+ y;
    }
    boolean isEqual(Point2D p2) {
        return this.x == p2.x && this.y == p2.y;
    }

    String newPoint(){
        x=x+1;
        y=y+1;
        return x +", "+ y;
    }
}
