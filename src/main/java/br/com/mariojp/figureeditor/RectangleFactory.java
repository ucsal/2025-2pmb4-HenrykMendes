
package br.com.mariojp.figureeditor;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class RectangleFactory implements InterfaceFactory {
    public Shape createShape(Point point, int size) {

        return new Rectangle.Double(point.x, point.y, size, size);
    }
}