import java.util.HashSet;
import java.util.Set;

public class Runner {
    private static final int SIZE_RANGE_NUMBERS = 49;
    private static final int COUNT_NUMBER_OF_PLAYED = 6;
    private static final int COUNT_TICKETS = 1000000;

    public static void main(String[] args) {

        GeneratorNumbersForTicket generator = new GeneratorNumbersForTicket(SIZE_RANGE_NUMBERS);

        Set<Ticket> tickets = new HashSet<>();
        for (int i = 1; i <= COUNT_TICKETS; i++) {
            tickets.add(new Ticket(generator.generate(COUNT_NUMBER_OF_PLAYED)));
        }

        RevealWinners winners = new RevealWinners();

        winners.setTickets(tickets);

        Wheel wheel = new Wheel(SIZE_RANGE_NUMBERS);

        for (int i = 1; i <= COUNT_NUMBER_OF_PLAYED; i++) {
            winners.setWinNumber(wheel.getWinNumber());
        }

        winners.printWinners();













    }

}
