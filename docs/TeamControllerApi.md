# TeamControllerApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTeamUsingPOST**](TeamControllerApi.md#createTeamUsingPOST) | **POST** /teams/ | createTeam
[**deleteUsingDELETE**](TeamControllerApi.md#deleteUsingDELETE) | **DELETE** /teams/{id} | delete
[**findAllUsingGET2**](TeamControllerApi.md#findAllUsingGET2) | **GET** /teams/ | findAll
[**findOneUsingGET1**](TeamControllerApi.md#findOneUsingGET1) | **GET** /teams/{id} | findOne
[**updateByIdUsingPUT**](TeamControllerApi.md#updateByIdUsingPUT) | **PUT** /teams/{id} | updateById


<a name="createTeamUsingPOST"></a>
# **createTeamUsingPOST**
> Team createTeamUsingPOST(team)

createTeam

### Example
```java
// Import classes:
//import com.dogway.bwscout.client.handler.ApiException;
//import com.dogway.bwscout.client.api.TeamControllerApi;


TeamControllerApi apiInstance = new TeamControllerApi();
Team team = new Team(); // Team | team
try {
    Team result = apiInstance.createTeamUsingPOST(team);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamControllerApi#createTeamUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **team** | [**Team**](Team.md)| team |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUsingDELETE"></a>
# **deleteUsingDELETE**
> Team deleteUsingDELETE(id)

delete

### Example
```java
// Import classes:
//import com.dogway.bwscout.client.handler.ApiException;
//import com.dogway.bwscout.client.api.TeamControllerApi;


TeamControllerApi apiInstance = new TeamControllerApi();
Long id = 789L; // Long | id
try {
    Team result = apiInstance.deleteUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamControllerApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findAllUsingGET2"></a>
# **findAllUsingGET2**
> IterableTeam findAllUsingGET2()

findAll

### Example
```java
// Import classes:
//import com.dogway.bwscout.client.handler.ApiException;
//import com.dogway.bwscout.client.api.TeamControllerApi;


TeamControllerApi apiInstance = new TeamControllerApi();
try {
    IterableTeam result = apiInstance.findAllUsingGET2();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamControllerApi#findAllUsingGET2");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IterableTeam**](IterableTeam.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findOneUsingGET1"></a>
# **findOneUsingGET1**
> Team findOneUsingGET1(id)

findOne

### Example
```java
// Import classes:
//import com.dogway.bwscout.client.handler.ApiException;
//import com.dogway.bwscout.client.api.TeamControllerApi;


TeamControllerApi apiInstance = new TeamControllerApi();
Long id = 789L; // Long | id
try {
    Team result = apiInstance.findOneUsingGET1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamControllerApi#findOneUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateByIdUsingPUT"></a>
# **updateByIdUsingPUT**
> Team updateByIdUsingPUT(id, team)

updateById

### Example
```java
// Import classes:
//import com.dogway.bwscout.client.handler.ApiException;
//import com.dogway.bwscout.client.api.TeamControllerApi;


TeamControllerApi apiInstance = new TeamControllerApi();
Long id = 789L; // Long | id
Team team = new Team(); // Team | team
try {
    Team result = apiInstance.updateByIdUsingPUT(id, team);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamControllerApi#updateByIdUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **team** | [**Team**](Team.md)| team |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

