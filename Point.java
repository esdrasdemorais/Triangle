package trigonometric;

public class Point {
    
    protected Short x;
    protected Short y;

    public Point(Short x, Short y) {
        this.x = x;
        this.y = y;
    }

    public void setX(Short x) {
        this.x = x;
    }

    public Short getX() {
        return this.x;
    }

    public void setY(Short y) {
        this.y = y;
    }

    public Short getY() {
        return this.y;
    }
}
