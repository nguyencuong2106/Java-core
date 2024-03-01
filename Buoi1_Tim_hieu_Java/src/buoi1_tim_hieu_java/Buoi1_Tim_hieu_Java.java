package buoi1_tim_hieu_java;

import java.util.Scanner;

public class Buoi1_Tim_hieu_Java {

    public static void main(String[] args) {
        
        
        //  Java được xây dựng trên bảng chữ cái Unicode
        //       +  Chữ cái hoa và thường : A,B,C... a,b,c
        //       + chữ số : 0,1,2,3...9
        //       + Kí hiệu toán học : +, -,* ,/,=
        
        
        // Một số từ khóa của Java
        // + abstract : Sử dụng để khai báo lớp, phương thức trừu tượng
        // + boolean : Kiểu dữ liệu logic
        // + break : được sd kết thúc vòng lặp hoặc cấu trúc switch
        
        // + main : tên phương thức 
        // + String : Tên kiểu dữ liệu
        // + args : tên biến
        // + Qui ước đặt tên : Con lạc đà - myLove
        
        // 4. Lệnh và khối lệnh trong Java
        // 5. Cấu trúc 1 chương trình Java
        
        // 7. Chương trình Java đầu tiên
        System.out.println("Hello world");
        
    /*    public class Main: Đây là khai báo một lớp (class) có tên là "Main". Trong Java, một chương trình thường bắt đầu từ một lớp chứa phương thức main.

        public static void main(String[] args): Đây là phần quan trọng nhất của chương trình. Đây là phương thức (method) chính của chương trình, có tên là "main". Phương thức này là điểm bắt đầu khi chương trình được thực thi. Hãy xem xét một số điểm quan trọng:

        public: Đây là từ khoá quy định rằng phương thức main có quyền truy cập từ bất kỳ đâu trong chương trình.

        static: Từ khoá "static" cho biết rằng bạn có thể gọi phương thức main mà không cần tạo một đối tượng của lớp "Main". Điều này cho phép chương trình được chạy mà không cần khởi tạo đối tượng.

        void: Đây là kiểu dữ liệu trả về của phương thức main. Trong trường hợp này, phương thức không trả về giá trị nào (nó chỉ in dòng chữ "Hello world" ra màn hình).

        main: Đây là tên của phương thức chính.

        (String[] args): Đây là tham số mà phương thức main có thể nhận vào. Trong trường hợp này, chúng ta nhận một mảng các chuỗi (strings) có tên là "args", nhưng chúng ta chưa sử dụng nó trong ví dụ này
        
        */
            // 8.Nhập xuất màn hình console trong Java
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tên của bạn : ");
            String name = scanner.nextLine();
            System.out.println("Tên của bạn là : " + name);
            
            // Sử dụng lớp BufferedReader
            
            // 9. Comment trong Java
            
            // 10. Tổng quan các kiểu dữ liệu
            /* Java có 2 loại kiểu dữ liệu là 
                    + kiểu nguyên thủy (primitive Data types)
                    + các kiểu dữ liệu tham chiếu( Reference Types)
                    */
            
            // Kiểu dữ liệu tham chiếu
            
            
    }

}
