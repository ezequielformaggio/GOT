package got;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegionTest extends AbstractPersistenceTest implements WithGlobalEntityManager {

  @BeforeEach
  public void setup(){this.beginTransaction();}

  @AfterEach
  public void tearDown(){this.rollbackTransaction();}

  @Test
  public void puedePersistirUnaRegion() {

    Lugar winterfell = (new Castillo(10, 2, "winterfell", 1250, 305));
    Casa stark = new Casa("casa", 120000, 1998, null, null, winterfell);

    Region region = new Region("El norte", stark, Arrays.asList(winterfell));
    entityManager().persist(region);
    entityManager().persist(winterfell);
    entityManager().persist(stark);

    assertEquals(1, entityManager().createQuery("from Region", Region.class).getResultList().size());
  }
}
