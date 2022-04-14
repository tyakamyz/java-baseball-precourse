package baseball.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    /* 숫자 값 입력 */
    public static String inputNumber() {
        ResultView.inputNumberMessage();
        return readLine();
    }

    /* 게임 시작 종료 선택 */
    public static int InputGameStartOrEnd() {
        ResultView.gameRestartOrEndMessage();
        return Integer.parseInt(readLine());
    }
}
