package patterns.builder;

public class Computer {
    private int RAM;
    private String CPU;
    private int storage;
    private String MB;
    private int Battery;
    private String color;
    private String GPU;

    private Computer(Builder builder) {
        this.RAM = builder.RAM;
        this.CPU = builder.CPU;
        this.storage = builder.storage;
        this.MB = builder.MB;
        this.Battery = builder.battery;
        this.color = builder.color;
        this.GPU = builder.video;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "RAM=" + RAM +
                ", CPU='" + CPU + '\'' +
                ", storage=" + storage +
                ", MB='" + MB + '\'' +
                ", Battery=" + Battery +
                ", color='" + color + '\'' +
                ", GPU='" + GPU + '\'' +
                '}';
    }

    public int getRAM() {
        return RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public int getStorage() {
        return storage;
    }

    public String getMB() {
        return MB;
    }

    public int getBattery() {
        return Battery;
    }

    public String getColor() {
        return color;
    }

    public String getGPU() {
        return GPU;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setMB(String MB) {
        this.MB = MB;
    }

    public void setBattery(int battery) {
        Battery = battery;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public static class Builder {
        private int RAM;
        private String CPU;
        private int storage;
        private String MB;
        private int battery;
        private String color;
        private String video;

        public Builder(String MB, String CPU) {
            this.MB = MB;
            this.CPU = CPU;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setBattery(int battery) {
            this.battery = battery;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.video = GPU;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
