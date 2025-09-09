package ispit.ispit.controllers;

import ispit.ispit.models.UserModel;
import ispit.ispit.models.UserPageModel;
import ispit.ispit.services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;



import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UserController {

    private final IUserService userService;

    @GetMapping("get-list")
    public List<UserModel> getList() {
        return userService.findAll();
    }

    @GetMapping("get-page-list")
    public UserPageModel getPageList(Integer pageNumber, Integer pageSize) {
        return userService.findPagedList(PageRequest.of(pageNumber, pageSize));
    }

    @PostMapping("create")
    public ResponseEntity<?> create(@RequestBody @Valid UserModel userModel, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>("Neuspesno registrovan!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
