import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
            RateMyProfessor professor = new RateMyProfessor("307614");
            professor.getName();
            professor.getDepartment();
            professor.getRating();
    }
}

/*Sample Output: 

Professor Daniel Rogers
Department: Computer Science
Overall Rating: 4.3

*/
