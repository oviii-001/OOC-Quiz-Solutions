package Quiz_3_Sec_I;
// Custom exception class
class TemperatureOutOfRangeException extends Exception {
    public TemperatureOutOfRangeException(String message) {
        super(message);
    }
}

// Device class
class Device {
    private int temperature;

    // Setter method for temperature
    public void setTemperature(int temperature) throws TemperatureOutOfRangeException {
        if (temperature < -10 || temperature > 50) {
            throw new TemperatureOutOfRangeException("Temperature " + temperature + "°C is out of range. It must be between -10°C and 50°C.");
        }
        this.temperature = temperature;
    }

    // Getter method for temperature
    public int getTemperature() {
        return temperature;
    }
}

// Main class-এইটুক লাগবে না, প্রশ্নেই দেয়া আছে।
// public class Ques_2 {
//     public static void main(String[] args) {
//         Device device = new Device();

//         try {
//             device.setTemperature(60);
//         } catch (TemperatureOutOfRangeException e) {
//             System.out.println("Error: " + e.getMessage());
//         }

//         try {
//             device.setTemperature(20);
//             System.out.println("Device temperature: " + device.getTemperature() + "°C");
//         } catch (TemperatureOutOfRangeException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }
