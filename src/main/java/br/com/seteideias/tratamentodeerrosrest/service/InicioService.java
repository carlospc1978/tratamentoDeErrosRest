package br.com.seteideias.tratamentodeerrosrest.service;

import com.configcat.ConfigCatClient;
import org.springframework.stereotype.Service;

@Service
public class InicioService {

    ConfigCatClient client = ConfigCatClient.newBuilder()
            .build("uPjZCMzW-EqIxgvUXjZfzQ/HmW8usSqnEum1mIPO55Yxg");
    boolean fazIssoOuAquilo = client.getValue(Boolean.class, "isMyFirstFeatureEnabled", false);

    public String fazAlgumaCoisa(){
        return  "falso ou verdadeiro ? : " + fazIssoOuAquilo;
    }

}
