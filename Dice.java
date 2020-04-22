public class Dice {

    public int roll;

    public int rolldfour() {
	roll = (int)(Math.random() * 4) + 1;
	return roll;
    }
    
    public int rolldsix() {
	roll = (int)(Math.random() * 6) + 1;
	return roll;
    }

    public int rolldeight() {
	roll = (int)(Math.random() * 8) + 1;
	return roll;
    }

    public int rolldten() {
	roll = (int)(Math.random() * 10) + 1;
	return roll;
    }

    public int rolldtwelve() {
	roll = (int)(Math.random() * 12) + 1;
	return roll;
    }

    public int rolldtwenty() {
	roll = (int)(Math.random() * 20) + 1;
	return roll;
    }

}
