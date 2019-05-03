# kotlin-jwt-spring-security
Kotlin example using JWT and spring boot web endpoint security 


This is a kotlin version of the following java JWT spring project. https://github.com/keysh/jwt-security
Props to Jakub Leško for making a good example and blog post. https://github.com/keysh The blog post is here. https://jakublesko.com/spring-security-with-jwt/

This is the most simplest, easiest to setup of JWT I have found online so far. 

## Running
The default port is 8089.

Run it with:
```gradle bootrun```

Using postman 

```POST at "http://localhost:8089/api/authenticate?username=user&password=password"```

You'll get the JWT key in the header.


```Then do a GET at http://localhost:8089/api/private```

But you must set a "Bearer Token" in the Authorization in Postman.

Put that JWT key that you got from the POST request as the "Bearer Token". But remove the "Bearer " text at the beginning of the JWT key.

