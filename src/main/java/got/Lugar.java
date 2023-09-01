package got;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Lugar {
  @Id
  @GeneratedValue
  private Long idLugar;
  private String nombre;
  private int anioFundacion;
  private int poblacion;

  public Lugar(String nombre, int anioFundacion, int poblacion) {
    this.nombre = nombre;
    this.anioFundacion = anioFundacion;
    this.poblacion = poblacion;
  }

  public Lugar() {

  }

  public String getNombre() {
    return nombre;
  }

}
