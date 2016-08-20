package bridge;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class Client {
    public static void main(String[] args){
        Shape s1, s2;
        Drawing drawing;

        drawing = new DrawCircle();
        s1 = new Circle(drawing);

        drawing = new DrawLine();
        s2 = new Rectangle(drawing);

        s1.draw();
        s2.draw();
    }
}
