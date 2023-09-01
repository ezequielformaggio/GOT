package got;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_de_fuerza_militar")
public abstract class FuerzaMilitar {
  @Id
  @GeneratedValue
  private Long idFuerzaMilitar;

  void atacarA(Lugar lugar) {

  }
}
