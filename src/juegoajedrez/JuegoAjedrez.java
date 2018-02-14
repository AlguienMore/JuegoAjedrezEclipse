/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoajedrez;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class JuegoAjedrez {

    Tablero tablero;
    ArrayList<Pieza> piezas;
    ArrayList<Jugador> jugadores;

    public JuegoAjedrez() {
        piezas = new ArrayList<>();
        jugadores = new ArrayList<>();
        tablero = new Tablero();
        
        Jugador j = new Jugador(Color.negro, tablero);
        System.out.println("Jugador "+j.color.toString());
        jugadores.add(j);
        j = new Jugador(Color.blanco, tablero);
        System.out.println("Jugador "+j.color.toString());
        jugadores.add(j);
        
        for (int i = 0; i < 8; i++) {
			Pieza p = new Pieza(Tipo.peon, new Jugador, color)
		}
        
        for (Jugador elj : jugadores) {
            System.out.println("en el array "+elj.color.toString());
        }
        
    }
    
    
    
    public static void main(String[] args) {
        JuegoAjedrez elJuego = new JuegoAjedrez();
        
    }
    
    
}
