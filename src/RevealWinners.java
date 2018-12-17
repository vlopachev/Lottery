import java.util.*;

public class RevealWinners {
    private Set<Integer> winNumbers = new LinkedHashSet<>();
    private Set<Ticket> tickets;
    private int winNumber;
    private Map<Integer, Integer> countWinners = new HashMap<>();

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Set<Integer> getWinNumbers() {
        return winNumbers;
    }

    public int getWinNumber() {
        return winNumber;
    }

    public void setWinNumber(int winNumber) {
        this.winNumber = winNumber;
        winNumbers.add(winNumber);
        for (Ticket ticket : tickets) {
            if (ticket.getNumbers() != null && ticket.getNumbers().contains(winNumber)) {
                ticket.getNumbersMatchTheWinning().add(winNumber);
            }
        }
    }

    public void printWinners() {
        for (int i = 0; i <= winNumbers.size(); i++) {
            countWinners.put(i, 0);
        }
        for (Ticket ticket : tickets) {
            int countWinNumbers = ticket.getNumbersMatchTheWinning().size();
            countWinners.put(countWinNumbers, countWinners.get(countWinNumbers) + 1);
        }
        for (Map.Entry<Integer, Integer> pair : countWinners.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }
}
