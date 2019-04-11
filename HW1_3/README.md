Team 18 - HW 5 - README
============

### Framework Domain
Our Framework is a **Restaurant Review Analysis Framework**. 
Specifically, the framework takes the raw reviews of restaurants from DataPlugins and parse those reviews using <a href="https://stanfordnlp.github.io/CoreNLP/">Standford coreNLP library</a>, the results of analysis contain review sentiment and keywords. Then it outputs the analyzed result to Display Plugins for visualization.


### Data Structures

##### `Restaurant`
Data structure for raw data of a single restaurant. \
*Attributes*: \
`String name`: Restaurant name \
`String address`: Restaurant address \
`List<String> reviews`: List of reviews \

##### `RestaurantAnalysis`
Data structure of analysis result of a restaurant. \
*Attributes*: \
`Restaurant restaurant`: Raw data of restaurant \
`Map<String, Integer> positiveKeywordMap`: Positive keyword mapped with their frequency count \
`Map<String, Integer> negativeKeywordMap`: Negative keyword mapped with their frequency count \
`Map<String, Integer> neutralKeywordMap`: Neutral keyword mapped with their frequency count \
`Map<SentimentType, Integer> sentimentMap`: Count map of sentiment analysis result of reviews \
* For example, 20 reviews in total, `sentimentMap` might be 
	* VERY POSITIVE: 7
	* POSITIVE: 5
	* NEUTRAL: 3
	* NEGATIVE: 2
	* VERY NEGATIVE: 3

##### `RestaurantDatasetMap`
Data structure that helps to store restaurants in multiple dataset in the framework. \
*Attibutes*: \
`Map<String, Map<String, RestaurantAnalysis>> restMap`

|     -  | Outer Map | Inner Map |
|------------- | ------------- | -------- |
| Key   | DataSetName | Restaurant Name |
| Value  | Map of Restaurant in DataSet | Restaurant Analysis Result |

### Most Important APIs

##### Framework APIs

* `void readData(DataPlugin dataPlugin, String dataName, String source)`
	Method that would invoke the specified data plugin to read data fom source

* `List<RestaurantAnalysis> analyses(List<Restaurant> restaurantList)`
	Method that would call <a href="https://stanfordnlp.github.io/CoreNLP/">Standford coreNLP library</a> to analyse the input raw restaurant data and wrap the result into a list of `RestaurantAnalysis`

##### Data Plugin APIs


##### Display Plugin APIs





### How-Tos

#### Implement Plugins

##### Data Plugin

##### Display Plugin

#### Run with New Plugins

---

#### Team members

Hsiao-han Chen

Yumeng Wang

Yingqiao Zheng

