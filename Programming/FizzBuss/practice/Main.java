package practice;

import java.util.Scanner;

public class Main {

	private static final String DISP_MESSAGE_THREE_MULTIPLE = "Fizz";
	private static final String DISP_MESSAGE_FIVE_MULTIPLE = "Buzz";
	private static final String DISP_MESSAGE_THREE_AND_FIVE_MULTIPLE = "Fizz Buzz";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int inputNum = sc.nextInt();

		// TODO 数値かどうかのチェックを入れる

		// 入力値条件チェック
		// TODO 入力値条件⇒「1以上100以下なので...。」
		if (inputNum < 1 || inputNum > 100) {
		// if (inputNum <= 0 || inputNum > 100) {
			System.out.println("error");
			sc.close();
			return;
		}

		// 入力された数値の数だけ1から数値を表示
		for (int i = 1; i <= inputNum; i++) {

			if ((i % 3 == 0) && (i % 5 == 0)) {
				// 3と5の公倍数の場合
				dispMessage(DISP_MESSAGE_THREE_AND_FIVE_MULTIPLE);
			} else if (i % 3 == 0) {
				// 3の倍数の場合
				dispMessage(DISP_MESSAGE_THREE_MULTIPLE);
			} else if (i % 5 == 0) {
				// 5の倍数の場合
				dispMessage(DISP_MESSAGE_FIVE_MULTIPLE);
			} else {
				// それ以外の場合
				System.out.println(i);
			}
		}

		// Scannerクラスをクローズ
		sc.close();
	}

	private static void dispMessage(String dispMessage) {
		System.out.println(dispMessage);
	}
}
