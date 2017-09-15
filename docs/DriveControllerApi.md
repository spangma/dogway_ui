# DriveControllerApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDriveUsingPOST**](DriveControllerApi.md#createDriveUsingPOST) | **POST** /drives/ | createDrive


<a name="createDriveUsingPOST"></a>
# **createDriveUsingPOST**
> Drive createDriveUsingPOST(drive)

createDrive

### Example
```java
// Import classes:
//import com.dogway.bwscout.client.handler.ApiException;
//import com.dogway.bwscout.client.api.DriveControllerApi;


DriveControllerApi apiInstance = new DriveControllerApi();
Drive drive = new Drive(); // Drive | drive
try {
    Drive result = apiInstance.createDriveUsingPOST(drive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriveControllerApi#createDriveUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drive** | [**Drive**](Drive.md)| drive |

### Return type

[**Drive**](Drive.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

