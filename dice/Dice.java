package dice;

public class Dice {

    public int roll;

    public int rolld2() {
	roll = (int)(Math.random() * 2) + 1;
	return roll;
    }
    
    public int rolld4() {
	roll = (int)(Math.random() * 4) + 1;
	return roll;
    }
    
    public int rolld6() {
	roll = (int)(Math.random() * 6) + 1;
	return roll;
    }

    public int rolld8() {
	roll = (int)(Math.random() * 8) + 1;
	return roll;
    }

    public int rolld10() {
	roll = (int)(Math.random() * 10) + 1;
	return roll;
    }

    public int rolld12() {
	roll = (int)(Math.random() * 12) + 1;
	return roll;
    }

    public int rolld20() {
	roll = (int)(Math.random() * 20) + 1;
	return roll;
    }

}
