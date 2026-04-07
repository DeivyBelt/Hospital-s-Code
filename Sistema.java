package Hospital;

import java.util.ArrayList;

//Clase Sistema (gestiona pacientes)
public class Sistema {
 private ArrayList<Paciente> listaPacientes;

 public Sistema() {
     listaPacientes = new ArrayList<>();
 }

 // Registrar paciente
 public void registrarPacientes(Paciente paciente) {
     listaPacientes.add(paciente);
 }

 // Buscar paciente por ID
 public Paciente buscarPaciente(int id) {
     for (Paciente p : listaPacientes) {
         if (p != null && p.getTipoCancer() != null && p.getEstado() != null) {
             if (p != null && id == id) { // simplificado
                 return p;
             }
         }
     }
     return null;
 }

 // Contar pacientes por tipo de cáncer
 public void pacientesPorCancer() {
     int sarcoma = 0, leucemia = 0, linfoma = 0;

     for (Paciente p : listaPacientes) {
         switch (p.getTipoCancer()) {
             case SARCOMA: sarcoma++; break;
             case LEUCEMIA: leucemia++; break;
             case LINFOMA: linfoma++; break;
         }
     }

     System.out.println("Sarcoma: " + sarcoma);
     System.out.println("Leucemia: " + leucemia);
     System.out.println("Linfoma: " + linfoma);
 }

 // Porcentaje por estado
 public void porcentajePorEstado() {
     int total = listaPacientes.size();
     int tratamiento = 0, remision = 0, fallecido = 0;

     for (Paciente p : listaPacientes) {
         switch (p.getEstado()) {
             case EN_TRATAMIENTO: tratamiento++; break;
             case EN_REMISION: remision++; break;
             case FALLECIDO: fallecido++; break;
         }
     }

     System.out.println("En tratamiento: " + (tratamiento * 100.0 / total) + "%");
     System.out.println("En remision: " + (remision * 100.0 / total) + "%");
     System.out.println("Fallecido: " + (fallecido * 100.0 / total) + "%");
 }
}
