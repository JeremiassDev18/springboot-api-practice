package ApiExternal.Java.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class PokeResponse {
    private String name;

    @JsonProperty("base_experience")
    private int baseEperience;

    private int height;
    private int weight;

    private List<AbilitieSlot>  abilities;

    @Getter @Setter
    public static class AbilitieSlot{
        private Ability ability;

        @JsonProperty("is_hidden")
        private boolean isHidden;
    }

    @Getter
    @Setter
    public static class Ability{
        private String name;
    }


}
