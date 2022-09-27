import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int result = scanner.nextInt();
        solution(a,b,c,d,result);
        solution(a,b,d,c,result);
        solution(a,c,d,b,result);
        solution(a,c,b,d,result);
        solution(a,d,b,c,result);
        solution(a,a,c,b,result);
        solution(b,a,c,d,result);
        solution(b,a,d,c,result);
        solution(b,c,d,a,result);
        solution(b,c,a,d,result);
        solution(b,d,a,c,result);
        solution(b,d,c,a,result);
        solution(c,b,a,d,result);
        solution(c,b,d,a,result);
        solution(c,a,d,b,result);
        solution(c,a,b,d,result);
        solution(c,d,b,a,result);
        solution(c,d,a,b,result);
        solution(d,b,a,c,result);
        solution(d,b,c,a,result);
        solution(d,a,c,b,result);
        solution(d,a,b,c,result);
        solution(d,c,b,a,result);
        solution(d,c,a,b,result);



    }

    public static  void solution(int a,int b ,int c,int d,int result){
        Map<Integer,String> operator = new HashMap<Integer, String>();
        operator.put(0,"+");
        operator.put(1,"-");
        operator.put(2,"*");
        operator.put(3,"/");
        for (int i = 0; i < 4; i++) {
            int result1 = a + b;
            switch (i) {
                case 0:
                    result1 = a + b;
                    break;
                case 1:
                    result1 = a - b;
                    break;
                case 2:
                    result1 = a * b;
                    break;
                case 3:
                    if(a%b==0 && a>b) {
                        result1 = a / b;
                    }else continue;
                    break;
            }
            for (int j = 0; j < 4; j++) {
                int result2 = result1 + c;
                switch (j) {
                    case 0:
                        result2 = result1 + c;
                        break;
                    case 1:
                        result2 = result1 - c;
                        break;
                    case 2:
                        result2 = result1 * c;
                        break;
                    case 3:
                        if(result1%c==0 && result1>c) {
                            result2 = result1 / c;
                        }else continue;
                        break;
                }
                for (int k = 0; k < 4; k++) {
                    int result3=0;
                    switch (k) {
                        case 0:
                            result3 = result2 + d;
                            break;
                        case 1:
                            result3 = result2 - d;
                            break;
                        case 2:
                            result3 = result2 * d;
                            break;
                        case 3: if(result2%d==0 && result2>d) {
                            result3 = result2 / d;
                        }else continue;
                            break;


                    }
                    if (result3 == result) {
                        System.out.println(a+operator.get(i) +b+operator.get(j)+c+operator.get(k)+d+" = "+ result);

                    }
                }
             }


        }
    }
}