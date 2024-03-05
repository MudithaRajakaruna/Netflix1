package com.netflix.spring_security.api;
import com.netflix.spring_security.config.*;
import com.netflix.spring_security.util.*;
public class SecurityFilterChain {
    Intercepter intercepter;
    PostAuth postAuth;
    WebSecurityConfig webSecurityConfig;
    MethodSecurityConfig methodSecurityConfig;
}
