import org.junit.Test;
import org.junit.Before;


import static org.junit.jupiter.api.Assertions.*;

public class ChampionTest {
    Champion champ;
    Champion champ2;

    @Before
    public void testChampions(){
         champ = new Champion("Cloud", new Champion.Boots("boots", (short) 25),
                 new Champion.Weapon("Broad sword", (short) 10));

         champ2 = new Champion("test", new Champion.Boots("regular", (short) 25),
                     new Champion.Weapon("long sword", (short) 10));
    }

    @Test
    public void testChampionGetters(){
        assertNotNull(champ);
        assertEquals("Cloud", champ.getName());
        assertEquals((short) 100, champ.getHp());
        assertEquals((short) 35, champ.getSpeed());
        assertEquals("boots", champ.boots.getName());
        assertEquals((short) 25, champ.boots.getSpeed());
        assertEquals("Broad sword", champ.weapon.getName());
        assertEquals((short) 10, champ.weapon.getDamage());
    }

    @Test
    public void testChampionSetters(){
        assertNotNull(champ);
        // check champion name setter
        champ.setName("Viegar");
        assertEquals("Viegar", champ.getName());

        //check HP setter
        champ.setHp((byte) 10);
        assertEquals(10, champ.getHp());

        // check weapon setters
        champ.setWeapon(new Champion.Weapon("bat", (short) 5));
        assertEquals("bat", champ.weapon.getName());
        assertEquals(5, champ.weapon.getDamage());
        champ.weapon.setName("black rod");
        assertEquals("black rod", champ.weapon.getName());
        champ.weapon.setDamage((short) 25);
        assertEquals(25, champ.weapon.getDamage());

        //check boots setters
        champ.setBoots(new Champion.Boots("fire", (short) 15));
        assertEquals("fire", champ.boots.getName());
        assertEquals(15, champ.boots.getSpeed());
        champ.boots.setName("magic");
        assertEquals("magic", champ.boots.getName());
        champ.boots.setSpeed((short) 20);
        assertEquals(20, champ.boots.getSpeed());

        // check speed setter
        champ.setSpeed((short) 20);
        assertEquals(40, champ.getSpeed());
    }

    @Test
    public void testChampionHp(){
        assertEquals(100, champ.getHp());
        champ.decreaseHp((byte) 50);
        assertEquals(50, champ.getHp());
        champ.decreaseHp((byte) 10);
        assertEquals(40, champ.getHp());
        champ.decreaseHp((byte) 50);
        assertEquals(0, champ.getHp());
        champ.decreaseHp((byte) 50);
        assertEquals(0, champ.getHp());
        champ.increaseHp((byte) 50);
        assertEquals(50, champ.getHp());
        champ.increaseHp((byte) 50);
        assertEquals(100, champ.getHp());
        champ.increaseHp((byte) 50);
        assertEquals(100, champ.getHp());
        champ.increaseHp((byte) 50);
        assertEquals(100, champ.getHp());
    }

}