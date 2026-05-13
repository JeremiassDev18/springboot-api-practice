package ApiExternal.Java.services;

import ApiExternal.Java.models.WeatherResponse;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor

public class WeatherService {
    private final WebClient webClient;

    @org.springframework.beans.factory.annotation.Value("${weather.api.key}")
    private String apiKey;

    public WeatherResponse getWeather(String city) {
        return webClient.get()
                // URI relativa: se suma a la baseUrl del config
                // {city} y {apiKey} son variables que Spring reemplaza
                .uri("/weather?q={city}&appid={apiKey}&units=metric&lang=es",
                        city, apiKey)
                .retrieve()            // "ejecuta la petición y dame la respuesta"
                .bodyToMono(WeatherResponse.class)  // deserializa JSON → WeatherResponse
                .block();              // bloquea hasta obtener resultado (modo síncrono)
        // Si quisieras modo reactivo, devuelves Mono<WeatherResponse> y no llamas .block()
    }

}
