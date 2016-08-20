package bridge;

/**
 * Created by YuexingYin on 8/19/16.
 */
abstract class Shape {
    protected Drawing drawing;

    public Shape(Drawing drawing){
        this.drawing = drawing;
    }

    abstract void draw();

    public void drawLine(){
        drawing.drawLine();
    }

    public void drawCircle(){
        drawing.drawCircle();
    }
}
