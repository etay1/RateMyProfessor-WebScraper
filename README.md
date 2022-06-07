# RateMyProfessor AWS Lambda Function
Java API for searching Rate My Professor data from all professors on RMP. This class can have numerous uses, and can be easily modified for use in your RMP applications.

### Getting Started


The required ID number can be easily obtained by visiting the professor's RMP page

```url
https://www.ratemyprofessors.com/ShowRatings.jsp?tid=307614
```
### Some Methods

```
professor.getName();
professor.getDepartment();
professor.getUniversity();
professor.getRating();
professor.getLevelOfDifficulty();
professor.getRecentComment();
```

The lambda function will return the following json string the the following parameter User input: "307614"
```
{
  "Professor": "Daniel Rogers",
  "Department": "Computer Science",
  "University": "SUNY Brockport",
  "Recent Comment": "Rogers is a great professor for people just starting out with computer science. Computer science is definitely not something that everyone   understands (including me), but Rogers tries to give you as many points on tests and labs that he can. He is a very fair grader and is always willing to help in lab.",
  "Overall Rating": 4.3,
  "Level of Difficulty": 2.4
}

```
This json string can be easily reformatted in other programming languages.
