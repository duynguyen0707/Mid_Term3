import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //     Viết chương trình nhập vào một số nguyên dương (n >= 0), kiểm tra số đó có là một tháng trong năm không. Nếu có thì in ra tháng đó có bao nhiêu ngày.
        int n = inPutANumber();
        numberOfDayInMonth(n);
    }

    // Hàm kiểm tra xem có phải là số nguyên dương k
    public static boolean isPositiveNumber(int n) {
        boolean re = true;
        if (n >= 0)
            return true;
        return false;

    }
    // hàm input 1 số nguyên dương
    public static int inPutANumber() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 sô nguyên dương: ");
        n = sc.nextInt();
        boolean bl = isAValidMonth(n);
        if (bl == false)
            System.out.println("Vui lòng nhập số nguyên dương");

        return n;
    }

    // Kiểm tra số nhập vào có phải là 1 tháng trong năm k?
    public static boolean isAValidMonth(int n) {
        if (n >= 1 && n < 13)
            return true;
        return false;
    }

    // Hàm in ra tháng nhập vào có bao nhiêu ngày
    public static void numberOfDayInMonth(int month) {

        if (isAValidMonth(month)) {
            if (month == 2) {
                System.out.println("Số ngày là 28 nếu ko phải năm nhuần, số ngày là 29 nếu là năm nhuần");
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("Số ngày của tháng " + month + " là 31 ngày");
            } else
                System.out.println("Số ngày của tháng " + month + " là 30 ngày");
        }
    }

    // hàm kiểm tra xem chuỗi nhập vào có chứa kí tự hay ko?
    public static boolean isContainChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) || Character.isWhitespace(str.charAt(i)))
                return true;
        }
        return false;
    }
}
