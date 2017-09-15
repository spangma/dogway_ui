# ExpectedPointControllerApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExpectedPointUsingPOST**](ExpectedPointControllerApi.md#createExpectedPointUsingPOST) | **POST** /expectedpoints/ | createExpectedPoint
[**findAllUsingGET**](ExpectedPointControllerApi.md#findAllUsingGET) | **GET** /expectedpoints/ | findAll


<a name="createExpectedPointUsingPOST"></a>
# **createExpectedPointUsingPOST**
> ExpectedPoint createExpectedPointUsingPOST(ep)

createExpectedPoint

### Example
```java
// Import classes:
//import com.dogway.bwscout.client.handler.ApiException;
//import com.dogway.bwscout.client.api.ExpectedPointControllerApi;


ExpectedPointControllerApi apiInstance = new ExpectedPointControllerApi();
ExpectedPoint ep = new ExpectedPoint(); // ExpectedPoint | ep
try {
    ExpectedPoint result = apiInstance.createExpectedPointUsingPOST(ep);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpectedPointControllerApi#createExpectedPointUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ep** | [**ExpectedPoint**](ExpectedPoint.md)| ep |

### Return type

[**ExpectedPoint**](ExpectedPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> IterableExpectedPoint findAllUsingGET()

findAll

### Example
```java
// Import classes:
//import com.dogway.bwscout.client.handler.ApiException;
//import com.dogway.bwscout.client.api.ExpectedPointControllerApi;


ExpectedPointControllerApi apiInstance = new ExpectedPointControllerApi();
try {
    IterableExpectedPoint result = apiInstance.findAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpectedPointControllerApi#findAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IterableExpectedPoint**](IterableExpectedPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

