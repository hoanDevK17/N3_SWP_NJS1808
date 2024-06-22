package online.jeweljoust.BE;

import jakarta.validation.constraints.NotNull;
import online.jeweljoust.BE.model.AccountReponse;
import online.jeweljoust.BE.model.LoginRequest;
import online.jeweljoust.BE.respository.AuthenticationRepository;
import online.jeweljoust.BE.service.AuthenticationService;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@SpringBootTest(classes = BeApplication.class)
@RunWith(SpringRunner.class)
public class TestDemo {
    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private AuthenticationRepository authenticationRepository;
    @Test
    @ParameterizedTest
    @CsvFileSource(resources = "/login.csv",numLinesToSkip = 1)
    public void checkRoleAccountLogin(String username,String password,String role) {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setPassword(username);
        loginRequest.setUsername(password);

        try {
            AccountReponse accountTest = authenticationService.login(loginRequest);

            assertEquals(role.trim(), accountTest.getRole().toString().trim());
        } catch (BadCredentialsException e) {
            assertTrue("Incorrect username or password",false);
        }
    }
}
