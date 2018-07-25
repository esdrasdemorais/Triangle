package trigonometric;

public abstract class Spacial implements Geometric {

    protected Point apexA;
    protected Point apexB;
    protected Point apexC;

    protected abstract Point setApexA(Short x, Short y);
    protected abstract Point setApexB(Short x, Short y);
    protected abstract Point setApexC(Short x, Short y);

    protected Spacial() {
        
    }

    public String draw() {
        String r = "";
        boolean drawedARect, drawedCRect;
        Short aDot = (short)0, bDot = (short)0, cDot = (short)0;
        cDot = this.apexA.getX();
        --cDot;
        for (Short l = (short)0; l < 21; l++) {
            drawedARect = drawedCRect = false;
            for (Short c = (short)0; c < 21; c++) {
                if (c == this.apexA.getX() && l == this.apexA.getY())
                    r += "a";
                else if (c == this.apexB.getX() && l == this.apexB.getY())
                    r += "b";
                else if (c == this.apexC.getX() && l == this.apexC.getY())
                    r += "c";
                else if (c > this.apexA.getX() + aDot
                        && l > this.apexA.getY()
                        && c < this.apexB.getX() 
                        && l < this.apexB.getY()
                        && drawedARect == false) {
                    r += ".";
                    drawedARect = true;
                    aDot++;
                } else if (c == cDot && c < this.apexA.getX() 
                        && l < this.apexC.getY() && l > this.apexA.getY() 
                        && drawedCRect == false) {
                    r += ".";
                    drawedCRect = true;
                    cDot--;
                } else if (c <= this.apexB.getX() && l == this.apexC.getY()
                        && l == this.apexB.getY())
                    r += ".";
                else r += " ";
            }
            r += "\n";
        }
        return r;
    }

}
