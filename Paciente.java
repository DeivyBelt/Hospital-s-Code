package Hospital;

import java.util.ArrayList;

//Clase Paciente según UML
public class Paciente {
 private int id;
 private String nombre;
 private int edad;
 private String genero;
 private TipoCancer tipoCancer;
 private Estado estado;

 private ArrayList<Tratamiento> listaTratamientos;
 private ArrayList<Examen> listaExamenes;

 public Paciente(int id, String nombre, int edad, String genero,
                 TipoCancer tipoCancer, Estado estado) {
     this.id = id;
     this.nombre = nombre;
     this.edad = edad;
     this.genero = genero;
     this.tipoCancer = tipoCancer;
     this.estado = estado;

     listaTratamientos = new ArrayList<>();
     listaExamenes = new ArrayList<>();
 }

 // Agregar examen
 public void agregarExamen(Examen examen) {
     listaExamenes.add(examen);
 }

 // Agregar tratamiento
 public void agregarTratamiento(Tratamiento tratamiento) {
     listaTratamientos.add(tratamiento);
 }

 public TipoCancer getTipoCancer() {
     return tipoCancer;
 }

 public Estado getEstado() {
     return estado;
 }
}

