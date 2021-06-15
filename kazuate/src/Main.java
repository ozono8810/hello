public class Main {

    public static int NUMBER = 77;

    public static void main(String[] args) throws Exception {
        for(int i = 0; i < 5; i++) {
            System.out.print("数字を入力してください．(あと" + (5-i) + "回) : ");
            int num = KeyBoard.inputNumber();
            if(num < 10 || num > 99){
                System.out.println("2桁の正の整数を入力してください．");
                continue;
            }
            if(num == NUMBER) {
                System.out.println("当たりです！");
                return;
            }
            if(NUMBER - num > 0) {
                System.out.println("正解の値より小さいです．");
            }
            else {
                System.out.println("正解の値より大きいです．");
            }
            if(Math.abs(NUMBER - num) > 19) {
                System.out.println("正解の値と20以上の差があります．");
            }
            System.out.println("");
        }
        System.out.println("残念！ 正解は" + NUMBER + "でした！");
    }
}
