class Vehicle {
    // 1. ยังคงเป็น private เพื่อความปลอดภัย
    private String brand;

    // 2. สร้าง Setter เพื่อรับค่า
    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    // 3. สร้าง Getter เพื่อให้คนอื่น (รวมถึงคลาสลูก) ดึงค่าไปใช้ได้
    public String getBrand() {
        return brand;
    }

    public void start() {
        // ในคลาสเดียวกัน เรียก brand ตรงๆ ได้
        System.out.println(brand + " กำลังสตาร์ท..");
    }
}

class Car extends Vehicle {
    public void drive() {
        // 4. แก้ไขตรงนี้: เรียกใช้ getBrand() แทนการเรียก brand ตรงๆ
        System.out.println(getBrand() + " กำลังขับเคลื่อนบนถนน");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Toyota");
        
        myCar.start();
        myCar.drive();
    }
}