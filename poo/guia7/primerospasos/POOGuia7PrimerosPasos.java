/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.guia7.primerospasos;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class POOGuia7PrimerosPasos {

    public static void main(String[] args) {
        
       PersonaServicio servicioUno = new PersonaServicio();
       Persona personaUno = servicioUno.crearPersona();
       
       servicioUno.mostrarPersona(personaUno);
       
        System.out.println("");
       
       PersonaServicio servicioDos = new PersonaServicio();
       Persona personaDos = servicioDos.crearPersona();
       
       servicioDos.mostrarPersona(personaDos);
    }
    
}
