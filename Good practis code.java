class RollNumberTable extends Thread {
    private String rollNumber;

    public RollNumberTable(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public void run() {
        System.out.println("Table for Roll Number:");
        System.out.println(rollNumber);
    }
}

class DateOfBirthTable extends Thread {
    private String dob;

    public DateOfBirthTable(String dob) {
        this.dob = dob;
    }

    @Override
    public void run() {
        System.out.println("Table for Date of Birth:");
        System.out.println(dob);
    }
}

public class Main {
    public static void main(String[] args) {
        RollNumberTable rollTable = new RollNumberTable("2019-SE-092");
        DateOfBirthTable dobTable = new DateOfBirthTable("05-April");

        rollTable.start();
        dobTable.start();
    }
}

