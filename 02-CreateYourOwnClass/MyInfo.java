// คลาสหลักสำหรับรันโปรแกรม
public class MyInfo { 
    public static void main(String[] args) {
        // 4. สร้าง object จาก Class Car
        Car myCar = new Car();

        // 5. ใช้ setter เพื่อกำหนดค่า
        myCar.setBrand("Tesla");
        myCar.setSpeed(120);

        // 6. เรียกใช้ displayInfo()
        System.out.println("--- Car Details ---");
        myCar.displayInfo();
        
        // ทดสอบการดึงค่าผ่าน getter โดยตรง
        System.out.println("Checking only brand via getter: " + myCar.getBrand());
    }
}


// คลาสสำหรับเก็บข้อมูลรถยนต์ (Template)
class Car {
    // 1. สร้าง property แบบ private (Encapsulation)
    private String brand;
    private int speed;

    // 2. Getter/Setter สำหรับ Brand
    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public String getBrand() {
        return brand;
    }

    // 2. Getter/Setter สำหรับ Speed
    public void setSpeed(int newSpeed) {
        // เพิ่มเงื่อนไขเล็กน้อยเพื่อฝึก Validation: ความเร็วต้องไม่ติดลบ
        if (newSpeed >= 0) {
            this.speed = newSpeed;
        } else {
            System.out.println("Error: Speed cannot be negative!");
        }
    }

    public int getSpeed() {
        return speed;
    }

    // 3. Method สำหรับแสดงข้อมูล
    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

