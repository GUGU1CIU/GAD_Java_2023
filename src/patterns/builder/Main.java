package patterns.builder;

public class Main {
    public static void main(String[] args) {
        Computer.Builder comp = new Computer.Builder("MotherBoard", "I9")
                .setBattery(4200)
                .setRAM(4000)
                .setColor("Red")
                .setStorage(2000)
                .setGPU("Nvidia");

        Computer computer = comp.build();
        System.out.println(computer);

    }
}
