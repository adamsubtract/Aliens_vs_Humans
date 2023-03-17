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
        assertEquals((short) 10, champ.getSpeed());
        assertEquals("boots", champ.getBootsName());
        assertEquals((short) 25, champ.getBootsSpeed());
        assertEquals("Broad sword", champ.getWeaponName());
        assertEquals((short) 10, champ.getWeaponDamage());
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
        assertEquals("bat", champ.getWeaponName());
        assertEquals(5, champ.getWeaponDamage());
        champ.setWeaponName("black rod");
        assertEquals("black rod", champ.getWeaponName());
        champ.setWeaponDamage((short) 25);
        assertEquals(25, champ.getWeaponDamage());

        //check boots setters
        champ.setBoots(new Champion.Boots("fire", (short) 15));
        assertEquals("fire", champ.getBootsName());
        assertEquals(15, champ.getBootsSpeed());
        champ.setBootsName("magic");
        assertEquals("magic", champ.getBootsName());
        champ.setBootsSpeed((short) 20);
        assertEquals(20, champ.getBootsSpeed());

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

    @Test
    public void testChampionAttack(){
        champ.attack(champ2, (byte) 50);
        assertEquals(50, champ2.getHp());
        champ.attack(champ2, (byte) 50);
        assertEquals(0, champ2.getHp());
        champ.attack(champ2, (byte) 50);
        assertEquals(0, champ2.getHp());
    }

    @Test
    public void testChampionIsAlive(){

    }


}