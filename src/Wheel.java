import java.util.*;

public class Wheel {
    private List<Integer> numbersForRandom;

    public Wheel(int countNumbers) {
        numbersForRandom = new ArrayList<>();
        for (int i = 1; i <= countNumbers; i++) {
            numbersForRandom.add(i);
        }
    }

    public int getWinNumber(){
        int randomIndex = (int) (numbersForRandom.size() * Math.random());
        int winNumber = numbersForRandom.get(randomIndex);
        numbersForRandom.remove(randomIndex);
        return winNumber;
    }
}
