package bridge;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class Circle extends Shape {

    public Circle(Drawing drawing){
        super(drawing);
    }
    @Override
    void draw() {
        drawCircle();
    }
}
