package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point13DefaultMethodsInInterfaces;

public class Weaponpt1 {
    public static void main(String[] args) {

    }
}

/// Define the WeaponType interface
interface WeaponType {
    // Method to get the type of the weapon
    String getWeaponType();
    // Method to set the type of the weapon
    void setWeaponType(String weaponType);
    // Default method to reset the weapon type to "Default"
    default void resetWeaponType() {
        System.out.println("Default"); // Print "Default"
    }
}

// Define the Damageable interface
interface Damageable {
    // Method to get the durability of the weapon
    int getDurability();
    // Method to set the durability of the weapon
    void setDurability(int durability);
    // Default method to repair the weapon by setting its durability to 100
    default void repair() {
        setDurability(100);
    }
}

// Implement the Weapon class that implements both WeaponType and Damageable interfaces
class Weapon implements WeaponType, Damageable {
    // Instance variables for weapon type and durability
    String weaponType;
    int durability;

    // Constructor to initialize weapon type and durability
    public Weapon(String weaponType, int durability) {
        this.weaponType = weaponType;
        // Ensure durability is within the range [0, 100]
        if (durability < 0) {
            this.durability = 0;
        } else if (durability > 100) {
            this.durability = 100;
        } else {
            this.durability = durability;
        }
    }

    // Implement the getWeaponType method from WeaponType interface
    @Override
    public String getWeaponType() {
        return weaponType;
    }

    // Implement the setWeaponType method from WeaponType interface
    @Override
    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    // Implement the getDurability method from Damageable interface
    @Override
    public int getDurability() {
        return durability;
    }

    // Implement the setDurability method from Damageable interface
    @Override
    public void setDurability(int durability) {
        // Ensure durability is within the range [0, 100]
        if (durability < 0) {
            this.durability = 0;
        } else if (durability > 100) {
            this.durability = 100;
        } else {
            this.durability = durability;
        }
    }

    // Implement the resetWeaponType method from WeaponType interface
    @Override
    public void resetWeaponType() {
        this.weaponType = "Default";
    }

    // Implement the repair method from Damageable interface
    @Override
    public void repair() {
        setDurability(100);
    }
}
// This code defines two interfaces, WeaponType and Damageable, and then implements a class called
// Weapon that implements both of these interfaces.
// The class contains methods and instance variables to handle weapon
// type and durability, as well as their manip
