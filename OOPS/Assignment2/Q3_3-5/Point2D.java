public class Point2D {
    int x;
    int y;


    Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String getDetails(){
        return "X:" + this.x + " Y:" + this.y;
    }

    public boolean isEqual(Point2D point){
        return this.x == point.x && this.y == point.y;
    }

    public Point2D createNewPoint(int xoff, int yoff){
        return new Point2D(this.x + xoff, this.y + yoff);
    }   

    public double calculateDistance(Point2D point){
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    } 
}