NYT sample App
=====================================

Introduction
-------------------------------------
This is a sample App.

Requirements with comments in line :
● The app is written strictly in Kotlin programming language.
● Added unit tests.
● App showing NYT Most popular API for different values for period
    ○ click on Article Item we show details
   ○ Click on floating button we showing app open html data on browser.
   
   ● The app implement a local database to support offline mode.
● The app supports pull to refresh.

## Implemented things
`MVVM(ViewModel, LiveData)` where separated app and data.where data module have all network and data base communication.
Dependency Injection is implemented using `hilt`
Caching is implemented using `Room Database`
Data can be refreshed using Pull to refresh
Data binding using `Data Binding`
Network communication `Retrofit`
Kotlin coroutine

## Unit Testing

 Unit testing is achieved  `Mockito` and `MockWebServer`

### Libraries
* [Android Support Library][support-lib]
* [Android Architecture Components][arch]
* [Android Data Binding][data-binding]
* [Binding Collection Adapter][collection-adapter] Easy way to bind collections to listviews and recyclerviews with the new Android Data Binding framework.
* [Hilt][Hilt] for dependency injection
* [Retrofit][retrofit] for REST api communication
* [Glide][glide] for image loading
* [Mockito][mockito] for evaluating app's logic using local unit tests
* [MockWebServer][mockwebserver] for testing HTTP clients




