// 1. Interface: ข้อตกลงว่า "ทุกเครื่องต้องเล่นเพลงได้"
interface Playable {
    void play();
}

// 2. Abstract Class: แม่พิมพ์ของเครื่องเล่นเพลง (สร้าง object โดยตรงไม่ได้)
abstract class MusicDevice {
    private String brand; // ใช้ private เพื่อความปลอดภัย

    // Setter สำหรับกำหนดชื่อยี่ห้อ
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter สำหรับดึงชื่อยี่ห้อ
    public String getBrand() {
        return brand;
    }

    // Method ปกติ: ทุกเครื่องทำงานเหมือนกัน
    public void info() {
        System.out.println("เครื่องเล่นเพลงยี่ห้อ: " + brand);
    }

    // Abstract Method: บังคับให้ลูกไปเขียนวิธีเชื่อมต่อเอง
    public abstract void connect();
}

// 3. Class CDPlayer: ลูกที่สืบทอดแม่ และทำตามข้อตกลง Playable
class CDPlayer extends MusicDevice implements Playable {
    @Override
    public void connect() {
        System.out.println("เชื่อมต่อแผ่น CD...");
    }

    @Override
    public void play() {
        System.out.println("กำลังเล่นเพลงจาก CD");
    }
}

// 4. Class Smartphone: ลูกอีกคนที่มีวิธีทำงานต่างออกไป
class Smartphone extends MusicDevice implements Playable {
    @Override
    public void connect() {
        System.out.println("เชื่อมต่อผ่าน Bluetooth...");
    }

    @Override
    public void play() {
        System.out.println("กำลังเล่นเพลงจาก Spotify");
    }
}

// 5. Main Method สำหรับทดสอบระบบ
public class MyInfo {
    public static void main(String[] args) {
        System.out.println("=== Testing CD Player ===");
        CDPlayer myCD = new CDPlayer();
        myCD.setBrand("Sony");
        myCD.connect(); // มาจากตัวมันเอง (Abstract implementation)
        myCD.info(); // มาจากคลาสแม่
        myCD.play(); // มาจาก Interface

        System.out.println("\n=== Testing Smartphone ===");
        Smartphone myPhone = new Smartphone();
        myPhone.setBrand("Samsung");
        myPhone.connect(); // มาจากตัวมันเอง (Abstract implementation)
        myPhone.info(); // มาจากคลาสแม่
        myPhone.play(); // มาจาก Interface
    }
}
