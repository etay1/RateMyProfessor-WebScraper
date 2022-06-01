import org.jsoup.HttpStatusException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        try {
            RateMyProfessor professor = new RateMyProfessor();
            professor.setId("307614");
            professor.printDetails();
        }
        
        catch (HttpStatusException e) {
            System.out.println("Invalid RMP ID");
        }
        
    }
}


/*Sample Output: 

Professor Daniel Rogers
Department: Computer Science
Overall Rating: 4.3

*/
