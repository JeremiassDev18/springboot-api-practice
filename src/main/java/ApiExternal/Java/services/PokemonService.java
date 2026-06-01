package ApiExternal.Java.services;

import ApiExternal.Java.models.PokeResponse;
import ApiExternal.Java.models.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PokemonService {

    private static final String API_URL = "https://pokeapi.co/api/v2/pokemon/";
    private final RestTemplate restTemplate;

    public PokeResponse getPokeResponse(String name){
        return restTemplate.getForObject(
                API_URL + name,
                PokeResponse.class);
    }
}
