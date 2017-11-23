package codigo;

import java.awt.Color;

import acm.graphics.GRect;

/**
 * 
 * @author Igor Ramirez
 * 
 * la clase barra es la que dibja el cursor del juego
 *
 */
public class Barra extends GRect{
/**
 * crea eñ cursor de el juego
 * @param width ->el ancho del cursor
 * @param height ->el alto del cursor
 * @param _color ->el color del cursor
 */
	

	public Barra(double width, double height, Color _color) {
		super(width, height);
		setFilled(true);
		setFillColor(_color);
	
	}
/**
 * mueveBarra reposiciona la barra en la coordenada en la que esta el raton
 * @param posX la posicion x del raton. La y
 * @param anchoPantalla
 */
	public void mueveBarra(int posX, int anchoPantalla){
		if(posX + getWidth() < anchoPantalla){
			setLocation(posX, getY());
		}
	}
	
	
}
