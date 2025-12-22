package oops2;

public class Mobile {

    private String brand;
    private byte batteryLevel; // 0–100

    public Mobile(String brand, byte batteryLevel) {
        this.brand = brand;
        this.batteryLevel = (batteryLevel >= 0 && batteryLevel <= 100) ? batteryLevel : 0;
    }

    public byte getBatteryLevel() {
        return batteryLevel;
    }

    public boolean charge(int percent) {
        if (percent <= 0) {
            return false;
        }
        batteryLevel = (byte) Math.min(100, batteryLevel + percent);
        return true;
    }

    @Override
    public String toString() {
        return "Mobile{brand='" + brand +
                "', batteryLevel=" + batteryLevel + "%}";
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("iPhone", (byte) 77);
        System.out.println(m1);
        m1.charge(20);
        System.out.println(m1);
    }
}
