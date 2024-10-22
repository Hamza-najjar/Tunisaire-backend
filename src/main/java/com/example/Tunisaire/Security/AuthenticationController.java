package com.example.Tunisaire.Security;

import com.example.Tunisaire.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;


    @PostMapping("/save")
    public ResponseEntity<AuthenticationResponse> Save(
            @RequestBody RegisterRequest request
    ) {
       return ResponseEntity.ok(authenticationService.Save(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> Authenticate(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(authenticationService.Authenticate(request));
    }

}
