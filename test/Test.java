import org.jsoup.HttpStatusException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            RateMyProfessor professor = new RateMyProfessor();
            professor.setId("307614");
            professor.printDetails();
        }

        catch (HttpStatusException e) {
            System.out.println("Invalid RMP ID \n" +
                    "Use the setId function to establish connection");
        }

    }
}
