package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        return answer;
    }

    private static List<Integer> separateNumber(int num){
        List<Integer> list = new ArrayList<>();
        while(num > 0){
            list.add(num % 10);
            num = num /10;
        }
        return list;
    }

}
