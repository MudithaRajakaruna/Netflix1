package lk.ijse.app;

import com.netflix.ribbon.api.RibbonService;
import com.netflix.spring_security.api.Decoder;
import com.netflix.spring_security.api.SecurityFilterChain;
import com.netflix.zuul.Service.RandomService;

public class AppInitializer {
    public static void main(String[] args) {
        new RibbonService();
        //new Interceptor();
        new Decoder();
        new RandomService();
        new SecurityFilterChain();
    }

}
