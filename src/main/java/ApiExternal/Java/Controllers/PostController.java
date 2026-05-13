package ApiExternal.Java.Controllers;


import ApiExternal.Java.models.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ApiExternal.Java.services.PostServices;

import java.util.List;


@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostServices postService;


    @GetMapping
    public List<Post> getPost(){
        return postService.getPost();
    }
}
