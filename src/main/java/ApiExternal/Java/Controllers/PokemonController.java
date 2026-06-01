package ApiExternal.Java.Controllers;

import ApiExternal.Java.models.PokeResponse;
import ApiExternal.Java.services.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/poke")
@RequiredArgsConstructor

public class PokemonController {

    private final PokemonService pokemonService;

    @GetMapping("/{name}")
    public PokeResponse getPokemon(@PathVariable String name){
        return pokemonService.getPokeResponse(name);
    }


}
