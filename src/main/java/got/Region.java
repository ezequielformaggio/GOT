package got;

import static java.util.stream.Collectors.toSet;

import java.util.Collection;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Region {

  @Id
  @GeneratedValue
  private Long idRegion;
  private String nombre;
  @ManyToOne
  private Casa casaPrincipal;
  @ManyToMany
  @JoinTable(name = "Regiones_lugares", joinColumns = @JoinColumn(name = "idRegion"),
      inverseJoinColumns = @JoinColumn(name = "idLugar"))
  private Collection<Lugar> lugares;

  public Region(String nombre, Casa casaPrincipal, Collection<Lugar> lugares) {
    this.nombre = nombre;
    this.casaPrincipal = casaPrincipal;
    this.lugares = lugares;
  }

  protected Region(){

  }

  public Set<Lugar> castillos() {
    return lugares.stream().filter(Castillo.class::isInstance).collect(toSet());
  }

  public Set<Lugar> ciudades() {
    return lugares.stream().filter(Ciudad.class::isInstance).collect(toSet());
  }

  public int poblacionTotal() {
    return lugares.size();
  }
}
