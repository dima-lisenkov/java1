import java.util.Scanner;

public class proj_3 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int A = nextInt();
        int B = nextInt();
        char operation = getOperation();
        int result = calc(A, B, operation);
        System.out.print("Результат: "+ result);
    }

    public static int nextInt(){
        System.out.println("Введите число:");
        int operand;
        if(scan.hasNextInt()){
            operand = scan.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scan.next();//рекурсия
            operand = nextInt();
        }
        return operand;
    }
    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scan.hasNext()){
            operation = scan.next().charAt(0);
        } else {
            System.out.println("Ошибка, попробуй еще раз!");
            scan.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int operand1, int operand2, char operation){
        int result;
        switch (operation){
            case '+':
                result = operand1+operand2;
                break;
            case '-':
                result = operand1-operand2;
                break;
            case '*':
                result = operand1*operand2;
                break;
            case '/':
                result = operand1/operand2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(operand1, operand2, getOperation());//рекурсия
        }
        return result;
    }
}
