import org.junit.Test;
import static org.junit.Assert.*;

public class PouleTest {

    @Test
    public void testGetEnergie() {
        // Arrange
        Poule p = new Poule("Cocotte");

        // Act
        int energie = p.getEnergie();

        // Assert
        assertEquals(50, energie);
    }

    @Test
    public void testGetNbOeufs() {
        // Arrange
        Poule p = new Poule("Cocotte");

        // Act
        int nb = p.getNbOeufs();

        // Assert
        assertEquals(0, nb);
    }

    @Test
    public void testGetNom() {
        // Arrange
        Poule p = new Poule("Cocotte");

        // Act
        String nom = p.getNom();

        // Assert
        assertEquals("Cocotte", nom);
    }

    @Test
    public void testManger() {
        // Arrange
        Poule p = new Poule("Cocotte");

        // Act
        p.manger(20);

        // Assert
        assertEquals(70, p.getEnergie());
    }

    @Test
    public void testPondre() {
        // Arrange
        Poule p = new Poule("Cocotte");

        // Act
        p.pondre();

        // Assert
        assertEquals(1, p.getNbOeufs());
        assertEquals(20, p.getEnergie());
    }
}
