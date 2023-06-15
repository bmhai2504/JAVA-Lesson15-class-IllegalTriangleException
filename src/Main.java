import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vap 3 canh tam giac");
        try {
            System.out.println("Canh 1: ");
            double a = scanner.nextDouble();
            System.out.println("Canh 2: ");
            double b = scanner.nextDouble();
            System.out.println("Canh 3: ");
            double c = scanner.nextDouble();
            TriangleCheck triangleCheck = new TriangleCheck();
            triangleCheck.checkTriangleCheck(a,b,c);
        }catch (IllegalTriangleException e){
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}