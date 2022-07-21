package enums;

//enum is created similar to class
enum ChargeLevel {

    FULL(4, "green"),
    HIGH(3, "green"),
    MEDIUM(2, "yellow"),
    LOW(1, "red");

    int sections;
    String color;
    
    ChargeLevel(int sections, String color) {
        this.sections = sections;
        this.color = color;
    }

    public int getSections() {
        return sections;
    }

    public String getColor() {
        return color;
    }

    public static ChargeLevel findByNumberOfSections(int sections) {
        for (ChargeLevel value: values()) {
            if (value.sections == sections) {
                return value;
            }
        }
        return null;
    }
}
public class BatteryColor{
	public static void main(String[] args)
	{
		System.out.println(ChargeLevel.findByNumberOfSections(2)); 
	}
}
