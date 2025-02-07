class Device {
String deviceId;
String status;
Device(String deviceId, String status) {
this.deviceId = deviceId;
this.status = status;
}
void displayStatus() {
System.out.println("Device ID: " + deviceId + ", Status: " + status);
}
}
class Thermostat extends Device {
int temperatureSetting;
Thermostat(String deviceId, String status, int temperatureSetting) {
super(deviceId, status);
this.temperatureSetting = temperatureSetting;
}
void displayStatus() {
System.out.println("Device ID: " + deviceId + ", Status: " + status + ", Temperature Setting: " + temperatureSetting + "°C");
}
}
public class SmartHomeSystem {
public static void main(String[] args) {
Thermostat thermostat = new Thermostat("T123", "Active", 22);
thermostat.displayStatus();
}
}

