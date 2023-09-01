package got;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ciudad extends Lugar {

  private int cantidadDeComercios;
  private int cantidadDeSantuarios;
  private double tasaDeMortalidad;

  public Ciudad(int cantidadDeComercios, int cantidadDeSantuarios, double tasaDeMortalidad,
                String nombre, int anio, int poblacion) {
    super(nombre, anio, poblacion);
    this.cantidadDeComercios = cantidadDeComercios;
    this.cantidadDeSantuarios = cantidadDeSantuarios;
    this.tasaDeMortalidad = tasaDeMortalidad;
  }

  public Ciudad(){

  }
}
