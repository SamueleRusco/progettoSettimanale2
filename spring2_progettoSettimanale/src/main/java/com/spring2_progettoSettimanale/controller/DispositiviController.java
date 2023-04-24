package com.spring2_progettoSettimanale.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dispositivi")
public class DispositiviController {
	
	
	/*
	@Autowired UserService userService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<List<User>>(userService.findAllUser(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable Long id){
        return new ResponseEntity<User>(userService.findUserByID(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return new ResponseEntity<User>(userService.insertUser(user), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
        return new ResponseEntity<String>(userService.removeUserById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@RequestBody User user) {
        return new ResponseEntity<User>(userService.updateUser(user), HttpStatus.CREATED);
    }
*/
}
