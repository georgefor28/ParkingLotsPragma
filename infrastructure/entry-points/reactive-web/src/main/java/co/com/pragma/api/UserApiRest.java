package co.com.pragma.api;

import co.com.pragma.model.user.User;
import co.com.pragma.usecase.cruduser.CrudUserUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class UserApiRest {
    private CrudUserUseCase crudUserUseCase;

    @GetMapping(path = "/id={id}")
    public User getUser(@PathVariable int id){
        return crudUserUseCase.getUser(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return crudUserUseCase.createUser(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return crudUserUseCase.updateUser(user);
    }
}
