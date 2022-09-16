# RateMyProfessor AWS Lambda Function
### As of July 14th this is no longer functional. Updates to the site have altered the CSS queries. To fix the methods will need be readjusted for the strings to be targeted

### Getting Started
The parameter for this function is the RMP ID on the each professor's RMP page.

The required ID number can be easily obtained by visiting the associated page for that professor.

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

The lambda function will return the following json string after the following user input: "307614"

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
This json pretty content can be easily reformatted in other programming languages. 
