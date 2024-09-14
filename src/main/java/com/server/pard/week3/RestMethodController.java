package com.server.pard.week3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class RestMethodController {

    @GetMapping("")
    public String getUsers() {
        return "Get Method controller";
    }

    @PostMapping("")
    public String postUsers() {
        return "Add User to DB";
    }

    @GetMapping("/{userId}")
    public String getUserById(@PathVariable Long userId) {
        return "user ID: " + userId;
    }

    @PatchMapping("/{userId}")
    public String patchUser(@PathVariable Long userId) {
        return userId + "번 유저의 정보 수정";
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable Long userId) {
        return userId + " 번 유저 정보 삭제";
    }

}
