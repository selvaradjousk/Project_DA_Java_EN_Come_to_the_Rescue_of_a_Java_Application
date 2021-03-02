Sample project for OpenClassroom's fundamentals of Java

# Heme Biotech - Trend Analysis Java App

## Overview
The relationship with the clients is the key vital point to all business and especially in the field of medicine like veterinary. The information gathered on basic need assessment of the clients plays a phenomenal role on the synergy of development of medicines in line with the market needs and demands.
Prediction of their needs is a challenging task that can be performed through Trend Analysis on the up to date "customer consumption pattern data". 

In this project, we focus on the developing an Java App for computing the symptoms and its frequency of occurences from the day-to-day data with the list of symtoms registered based on its regular demand by the client over the period of time.

This project is aimed to develop a App tool using Java to help the the client to serve the customers by providing continued assurance in the production and availability of the products of better quality possible.

## Guidelines

- Fork this repository at the "Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application" from the git source into your git own repository.
- Now clone the repository to your local.
- Run git flow init
- From inside the branch 'develop' start working with the branches feature / hotfix / release ...
- Follow your convinient Git Flow workflow.

### Prerequisites
Java development supporting IDE of your choice (Eclipse, Neabeans, intellij..;)

## Brief Source Code Review

###  Main program is named as AnalyticsController
This main class contains numerous functional classes wherein the AnalyticsCounter Class that coordinates the functions from different classes in a centralized manner as below:
#### The instance analyticsCounter of the class AnalyticsCounter
```java
		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
```
The instance analyticsCounter of the class AnalyticsCounter is created to access the different methods

#### The readInputFile () Method
```java
		analyticsCounter.readInputFile();
```
This method is used to call the functions for reading the input file and loading into arraylist

#### Method for counting and sorting the symptom count
```java
		analyticsCounter.symptomOccurenceCountAndSorting();
```
This method is used for calling the functions from different classes to perform the computations and deliver the results into a TreeMap for having a sorted result

#### Method for sending results to output file
```java
		analyticsCounter.sendResultToOutputFile();
```
The sorted results are delivered into the output file specified in the file definition in the initial phase


###  AnalyticsCounter Class coordinates with the other classes as below:
1. Definition of ArrayList and TreeMap for loading the input source data accessible for computation and render proper structured output:
```java
		List<String> listedSymptomOccurenceInSourceData = new ArrayList<String>();
		Map<String, Integer> loadingSymptomsIntoMap = new TreeMap<String, Integer>();
```		
	Using above ArrayList and TreeMap we load the data containing the list of symptoms that will be gathered from the input source file.

2. Defining an input file for data source and output file for the result data output destination
```java
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(
				FileInputAndOutputSourceDefinition.getDataInputFileName());
```
	opens an instance of ReadSymptomDataFromFile, fetches the input data file through the function FileInputAndOutputSourceDefinition.getDataInputFileName()
	
	
3. Fetch the information on the source file and read the data from the input file:	
```java		
		listedSymptomOccurenceInSourceData = readSymptomDataFromFile.getSymptoms();
```
	gathers information on list of occurence of symptoms provided in the input data


4.  Computation of the Frequency of occurence of the symptoms:
```java			
		loadingSymptomsIntoMap = ComputingSymptomsAnalytics.sortedSymptomOccurenceFrequencyData(listedSymptomOccurenceInSourceData);
```
	Here the computation analytics is performed using the function sortedSymptomOccurenceFrequencyData() with listed data as input parameter.
	
5. Generating the report and publishing results into a output file defined:	
```java			
		GenerateOutputReportFile.generateOutputResults(loadingSymptomsIntoMap, listedSymptomOccurenceInSourceData);
```
	calls the function generateOutputResults() supplying the parameters loadingSymptomsIntoMap, listedSymptomOccurenceInSourceData, which are the output of Computation Analytics object.
 
## More Info
More information and and details on this project please contact at https://openclassrooms.com/

## Disclaimers
* This is a basic starting project of a training program delivered by Openclassrooms.

## License
Openclassrooms


## Support
Please enter an issue in the repo for any questions or problems. 
<br> Alternatively, please contact us at hello@openclassrooms.com

## Authors

Senthil-Kumar Selvaradjou with the team members of Openclassrooms
Mentor: M. Mehdi Elketroussi

See also the list of [contributors](https://github.com/OpenClassrooms-Student-Center/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/tree/master/Project02Eclipse) who participated in this project.

## Acknowledgments

* https://openclassrooms.com/
* https://github.com/
* https://stackoverflow.com/
* All Java online supporters through means of blogs and tutorials
