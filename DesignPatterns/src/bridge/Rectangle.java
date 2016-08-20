package bridge;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class Rectangle extends Shape {

    public Rectangle(Drawing drawing){
        super(drawing);
    }
    @Override
    void draw() {
        drawLine();
    }
}
