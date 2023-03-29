import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlienTest {

    Alien alien = new Alien("ET",
                new Champion.Weapon("Energy sword", (short) 100),
                new Champion.Boots("Mana", (short) 50),
                (short) 50,
                (short) 100,
            "Protoss",
                (short) 100
            );

    @Test
    public void testGetters(){
        assertEquals("ET", alien.getName());
        assertEquals("Energy sword", alien.weapon.getName());
        assertEquals(100, alien.weapon.getDamage());
        assertEquals("Mana", alien.boots.getName());
        assertEquals(50, alien.boots.getSpeed());
        assertEquals(10, alien.getSpeed());
        assertEquals(100, alien.getMagicDamage());
        assertEquals(100, alien.getMana());
    }

}