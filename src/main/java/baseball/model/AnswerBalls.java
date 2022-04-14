package baseball.model;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class AnswerBalls extends Balls{
    AnswerBalls(){
        createRandomBalls();
    }

    private void createRandomBalls(){
        List<Integer> randomNumberList = new ArrayList<>();

        while (randomNumberList.size() < 3){
            RandomNumberList(randomNumberList);
        }

        addBalls(randomNumberList);
    }

    private void RandomNumberList(List<Integer> randomNumberList){

        int randomNumber = pickNumberInRange(Ball.MIN_NUMBER_COUNT, Ball.MAX_NUMBER_COUNT);

        if(!randomNumberList.contains(randomNumber)){
            randomNumberList.add(randomNumber);
        }
    }
}
