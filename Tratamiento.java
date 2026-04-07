package Hospital;

//Clase Tratamiento según UML
public class Tratamiento {
 private int idTratamiento;
 private String nombreTratamiento;
 private int duracionTratamiento;
 private String efectoSecundario;
 private TipoTratamiento tipoTratamiento;

 public Tratamiento(TipoTratamiento tipoTratamiento, int idTratamiento, String nombreTratamiento,
                    int duracionTratamiento, String efectoSecundario) {
     this.tipoTratamiento = tipoTratamiento;
     this.idTratamiento = idTratamiento;
     this.nombreTratamiento = nombreTratamiento;
     this.duracionTratamiento = duracionTratamiento;
     this.efectoSecundario = efectoSecundario;
 }

 // Método inventado (no definido en UML)
 public String calcularEficacia(String resultado, Estado estado) {
     if (estado == Estado.EN_REMISION) {
         return "Alta";
     } else if (estado == Estado.EN_TRATAMIENTO) {
         return "Media";
     } else {
         return "Baja";
     }
 }
}

