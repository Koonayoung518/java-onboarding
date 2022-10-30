package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {

    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = new ArrayList<>();
        for(int i=0; i< forms.size(); i++){
            String nickname = forms.get(i).get(1);
            for(int j=0; j < nickname.length()-1; j++){
                String word = nickname.substring(j, j+2);
                answer.addAll(findDuplicatedNickname(forms, word, i));
            }
        }
        return answer;
    }
    private static List<String> findDuplicatedNickname(List<List<String>> forms, String word, int index){
        List<String> list = new ArrayList<>();
        for(int i=index+1; i< forms.size(); i++){
            if(forms.get(i).get(1).contains(word))
                list.add(forms.get(i).get(0));
        }
        if(list.size()>0)
            list.add(forms.get(index).get(0));
        return list;
    }
}
