package boletin_16;

import com.samuel.Persoal;
import java.util.Scanner;

public class Academica {
    
    Scanner sc = new Scanner(System.in);
    private final String numReferencia = "2018";
    private String nome;
    private float nota;
    private Persoal alumno;
    
    // Constructor

    public Academica(String nome, Persoal alumno) {
        this.nome = nome;
        this.alumno = alumno;
    }
    
    // Set's y Get's

    public String getNumReferencia() {
        return numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Persoal getAlumno() {
        return alumno;
    }

    public void setAlumno(Persoal alumno) {
        this.alumno = alumno;
    }
    
    // Funciones
    
    public void calcularNota(int nNotas){
        
        int i = 1;
        float notas = 0;
        
        do{
            
            System.out.print("Introduce la nota numero " + i + ": ");
            notas += sc.nextFloat();
            
            i += 1;
        } while (i <= nNotas);
        
        this.nota = notas/ (i-1);
    }
    
    // To String

    @Override public String toString() {
        return "Academica { " + "nRef: " + numReferencia + ", Nome: " + nome + ", Nota: " + nota + ", Alumno: " + alumno.toString() + " }";
    }
    
    
}
