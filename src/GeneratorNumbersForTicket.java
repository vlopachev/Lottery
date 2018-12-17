import java.util.*;

public class GeneratorNumbersForTicket {
    private  List<Integer> rangeNumbers = new ArrayList<>();

    public GeneratorNumbersForTicket(int sizeRangeNumbers) {
        for (int i = 1; i <= sizeRangeNumbers; i++) {
            rangeNumbers.add(i);
        }
    }

    public Set<Integer> generate(int countNumbers){
        Collections.shuffle(rangeNumbers);
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < countNumbers; i++) {
            numbers.add(rangeNumbers.get(i));
        }
        return numbers;
    }

    public List<Integer> getRangeNumbers() {
        return rangeNumbers;
    }

    public void setRangeNumbers(List<Integer> rangeNumbers) {
        this.rangeNumbers = rangeNumbers;
    }
}
