public class TriangleCheck {

    public void checkTriangleCheck(double a , double b, double c) throws IllegalTriangleException{
        if (a < 0 || b < 0 || c < 0){
            throw new IllegalTriangleException("Loi cmnr");
        }else {
            System.out.println("Tam giac hop le!");
        }
        if (a + b <= c || a + c <= b || b + c <= a){
            throw new IllegalTriangleException("Loi cmnr");
        }else {
            System.out.println("Tam giac hop le!");
        }
    }
}
