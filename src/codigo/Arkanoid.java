package codigo;
/*
 * autor:igor Ramirez
 * 
 * el arkanoid orientado aobjetos
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import acm.graphics.*;


public class Arkanoid extends acm.program.GraphicsProgram{

	Pelota pelota1 = new Pelota(20, Color.GREEN);
	Pelota pelota2 = new Pelota(30, Color.BLUE);
	Barra barra1 = new Barra(60, 15, Color.RED) ;
	int anchoLadrillo = 27;
	int altoLadrillo = 15;
	
	 int puntuacion = 0;
	 Marcador marcador = new Marcador(20, 40);
	//GLabel marcador = new Glabel ("0");
	//GRect cajaMarcador = new GRect(20,40);		
	public void init(){
		addMouseListeners();
		setSize(400, 600);

		add(pelota1, 0, getHeight()*0,60 - pelota1.getHeight());
		add(pelota2, 0, getHeight()*0,70 - pelota2.getHeight());
		add(barra1, 0 , getHeight()*0.80);
		cajaMarcador.setFilled(true);
		cajaMarcador.setFillColor(Color.WHITE);
		int anchoLadrillo = 35;
		int altoLadrillo = 15;
		int espacioMenu   	
	}
	public void run(){
		dibujaNivel01();
		marcador.dibuja(this);
		//add(cajaMarcador, 5, 0);
		//add(marcador, 5, 0);
		add(marcador.texto, 0, 20);
		marcador.setFont(new Font("Arial", Font.BOLD, 18));
		while (true){
			pelota1.muevete(this);
			pelota2.muevete(this);
			pause(20);
		}
	}
	public void mouseMoved (MouseEvent evento){
		barra1.mueveBarra(evento.getX(), getWidth());
	}
	private void dibujaNivel01(){
		for (int j=0; j<14; j++){
			for (int i=j; i<14; i++){
				Ladrillo miLadrillo = new Ladrillo(anchoLadrillo*i - anchoLadrillo*j/2, altoLadrillo*j + altoLadrillo, anchoLadrillo x  v , altoLadrillo, Color.PINK);
			
				add(miLadrillo);
				pause(7);
			}
		}
	}
}
