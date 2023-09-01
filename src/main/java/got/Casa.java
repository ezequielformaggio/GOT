package got;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Casa {

  @Id
  @GeneratedValue
  private Long idCasa;
  private String nombre;
  private int patrimonio;
  private int anioFundacion;
  @ManyToOne
  private Casa vasallaDe;
  @OneToMany
  @JoinColumn(name = "idCasa")
  private Collection<FuerzaMilitar> fuerzasMilitares;
  @ManyToOne
  private Lugar origen;

  public Casa(String nombre, int patrimonio, int anioFundacion,
              Casa vasallaDe, Collection<FuerzaMilitar> fuerzasMilitares, Lugar origen) {
    this.nombre = nombre;
    this.patrimonio = patrimonio;
    this.anioFundacion = anioFundacion;
    this.vasallaDe = vasallaDe;
    this.fuerzasMilitares = fuerzasMilitares;
    this.origen = origen;
  }

  public Casa(){

  }

  public String nombreLugarOrigen() {
    return origen.getNombre();
  }
}
