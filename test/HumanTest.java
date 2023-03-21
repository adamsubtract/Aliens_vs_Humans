import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {
    Human human;

    @Before
    public void testHumans(){
        human = new Human("Sam", "Fighter", new Champion.Weapon("Fists", (short)10),
                new Champion.Boots("regular", (short) 10), "Male",
                new Human.Armour("cloth", (short) 5));
    }

    @Test
    public void testHumanGetters() {
        assertNotNull(human);
        assertEquals("Sam", human.getName());
        assertEquals("Fighter", human.getType());
        assertEquals("Fists", human.weapon.getName());
    }

    @Test
    public void testHumanSetters(){
//        assertNotNull(human);
//        human.setName("Cloud");
//        assertEquals("Cloud", human.getName());
//        human.setType("Swordsman");
//        assertEquals("Swordsman", human.getType());
//        human.setWeapon("Buster Sword");
//        assertEquals("Buster Sword", human.getWeapon());
//        human.setBoots("Speed");
//        assertEquals("Speed", human.getBoots());
//        human.setArmour(60);
//        assertEquals(60, human.getArmour());
//        human.setAttackDamage(85);
//        assertEquals(85, human.getAttackDamage());
//        human.setGender("Female");
//        assertEquals("Female", human.getGender());
    }


}
