package baseball.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    /* 숫자 값 입력 */
    public static String inputNumber() {
        System.out.print(ResultView.INPUT_NUMBER);
        return readLine();
    }

    /* 게임 시작 종료 선택 */
    public int InputGameStartOrEnd() {
        System.out.println(ResultView.GAME_RESTART_OR_END);
        return Integer.parseInt(readLine());
    }
}
