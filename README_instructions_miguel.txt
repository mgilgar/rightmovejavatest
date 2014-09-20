Done by Miguel Gil Garcia for rightmove. 2014/09/19 10:00am

INSTRUCTIONS:
From the command line, go to the parent folder of this project.
Then write and press enter:
java -cp eclipsebuild/ com.rightmove.ManipulateDataApplication

ASSUMPTIONS:

-As the time is only 1 hour in a time frame of 3, I have assumed the input from the file will be always right. Anyway the only input
that the application is supposed to work is the one provided. There is not error handling. It was not a requirement either.

-Not sure if providing testing was a requirement, anyway I think it is essential and as I have some time left, I provide some basic test.

-As per maven conventions main and tests should be separated. As the example project is not a maven one and does not have these two directories 
and I do not think the purpose of this test is to change the structure to a maven project, I am giving the tests in the same directories 
where the classes they test are.

-in ManipulateDataApplicationTest I could have mocked the file but I thought it was not the purpose of this exercise. So instead of a pure
unit test is more an integration test.

-DaysJeffBritonIsOlderThanTomSoyer is a very specific class but the requirements are clear and according to most common agile practices,
we should focus first on what is needed at every moment and do not over engineer. Anyway I have develop a more generic protected method 
that allows parametrization in the report.

-To substract dates in DaysJeffBritonIsOlderThanTomSayerReport I could have used Joda DateTime, however I assume using java.util.Date was
enough. Joda would have provided a nicer way to substract dates but I think the purpose of the exercises is different and time constrains
do not allow to do that. I just follow a very simple and quick approach.