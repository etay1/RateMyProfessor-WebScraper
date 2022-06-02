# RateMyProfessorAPI
Java API for searching Rate My Professor data from all professors on RMP. This class can have numerous uses, and can be easily modified for use in your RMP applications.

### Getting Started

Professor objects need to be initialized with their corresponding Rate My Professor transaction identifier. 

```Java
RateMyProfessor professor = new RateMyProfessor();
professor.setId("307614");
```
This ID number can be easily obtained by visiting the Rate My Professor page for that professor. At this page, the URL contains the ID number for that professor. 

```url
https://www.ratemyprofessors.com/ShowRatings.jsp?tid=307614
```
### Some Functions

```
professor.getName();
professor.getDepartment();
professor.getRating();
professor.printDetails();
```
The functions will return information on the searched professor. In this case, we search for the RMP data on Daniel Rogers a professor from SUNY Brockport using his RMP TID.

```
professor.printDetails();
```
The above function will print out the following

```
Professor Daniel Rogers
Department: Computer Science
Overall Rating: 4.3
Level of Difficulty: 2.4
```
This class can be easily edited to use in your project.
