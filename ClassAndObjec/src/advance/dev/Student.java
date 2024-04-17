package advance.dev;

public class Student {
	
	    String name;
	    int age;
	    String address;
	    String phoneNumber;
	    float GPA;
	}

	// Lớp chính MainApp
	public class MainApp {

	    // Phương thức nhập danh sách sinh viên từ bàn phím
	    public static void input(Student[] students) {
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < students.length; i++) {
	            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");

	            System.out.print("Tên: ");
	            students[i].name = scanner.nextLine();

	            System.out.print("Tuổi: ");
	            students[i].age = scanner.nextInt();
	            scanner.nextLine(); // Đọc ký tự new line sau khi đọc số tuổi

	            System.out.print("Địa chỉ: ");
	            students[i].address = scanner.nextLine();

	            System.out.print("Số điện thoại: ");
	            students[i].phoneNumber = scanner.nextLine();

	            System.out.print("Điểm trung bình: ");
	            students[i].GPA = scanner.nextFloat();
	            scanner.nextLine(); // Đọc ký tự new line sau khi đọc điểm trung bình
	        }
	    }

	    // Phương thức in danh sách sinh viên
	    public static void print(Student[] students) {
	        System.out.println("Danh sách sinh viên:");
	        for (int i = 0; i < students.length; i++) {
	            System.out.println("Sinh viên " + (i + 1) + ":");
	            System.out.println("Tên: " + students[i].name);
	            System.out.println("Tuổi: " + students[i].age);
	            System.out.println("Địa chỉ: " + students[i].address);
	            System.out.println("Số điện thoại: " + students[i].phoneNumber);
	            System.out.println("Điểm trung bình: " + students[i].GPA);
	            System.out.println();
}
