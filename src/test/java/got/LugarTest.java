package got;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

import static org.junit.jupiter.api.Assertions.*;

public class LugarTest extends AbstractPersistenceTest implements WithGlobalEntityManager {

  @BeforeEach
  public void setup(){this.beginTransaction();}

  @AfterEach
  public void tearDown(){this.rollbackTransaction();}

  @Test
  public void puedePersistirUnCastillo() {
    entityManager().persist(new Castillo(10, 2, "Haedo", 1250, 305));
    assertEquals(1, entityManager().createQuery("from Castillo", Castillo.class).getResultList().size());
  }

  @Test
  public void puedePersistirUnaCiudad() {
    entityManager().persist(new Ciudad(13, 2, 32, "Ramos", 1468, 204));
    assertEquals(1, entityManager().createQuery("from Ciudad", Ciudad.class).getResultList().size());
  }

  @Test
  public void puedeRecuperarLugares() {
    entityManager().persist(new Castillo(10, 2, "Haedo", 1250, 305));
    entityManager().persist(new Ciudad(13, 2, 32, "Ramos", 1468, 204));

    assertEquals(2, entityManager().createQuery("from Lugar", Lugar.class).getResultList().size());
  }

}
