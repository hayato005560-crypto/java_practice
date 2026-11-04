public class Lesson5 {
    public static void main(String[] args) {
        int result = multiply(6, 7);
        System.out.println(result);
    }
    
    // 呼び出し元に戻り値を返すメソッド。void型ではないので、戻り値の型を指定する必要がある。
    public static int multiply(int a, int b){
        int answer = a * b;
        return answer;
    }
}