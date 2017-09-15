# GameControllerApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGameUsingPOST**](GameControllerApi.md#createGameUsingPOST) | **POST** /schedule/ | createGame
[**findAllUsingGET1**](GameControllerApi.md#findAllUsingGET1) | **GET** /schedule/ | findAll
[**findOneUsingGET**](GameControllerApi.md#findOneUsingGET) | **GET** /schedule/{id} | findOne


<a name="createGameUsingPOST"></a>
# **createGameUsingPOST**
> Game createGameUsingPOST(game)

createGame

### Example
```java
// Import classes:
//import com.dogway.bwscout.client.handler.ApiException;
//import com.dogway.bwscout.client.api.GameControllerApi;


GameControllerApi apiInstance = new GameControllerApi();
Game game = new Game(); // Game | game
try {
    Game result = apiInstance.createGameUsingPOST(game);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GameControllerApi#createGameUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | [**Game**](Game.md)| game |

### Return type

[**Game**](Game.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAllUsingGET1"></a>
# **findAllUsingGET1**
> IterableGame findAllUsingGET1()

findAll

### Example
```java
// Import classes:
//import com.dogway.bwscout.client.handler.ApiException;
//import com.dogway.bwscout.client.api.GameControllerApi;


GameControllerApi apiInstance = new GameControllerApi();
try {
    IterableGame result = apiInstance.findAllUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GameControllerApi#findAllUsingGET1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IterableGame**](IterableGame.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findOneUsingGET"></a>
# **findOneUsingGET**
> Game findOneUsingGET(id)

findOne

### Example
```java
// Import classes:
//import com.dogway.bwscout.client.handler.ApiException;
//import com.dogway.bwscout.client.api.GameControllerApi;


GameControllerApi apiInstance = new GameControllerApi();
Long id = 789L; // Long | id
try {
    Game result = apiInstance.findOneUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GameControllerApi#findOneUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Game**](Game.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

