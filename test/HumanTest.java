import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {
    Human human;
    Human human2;

    @Before
    public void testHumans(){
        human = new Human("Sam", "Fighter", "Male",
                new Champion.Weapon("Fists", (short)1000),
                new Champion.Boots("regular", (short) 50),
                new Human.Armour("cloth", (short) 50));

        human2 = new Human("Cloud", "Swordsman", "Male",
                new Champion.Weapon("Long Sword", (short)100),
                new Champion.Boots("regular", (short) 50),
                new Human.Armour("Iron", (short) 50));

    }

    @Test
    public void testHumanAttack(){
        human.attack(human2);
        assertEquals(850, human2.getHp());
        human.weapon.setDamage((short) 1000);
        human.attack(human2);
        assertEquals(0, human2.getHp());
    }

    @Test
    public void testHumanGetters() {
        assertNotNull(human);
        assertEquals(100, human.getAttackDamage());
        assertEquals(200, human.getTotalDamage());
        assertEquals(1000, human.getHp());
        assertEquals("Sam", human.getName());
        assertEquals("Male", human.getGender());
        assertEquals("Fighter", human.getType());
        assertEquals(10, human.getSpeed());
        assertEquals(60, human.getTotalSpeed());
        assertEquals("Fists", human.weapon.getName());
        assertEquals(100, human.weapon.getDamage());
        assertEquals("regular", human.boots.getName());
        assertEquals(50, human.boots.getSpeed());
        assertEquals("regular", human.boots.getName());
        assertEquals(50, human.armour.getDefense());
        assertEquals("cloth", human.armour.getName());
    }

    @Test
    public void testHumanSetters(){
        assertNotNull(human);
        human.setName("Cloud");
        assertEquals("Cloud", human.getName());
        human.setAttackDamage((short) 100);
        assertEquals(100, human.getAttackDamage());
        human.setType("Swordsman");
        assertEquals("Swordsman", human.getType());
        human.setGender("Female");
        assertEquals("Female", human.getGender());
        human.weapon.setName("Long Sword");
        assertEquals("Long Sword", human.weapon.getName());
        human.weapon.setDamage((short) 20);
        assertEquals(20, human.weapon.getDamage());
        human.boots.setName("Speed");
        assertEquals("Speed", human.boots.getName());
        human.boots.setSpeed((short) 20);
        assertEquals(20, human.boots.getSpeed());
        human.armour.setName("Steel");
        assertEquals("Steel", human.armour.getName());
        human.armour.setDefense((short) 20);
        assertEquals(20, human.armour.getDefense());

    }

}
