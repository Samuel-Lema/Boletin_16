package boletin_16;

import com.samuel.*;
import com.samuel.extras.calcularNota;
import java.util.Scanner;

public class Boletin_16 {
        
    public static void main(String[] args) {
        
        Persoal persoa1 = new Persoal("666999276", "persoal@gmail.com");
        
        Academica alumno1 = new Academica("Samuel", calcularNota.calcularNota(3), persoa1);
        
        System.out.println(alumno1.toString());
    }
    
}
