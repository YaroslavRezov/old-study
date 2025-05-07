public class Method31 {
    public static void main(String[] args) {
        Method31 method3 = new Method31();
        method3.method31(3, 1);
        method3.method43(4, 12, "+");
        System.out.println(method3.method4(5, 3));

    }

    public void method31(int x, int y) {
        System.out.println(y + "+" + x);
    }

    public void method43(int first, int second, String operator) {
        int result;
        if(operator == "+") {
        result = first + second;
        System.out.println(result);
        }
        if(operator == "-"){
        result = first - second;
        System.out.println(result);
        }
        if (operator == "*") {
        result = first * second;
        System.out.println(result);
        }

    }
    public double method4(double aTheNum, double dTheNum) {
        double result;
        double result2;
        double b2 = 2;
        double c2 = 2;
        result = Math.pow(aTheNum,b2);
            result2 = Math.pow(dTheNum,c2);
            double result3 = result + result2;
            double result4 = Math.sqrt(result3);
            return result4;
    }
}

