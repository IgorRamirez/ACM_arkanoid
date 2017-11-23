package codigo;

import java.awt.color.*;

import acm.graphics.GRect;



/**
 * 
 * @author Igor Ramirez
 *
 *La clase ladrillo sirve para dibujar los ladrillos del juego
 */
public class Ladrillo extends GRect{

/**
 * construye un ladrillo	
 * @param x
 * @param y
 * @param width
 * @param height
 * 
 * futuros cambios:que admita numero de golpes
 */
	
	public Ladrillo(double x, double y, double width, double height) {
		super(x, y, width, height);
		setFilled(true);
		setFillColor(_color);
	}

}
