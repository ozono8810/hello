import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KeyBoard {

    public static int inputNumber(){
        String line = null;
        int number = -1;
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			line = br.readLine();
            number = Integer.parseInt(line);
        } catch (NumberFormatException e) {
			System.err.println("エラー：フォーマット例外です．もう一度入力してください．");
            return inputNumber();
        } catch (IOException e) {
			System.err.println("エラー：入出力例外です．終了します．");
			System.exit(1);
		}
        return number;
    }
}