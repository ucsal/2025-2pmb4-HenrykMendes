package br.com.mariojp.figureeditor;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class BallFactory implements InterfaceFactory {
    public Shape createShape(Point point, int size){
        return new Ellipse2D.Double(point.x, point.y, size, size);
    }
}
