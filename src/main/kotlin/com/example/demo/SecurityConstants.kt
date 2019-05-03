


object SecurityConstants {
    val AUTH_LOGIN_URL = "/api/authenticate"

    // Signing key for HS512 algorithm
    // You can use the page http://www.allkeysgenerator.com/ to generate all kinds of keys
    val JWT_SECRET = "n2r5u8x/A%D*G-KaPdSgVkYp3s6v9y\$B&E(H+MbQeThWmZq4t7w!z%C*F-J@NcRf"

    // JWT token defaults
    val TOKEN_HEADER = "Authorization"
    val TOKEN_PREFIX = "Bearer "
    val TOKEN_TYPE = "JWT"
    val TOKEN_ISSUER = "secure-api"
    val TOKEN_AUDIENCE = "secure-app"
}
