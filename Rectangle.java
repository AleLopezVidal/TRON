package userInterface;
import java.awt.Graphics;
public class Rectangle extends Shape{
	public Rectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public Rectangle() {
        super();
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(getX(), getY(), getWidth(), getHeight());
    }
}
