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

        String inputStr = readLine();
        if("1".equals(inputStr) || "2".equals(inputStr)){
            return Integer.parseInt(inputStr);
        }

        throw new IllegalArgumentException("잘못된 입력 값. 강제 종료 합니다.");
    }
}
