package baseball.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Balls {

    static final int BALLS_COUNT = 3;
    public List<Ball> balls;

    public Balls() {
        balls = new ArrayList<>();
    }

    public void addBalls(List<Integer> numberList){

        /* 유효성 체크 */
        numberValidateCheck(numberList);

        for (int i = 0; i < numberList.size(); i++) {
            addBall(new Ball(i+1, numberList.get(i)));
        }
    }

    private void addBall(Ball ball) {
        balls.add(ball);
    }

    private void numberValidateCheck(List<Integer> numberList) {

        /* List를 Set으로 변경 (중복 제거) */
        Set<Integer> numberSet = new HashSet<>(numberList);

        if(numberSet.size() != BALLS_COUNT){
            throw new IllegalArgumentException("중복된 값이 없도록 숫자 3개를 입력해주세요.");
        }


    }
}
