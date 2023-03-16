import org.junit.Test;
import org.junit.Before;


import static org.junit.jupiter.api.Assertions.*;

public class ChampionTest {
    Champion champ;
    Champion champ2;

    @Before
    public void testChampions(){
         champ = new Champion("Cloud", new Champion.Boots("boots", (short) 25),
                 new Champion.Weapon("Broad sword", 10));

         champ2 = new Champion("test", new Champion.Boots("regular", (short) 25),
                     new Champion.Weapon("long sword", 10));
    }

    @Test
    public void testChampionGetters(){
        assertNotNull(champ);
        assertEquals("Cloud", champ.getName());
        assertEquals((short) 100, champ.getHp());
        assertEquals((short) 10, champ.getSpeed());
        assertEquals("boots", champ.getBootsName());
        assertEquals((short) 25, champ.getBootsSpeed());
        assertEquals("Broad sword", champ.getWeaponName());
        assertEquals((short) 10, champ.getWeaponDamage());
    }

    @Test
    public void testChampionSetters(){
        assertNotNull(champ);
        champ.setName("Viegar");
        assertEquals("Viegar", champ.getName());
        champ.setWeaponName("black rod");
        assertEquals("black rod", champ.getWeaponName());
        champ.setWeaponDamage((short) 25);
        assertEquals(25, champ.getWeaponDamage());
        champ.setBoots(new Champion.Boots("fire", (short) 15));
        assertEquals("fire", champ.getBootsName());
        assertEquals(15, champ.getBootsSpeed());
        champ.setBootsName("magic");
        assertEquals("magic", champ.getBootsName());
        champ.setBootsSpeed((short) 20);
        assertEquals(20, champ.getBootsSpeed());
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
    }

    @Test
    public void testChampionDamage(){
//        champ.attack(champ2, (byte)50);
//        assertEquals(50, champ2.getHp());
    }


}