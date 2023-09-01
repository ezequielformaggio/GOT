package got;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("T")
public class Terrestre extends FuerzaMilitar {

  private int cantidadSoldados;

  public Terrestre(int cantidadSoldados) {
    this.cantidadSoldados = cantidadSoldados;
  }

  public Terrestre() {

  }

  @Override
  public void atacarA(Lugar lugar) {

  }
}
