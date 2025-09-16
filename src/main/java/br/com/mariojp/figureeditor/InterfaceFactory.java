package br.com.mariojp.figureeditor;
import java.awt.*;

public interface InterfaceFactory {
    Shape createShape(Point point, int size);
}
