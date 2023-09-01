package got;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
public class Naval extends FuerzaMilitar {
  private int cantidadBarcos;

  public Naval(int cantidadBarcos) {
    this.cantidadBarcos = cantidadBarcos;
  }

  public Naval(){

  }

  @Override
  public void atacarA(Lugar lugar) {

  }
}
