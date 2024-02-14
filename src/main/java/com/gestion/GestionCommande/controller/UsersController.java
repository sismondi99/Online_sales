package com.gestion.GestionCommande.controller;

import com.gestion.GestionCommande.models.Users;
import com.gestion.GestionCommande.service.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("users")
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void create(@RequestBody Users users) {
        this.usersService.create(users);
    }
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Users> findAllUsers() {
        return this.usersService.findAllUsers();
    }
    @GetMapping(path = "{id}", produces = APPLICATION_JSON_VALUE)
    public Users read(@PathVariable int id) {
        return this.usersService.read(id);
    }
}
