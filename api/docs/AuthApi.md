# AuthApi

All URIs are relative to *https://nexd-backend-staging.herokuapp.com:443/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authControllerLogin**](AuthApi.md#authControllerLogin) | **POST** auth/login | Login by email and password 
[**authControllerRefreshToken**](AuthApi.md#authControllerRefreshToken) | **POST** auth/refresh | Not yet implemented, token refresh
[**authControllerRegister**](AuthApi.md#authControllerRegister) | **POST** auth/register | Register with email and password 



## authControllerLogin

> TokenDto authControllerLogin(loginDto)

Login by email and password 

### Example

```java
// Import classes:
import app.nexd.android.ApiClient;
import app.nexd.android.ApiException;
import app.nexd.android.Configuration;
import app.nexd.android.models.*;
import app.nexd.android.api.AuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nexd-backend-staging.herokuapp.com:443/api/v1");

        AuthApi apiInstance = new AuthApi(defaultClient);
        LoginDto loginDto = new LoginDto(); // LoginDto | 
        try {
            TokenDto result = apiInstance.authControllerLogin(loginDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#authControllerLogin");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginDto** | [**LoginDto**](LoginDto.md)|  |

### Return type

[**TokenDto**](TokenDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Login |  -  |
| **201** |  |  -  |
| **400** | Bad Request |  -  |
| **409** | Conflict |  -  |


## authControllerRefreshToken

> TokenDto authControllerRefreshToken(tokenDto)

Not yet implemented, token refresh

### Example

```java
// Import classes:
import app.nexd.android.ApiClient;
import app.nexd.android.ApiException;
import app.nexd.android.Configuration;
import app.nexd.android.models.*;
import app.nexd.android.api.AuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nexd-backend-staging.herokuapp.com:443/api/v1");

        AuthApi apiInstance = new AuthApi(defaultClient);
        TokenDto tokenDto = new TokenDto(); // TokenDto | 
        try {
            TokenDto result = apiInstance.authControllerRefreshToken(tokenDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#authControllerRefreshToken");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenDto** | [**TokenDto**](TokenDto.md)|  |

### Return type

[**TokenDto**](TokenDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful token refresh |  -  |
| **400** | Bad Request |  -  |
| **409** | Conflict |  -  |


## authControllerRegister

> TokenDto authControllerRegister(registerDto)

Register with email and password 

### Example

```java
// Import classes:
import app.nexd.android.ApiClient;
import app.nexd.android.ApiException;
import app.nexd.android.Configuration;
import app.nexd.android.models.*;
import app.nexd.android.api.AuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nexd-backend-staging.herokuapp.com:443/api/v1");

        AuthApi apiInstance = new AuthApi(defaultClient);
        RegisterDto registerDto = new RegisterDto(); // RegisterDto | 
        try {
            TokenDto result = apiInstance.authControllerRegister(registerDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#authControllerRegister");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registerDto** | [**RegisterDto**](RegisterDto.md)|  |

### Return type

[**TokenDto**](TokenDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Registration |  -  |
| **400** | Bad Request |  -  |
| **409** | Conflict |  -  |

