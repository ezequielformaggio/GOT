package got;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Aerea extends FuerzaMilitar {

  private int cantidadDragones;

  public Aerea(int cantidadDragones) {
    this.cantidadDragones = cantidadDragones;
  }

  protected Aerea() {

  }

  @Override
  public void atacarA(Lugar lugar) {
  }
}
