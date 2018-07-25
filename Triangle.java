
package trigonometric;

public class Triangle extends Spacial {
    
    public Triangle() {
       super();
    }

    public Triangle(Point a, Point b, Point c) {
        /*super(
            this.apexB.getY() - this.apexA.getY(), 
            this.apexB.getX() - this.apexC.getY(), 
            this.apexC.getY() - this.apexA.getY()
        );*/
        this.apexA = a;
        this.apexB = b;
        this.apexC = c;
   }

    protected Point setApexA(Short x, Short y) {
        this.apexA = new Point(x, y);
        return this.apexA;
    }

    protected Point setApexB(Short x, Short y) {
        this.apexB = new Point(x, y);
        return this.apexB;
    }

    protected Point setApexC(Short x, Short y) {
        this.apexC = new Point(x, y);
        return this.apexC;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();

        t.setApexA((short)10, (short)0);
        t.setApexB((short)20, (short)10);
        t.setApexC((short)0, (short)10);

        System.out.println(t.draw());
    }
}
