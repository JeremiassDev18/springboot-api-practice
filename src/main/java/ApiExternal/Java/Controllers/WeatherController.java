package ApiExternal.Java.Controllers;

import ApiExternal.Java.models.WeatherResponse;
import ApiExternal.Java.services.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    // Ejemplo de uso: GET /api/weather/Guayaquil
    @GetMapping("/{city}")
    public WeatherResponse getWeather(@PathVariable String city) {
        return weatherService.getWeather(city);
    }
}