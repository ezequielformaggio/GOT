package got;

import javax.persistence.Entity;

@Entity
public class Castillo extends Lugar {

  private int cantidadTorres;
  private int cantidadMurallas;

  public Castillo(int cantidadTorres, int cantidadMurallas,
                  String nombre, int anio, int poblacion) {
    super(nombre, anio, poblacion);
    this.cantidadTorres = cantidadTorres;
    this.cantidadMurallas = cantidadMurallas;
  }

  public Castillo() {

  }
}
