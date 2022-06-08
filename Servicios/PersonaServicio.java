
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    
    public Persona crearPersona(){
        
        Persona personaUno = new Persona();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor, escriba el nombre.");
        personaUno.setNombre(leer.next());
        System.out.println("Indique el género.");
        personaUno.setGenero(leer.next());
        System.out.println("Indique la edad.");
        personaUno.setEdad(leer.nextInt());
        
        return personaUno;
    }
    
    public void mostrarPersona (Persona personaUno){
        
        System.out.println("Nombre: " +personaUno.getNombre());
        System.out.println("Genero: " +personaUno.getGenero());
        System.out.println("Edad: " +personaUno.getEdad());
        
    }
    
    
}


