package day04.interfacedemo;

// Definition of the PowerControl interface
interface PowerControl {
    void turnOn();      // Method to turn the device on
    void turnOff();     // Method to turn the device off
}

// Definition of the VolumeControl interface
interface VolumeControl {
    void increaseVolume();   // Method to increase volume
    void decreaseVolume();   // Method to decrease volume
}

// Definition of the ChannelControl interface
interface ChannelControl {
    void nextChannel();      // Method to switch to the next channel
    void previousChannel();  // Method to switch to the previous channel
    void setChannel(int channel);       // Method to set a specific channel
}

// Abstract class RemoteControl implementing multiple interfaces
abstract class RemoteControl implements PowerControl, VolumeControl, ChannelControl {
    public abstract void displayStatus();    // Abstract method to display device status
}

// Concrete class SamsungTVRemote extending RemoteControl
class SamsungTVRemote extends RemoteControl {
    // Class definition for SamsungTVRemote
    private boolean isOn;
    private int volume;
    private int channel;

    public SamsungTVRemote() {
        isOn = false;
        volume = 50;
        channel = 1;
    }

    // Implementing the methods from the interfaces

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Samsung TV turned on");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Samsung TV turned off");
    }

    @Override
    public void increaseVolume() {
        if (isOn && volume < 100) {
            volume++;
            System.out.println("Volume increased: " + volume);
        }
    }

    @Override
    public void decreaseVolume() {
        if (isOn && volume > 0) {
            volume--;
            System.out.println("Volume decreased: " + volume);
        }
    }

    @Override
    public void nextChannel() {
        if (isOn) {
            channel++;
            System.out.println("Switched to channel: " + channel);
        }
    }

    @Override
    public void previousChannel() {
        if (isOn && channel > 1) {
            channel--;
            System.out.println("Switched to channel: " + channel);
        }
    }

    @Override
    public void setChannel(int channel) {
        if (isOn) {
            this.channel = channel;
            System.out.println("Switched to channel: " + channel);
        }
    }

    @Override
    public void displayStatus() {
        System.out.println("Samsung TV is " + (isOn ? "on" : "off") +
                ", Volume: " + volume +
                ", Current Channel: " + channel);
    }
}

// Main class
public class RemoteControlDemo {
    public static void main(String[] args) {
        // Create an instance of SamsungTVRemote
        SamsungTVRemote samsungTVRemote = new SamsungTVRemote();

        // Perform actions using the SamsungTVRemote instance
        samsungTVRemote.turnOn();
        samsungTVRemote.increaseVolume();
        samsungTVRemote.nextChannel();

        // Call the displayStatus method
        samsungTVRemote.displayStatus();

        // Perform more actions...
    }
}
