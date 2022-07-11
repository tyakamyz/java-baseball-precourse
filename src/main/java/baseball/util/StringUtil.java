package baseball.util;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {

    public static List<Integer> stringToIntegerList(String str){

        List<Integer> integerList = new ArrayList<>();

        try {
            for(String s : str.split("")){
                integerList.add(Integer.parseInt(s));
            }
        }catch (Exception e){
            throw new IllegalArgumentException("값이 올바르지 않습니다.");
        }

        return integerList;
    }
}
