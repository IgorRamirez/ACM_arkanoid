package codigo;
import acm.graphics.GObject;
/*
 * autor:Igor Ramirez
 * la clase pelota es la que vamos a utilizar para
 * el juegodel arkanoid
 * tiene dos constructores
 */
import acm.graphics.GOval;

import java.awt.Color;
import java.awt.color.*;
import java.awt.color.*;

public class Pelota extends GOval{

	double xVelocidad = 3; //velocidad de la vola en el eje x
	double yVelocidad=  -3; //velocidad de la vola en el eje y

	/**
	 * Este el es constructor bAsico,que es identico al de la clase GOval 
	 * @param _ancho
	 * @param _alto
	 */
	public Pelota(double _ancho, double _alto){
		super(_ancho, _alto);
		/**
		 * este es el constructor dabuti que permite pasar el color como parametro
		 * @param _ancho indica el ancho y el alto de la bola
		 * @param _color
		 */
	}
	public Pelota(double _ancho, double _alto, Color _color){
		super(_ancho, _alto);
		if (_ancho <=0){
			this.setSize(1,1);
		}
		this.setFillColor(_color);
		this.setFilled(true);
	}

	public void muevete(Arkanoid _arkanoid){
		//chequea si ha chocado con las paredes izq o der
		if(this.getX()+getWidth()>= _arkanoid.getWidth() || this.getX()<0){
			xVelocidad*= -1;

		}
		//chequea si ha chocado con el techo
		if(this.getY()<0){
			yVelocidad *=-1;
		}
		if(chequeaColision(getX(), getY(), _arkanoid)){
			if(chequeaColision(getX() + getWidht(), getY(), _arkanoid){
				if(chequeaColision(getX(), getY() + get height() _arkanoid){
						if(chequeaColision(getX() + getWidth(), getY() + getHeight() _arkanoid){
						}
			}
		}
	}

							//chequeaColisionConBarra(_arkanoid);
							//voy a crear un metodo chequea colision generico que sirva para comprovar los choques entre la bola y los ladrillos
							move(xVelocidad, yVelocidad);	



						}
			}
			private boolean chequeaColision(double posX, double posY, Arkanoid _arkanoid){
				boolean noHaChocado = true;
				GObject auxiliar;
				auxiliar = _arkanoid.getElementAt(posX, posY);

				if (auxiliar instanceof Ladrillo){
					if (auxiliar.getY() == posY || auxiliar.getY() + auxiliar.getHeight() == posY){
					yVelocidad *=-1;
				
				}
					else if(auxiliar.getX()== posX || auxiliar.getX() + auxiliar.getWidth() == posX){
						
					}
					_arkanoid.remove(auxiliar);
					noHaChocado = false;
				}
				else if (auxiliar instanceof Barra){
					yVelocidad *=-1;
					noHaChocado = false;
				}
			}

			//private void chequeaColisionConBarra(Arkanoid _arkanoid){
			//chequea las esquinas inferiores de la pelota
			//para ver si hay una barra
			//if(_arkanoid.getElementAt(getX(), getY()+ getHeight()) == _arkanoid.barra1){
			//yVelocidad *= -1;
			//}
			//else if (_arkanoid.getElementAt(getX()+ getWidth(), getY()+ getHeight()) == _arkanoid.barra1)
			//yVelocidad *= -1;	
			//}
		}



