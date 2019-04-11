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
`List<String> reviews`: List of reviews 

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
	Method that would invoke the specified data plugin to read data from source.

* `List<RestaurantAnalysis> analyses(List<Restaurant> restaurantList)`
	Method that would call <a href="https://stanfordnlp.github.io/CoreNLP/">Standford coreNLP library</a> to analyse the input raw restaurant data and wrap the result into a list of `RestaurantAnalysis`.
* `List<RestaurantAnalysis> getRestListByName(String dataName, List<String> restNameList)`
	Method that would return a partial list of `RestaurantAnalysis` in the dataset, which allow the framework to pass only the data user selected to be visualized.


##### Data Plugin APIs
* `String getPluginName()`
	Method that allow data plugins to customized their own name to be displayed on GUI window pop up list.

* `String getDisplaySourceLabelName()`
	Method that allow data plugins to customized their specification of the data source type they want to be displayed on GUI window.

* `List<Restaurant> read(String source)`
	Core API of data plugins. Takes in source from user, read and wrap the data as a list of `Restaurant` which would lately be stored in framework.


##### Display Plugin APIs
* `String getPluginName()`
	Method that allow display plugins to customized their own name to be displayed on GUI window pop up list.

* `JPanel display(List<RestaurantAnalysis> restaurantAnalysisList)`
	Core API of display plugins. Take a list of `RestaurantAnalysis` as input, process and plot, finally return a `JPanel` to the framework which would later be displayed on GUI window.
<\br>

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

