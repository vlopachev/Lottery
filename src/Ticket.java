import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ticket {
    private static long counterId;
    private long id;
    private Set<Integer> numbers;
    private Set<Integer> numbersMatchTheWinning = new HashSet<>();
    private boolean isWin;

    public Ticket() {
        id = ++counterId;
    }

    public Ticket(Set<Integer> numbers) {
        this();
        this.numbers = numbers;
    }

    public Set<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(Set<Integer> numbers) {
        this.numbers = numbers;
    }

    public boolean isWin() {
        return isWin;
    }

    public void setWin(boolean win) {
        isWin = win;
    }

    public long getId() {
        return id;
    }

    public Set<Integer> getNumbersMatchTheWinning() {
        return numbersMatchTheWinning;
    }

    public void setNumbersMatchTheWinning(Set<Integer> numbersMatchTheWinning) {
        this.numbersMatchTheWinning = numbersMatchTheWinning;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", numbers=" + numbers +
                ", numbersMatchTheWinning=" + numbersMatchTheWinning +
                ", isWin=" + isWin +
                '}';
    }
}
