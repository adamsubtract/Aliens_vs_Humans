import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {
    Human human;
    Human human2;

    @Before
    public void testHumans(){
        human = new Human("Sam", "Fighter", "Male",
                new Champion.Weapon("Fists", (short)10),
                new Champion.Boots("regular", (short) 10),
                new Human.Armour("cloth", (short) 5));

        human2 = new Human("Cloud", "Swordsman", "Male",
                new Champion.Weapon("Long Sword", (short)10),
                new Champion.Boots("regular", (short) 10),
                new Human.Armour("Iron", (short) 5));
    }

    @Test
    public void testHumanGetters() {
        assertNotNull(human);
        assertEquals(50, human.getAttackDamage());
        assertEquals("Sam", human.getName());
        assertEquals("Male", human.getGender());
        assertEquals("Fighter", human.getType());
        assertEquals("Fists", human.weapon.getName());
        assertEquals(10, human.weapon.getDamage());
        assertEquals("regular", human.boots.getName());
        assertEquals(10, human.boots.getSpeed());
        assertEquals("regular", human.boots.getName());
        assertEquals(5, human.armour.getDefense());
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

    @Test
    public void testHumanAttack(){
        human.attack(human2);
        assertEquals(985, human2.getHp());
    }


}
