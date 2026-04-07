package Hospital;

import java.time.LocalDate;

//Clase Examen según UML
public class Examen {
 private int idExamen;
 private LocalDate fechaExamen;
 private TipoExamen tipoExamen;
 private String resultado;

 public Examen(int idExamen, LocalDate fechaExamen, TipoExamen tipoExamen, String resultado) {
     this.idExamen = idExamen;
     this.fechaExamen = fechaExamen;
     this.tipoExamen = tipoExamen;
     this.resultado = resultado;
 }
}

