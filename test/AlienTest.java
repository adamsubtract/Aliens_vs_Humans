import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlienTest {

    Alien alien;
    Alien alien2;
    Human human;

    @Before
    public void testObjects(){
        alien = new Alien("ET",
                new Champion.Weapon("Energy sword", (short) 100),
                new Champion.Boots("Mana", (short) 50),
                (short) 50,
                (short) 100,
                "Protoss",
                (short) 100);

        alien2 = new Alien("Arbiter",
                new Champion.Weapon("Energy sword", (short) 100),
                new Champion.Boots("Mana", (short) 50),
                (short) 50,
                (short) 100,
                "Protoss",
                (short) 100);

        human = new Human("Sam", "Fighter", "Male",
                new Champion.Weapon("Fists", (short)100),
                new Champion.Boots("regular", (short) 50),
                new Human.Armour("cloth", (short) 50));
    }




    @Test
    public void testGetters(){
        assertEquals("ET", alien.getName());
        assertEquals(50, alien.getShield());
        assertEquals("Energy sword", alien.weapon.getName());
        assertEquals(100, alien.weapon.getDamage());
        assertEquals("Mana", alien.boots.getName());
        assertEquals(50, alien.boots.getSpeed());
        assertEquals(100, alien.getMagicDamage());
        assertEquals(100, alien.getMana());
        assertEquals("Protoss", alien.getRace());
        assertEquals(60, alien.getTotalSpeed());
    }

    @Test
    public void testSetters(){
        alien.setName("Jon");
        assertEquals("Jon", alien.getName());
        alien.setShield((short) 100);
        assertEquals(100, alien.getShield());
        alien.weapon.setName("Plasma pistol");
        assertEquals("Plasma pistol", alien.weapon.getName());
        alien.weapon.setDamage((short) 200);
        assertEquals(200, alien.weapon.getDamage());
        alien.boots.setSpeed((short) 100);
        assertEquals(100, alien.boots.getSpeed());
        alien.boots.setName("Super");
        assertEquals("Super", alien.boots.getName());
        alien.setMagicDamage((short) 200);
        assertEquals(200, alien.getMagicDamage());
        alien.setRace("Covenant");
        assertEquals("Covenant", alien.getRace());
        alien.setMana((short) 200);
        assertEquals(200, alien.getMana());
    }

    @Test
    public void testAttack(){
        alien.attack(alien2);
        assertEquals(850, alien2.getHp());

        // damage alien2 more than hp.
        alien.setMagicDamage((short) 1000);
        alien.attack(alien2);
        assertEquals(0, alien2.getHp());

        // attack human
        alien.setMagicDamage((short) 200);
        alien.attack(human);
        assertEquals(750, human.getHp());

        // attack human below zero hp
        alien.setMagicDamage((short) 1000);
        alien.attack(human);
        assertEquals(0, human.getHp());
    }

}