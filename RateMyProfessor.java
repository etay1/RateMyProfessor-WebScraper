import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;

public class RateMyProfessor {
    private String sId;
    private Document doc;
    private String name;


    public RateMyProfessor() throws IOException {
        //creates a document from the page of a professor based on RMP ID
        // Defaults to Daniel Rogers @ SUNY Brockport if no parameters are given
            sId = "307614";
            doc = Jsoup.connect("https://www.ratemyprofessors.com/ShowRatings.jsp?tid=" + sId).get();
    }

    //Single setter to determine url to extract
    public void setId (String sId) throws IOException {
        this.doc = Jsoup.connect("https://www.ratemyprofessors.com/ShowRatings.jsp?tid=" + sId).get();
        this.sId = sId;
    }

    //List of useable functions after initializing objects
    public String getId () {
        return this.sId;
    }

    public String getName() {
        String firstName = "";
        String lastName = "";


        //Grabs first name element from RMP doc
        for (Element element : doc.select(
                "#root > div > div > div.PageWrapper__StyledPageWrapper-sc-3p8f0h-0.gtQBUD >" +
                        " div.TeacherRatingsPage__TeacherBlock-a57owa-1.erHhng >" +
                        " div.TeacherInfo__StyledTeacher-ti1fio-1.kFNvIp > div:nth-child(2) >" +
                        " div.NameTitle__Name-dowf0z-0.cfjPUG > span:nth-child(1)")) {
            firstName += element;
        }

        firstName=firstName.substring(6,firstName.length()-7);

        //Grabs last name element from RMP doc
        for (Element element : doc.select(
                "#root > div > div > div.PageWrapper__StyledPageWrapper-sc-3p8f0h-0.gtQBUD >" +
                        " div.TeacherRatingsPage__TeacherBlock-a57owa-1.erHhng > div.TeacherInfo__StyledTeacher-ti1fio-1.kFNvIp >" +
                        " div:nth-child(2) > div.NameTitle__Name-dowf0z-0.cfjPUG > span.NameTitle__LastNameWrapper-dowf0z-2.glXOHH")) {
            lastName += element;
        }
        //Formats name from div
        lastName = lastName.substring(57,lastName.length()-256);

        //In the case of middle names, the middle name gets concatenated to first name
        //i.e. First Middle Last
        return firstName + " " + lastName;
    }

    public String getDepartment() {
        String dept = "";

        for (Element element : doc.select(
                "#root > div > div > div.PageWrapper__StyledPageWrapper-sc-3p8f0h-0.gtQBUD " +
                        "> div.TeacherRatingsPage__TeacherBlock-a57owa-1.erHhng > " +
                        "div.TeacherInfo__StyledTeacher-ti1fio-1.kFNvIp > div:nth-child(2) > " +
                        "div.NameTitle__Title-dowf0z-1.iLYGwn > span > b")) {
            dept += element;
        }

        //Formats department from div
        dept = dept.substring(3,dept.length()-23);

        return dept;
    }

    public double getRating() {
        String sRating = "";
        double rating;
        //Grabs rating element
        for (Element element : doc.select(
                "#root > div > div > div.PageWrapper__StyledPageWrapper-sc-3p8f0h-0.gtQBUD " +
                        "> div.TeacherRatingsPage__TeacherBlock-a57owa-1.erHhng " +
                        "> div.TeacherInfo__StyledTeacher-ti1fio-1.kFNvIp " +
                        "> div:nth-child(1) > div.RatingValue__AvgRating-qw8sqy-1.gIgExh >" +
                        " div > div.RatingValue__Numerator-qw8sqy-2.liyUjw")) {
            sRating += element;
        }

        //Formats rating element into double - might need to convert it to a
        // "x / 5.0" => format into fraction but based on RMP ratings but this'll do for now
        sRating = sRating.substring(54,57);
        rating = Double.parseDouble(sRating);

        return rating;
    }

    public void printDetails () {
        System.out.print("Professor " + getName() + "\n" +
                         "Department: " + getDepartment() + "\n" +
                         "Overall Rating: " + getRating());
    }
}
