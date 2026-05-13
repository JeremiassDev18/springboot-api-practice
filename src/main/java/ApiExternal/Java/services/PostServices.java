package ApiExternal.Java.services;

import ApiExternal.Java.config.RestTemplateConfig;
import ApiExternal.Java.models.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor

public class PostServices {
    private static final String API_URL = "https://jsonplaceholder.typicode.com/posts";

    private final RestTemplate restTemplate;

    public List<Post> getPost(){
        Post[] posts = restTemplate.getForObject(API_URL, Post[].class);
        return Arrays.asList(posts);
    }
}
