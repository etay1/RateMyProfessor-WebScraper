# RateMyProfessorAPI
Java API for searching Rate My Professor data from all professors on RMP. This class can have numerous uses, and can be easily modified for use in your RMP applications.

### Getting Started

Professor objects need to be initialized with their corresponding Rate My Professor security identifier. 

```Java
RateMyProfessor professor = new RateMyProfessor("2542462");
```
This ID number can be easily obtained by visiting the Rate My Professor page for that professor. At this page, the URL contains the ID number for that University. 

```url
https://www.ratemyprofessors.com/ShowRatings.jsp?tid=307614
```
### Some Functions

```
professor.getName();
professor.getDepartment();
professor.getRating();
```
The function above will return and print basic information on the searched professor. In this case, we search for the RMP data on Daniel Rogers a great professor from SUNY Brockport using his RMP ID. The printed and the returned dictionary can be found below.

```
{
Daniel Rogers
Computer Science
4.3
}
```

```
professor.getRating();  
```
The above funtion will print out and return the requested value. The result is below.

```
4.3
```
This class can be easily edited to use in your project.
