import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
            RateMyProfessor professor = new RateMyProfessor("307614");
            professor.getName();
            professor.getDepartment();
            professor.getRating();
    }
}

/*Sample Output: 
Daniel Rogers
Computer Science
4.3
*/
