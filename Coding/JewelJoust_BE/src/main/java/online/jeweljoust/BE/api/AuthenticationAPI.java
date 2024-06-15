package online.jeweljoust.BE.api;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import online.jeweljoust.BE.entity.Account;
import online.jeweljoust.BE.entity.Wallet;
import online.jeweljoust.BE.enums.AccountStatus;
import online.jeweljoust.BE.model.*;
import online.jeweljoust.BE.service.AuthenticationService;
import online.jeweljoust.BE.service.EmailService;
import online.jeweljoust.BE.service.WalletService;
import online.jeweljoust.BE.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@SecurityRequirement(name = "api")

public class AuthenticationAPI {
    // Nhan request tu FE
    @Autowired
    AuthenticationService authenticationService;

    @Autowired
    WalletService walletService;

    @Autowired
    EmailService emailService;

    @Autowired
    AccountUtils accountUtils;

//    @GetMapping("/test-param/{name}")
//    public ResponseEntity testParam(@PathVariable("name") String name) {
//        System.out.println(name);
//        return ResponseEntity.ok(name);
//    }
    // @GetMapping("/product/{id}")
    // public ResponseEntity test(@PathVariable String id){
    // return ResponseEntity.ok("Hello world");
    // http://localhost:8080/api/product/123312312
    // }
    // @GetMapping("/product")
    // public ResponseEntity test(@RequestParam("ID") String id ){
    // return ResponseEntity.ok("Hello world");
    // }
    // http://localhost:8080/api/product?id=1233123
    // @PostMapping("/product")
    // public ResponseEntity test321(){
    // return ResponseEntity.ok("Hello world");
    // }
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody RegisterRequest registerRequest) {
        Account account = authenticationService.register(registerRequest);
        if(account!=null){
            System.out.println(account);
             Wallet wallet = walletService.registerWallet(account);
             account.setWallet(wallet);
        }
        return ResponseEntity.ok(account);
    }

    @PostMapping("/account/register")
//    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity registerHaveRole(@RequestBody RegisterRequest registerRequest) {
        Account account = authenticationService.registerHaveRole(registerRequest);
        return ResponseEntity.ok(account);
    }

    @GetMapping("/account")
//    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<List<Account>> getAccounts() {
        List<Account> accounts = authenticationService.getAllAccount();
        return ResponseEntity.ok(accounts);
    }

    @GetMapping("/testcurrent")
    public Account current() {
        return accountUtils.getAccountCurrent();
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginRequest loginRequest) {
        Account account = authenticationService.login(loginRequest);

        if (account.getStatus().equals(AccountStatus.ACTIVE)){
            return ResponseEntity.ok(account);
        } else {
            throw new AuthenticationServiceException("Your account locked!!!");
        }
    }

    @PostMapping("/login-google")
    public ResponseEntity<AccountReponse> loginGoogle(@RequestBody LoginGoogleRequest loginGoogleRequest) {
        AccountReponse accountReponse = authenticationService.loginGoogle(loginGoogleRequest);


        return ResponseEntity.ok(accountReponse);
    }

    @PostMapping("/forgot-password")
    public void forgotPassword(@RequestBody ForgotPasswordRequest forgotPasswordRequest) {
        authenticationService.forgotPassword(forgotPasswordRequest);
    }

    @PostMapping("/reset-password")
    public void resetPassword(@RequestBody ResetPasswordRequest resetPasswordRequest) {
        authenticationService.resetPassword(resetPasswordRequest);
    }

    @PutMapping("/account")
    public ResponseEntity<Account> updateProfile(@RequestBody UpdateProfileRequest updateProfileRequest){
        String role = accountUtils.getAccountCurrent().getRole().name();
            long id = accountUtils.getAccountCurrent().getId();
        Account account = new Account();
        if (role.equalsIgnoreCase("MEMBER")){
            updateProfileRequest.setId(id);
        }
        account = authenticationService.updateProfile(updateProfileRequest);
        return ResponseEntity.ok(account);
    }

    @PutMapping("/account/{userid}/block")
//    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<String> blockAccount(@PathVariable("userid") long userid, AccountStatus status){
        authenticationService.blockAccount(userid, status);
        return ResponseEntity.ok("Account has been changed");
    }

    @GetMapping("/account/{name}")
//    @PreAuthorize("hasAuthority('ADMIN')")
     public ResponseEntity<List<Account>> getAccountByName(@PathVariable("name") String name){
         List<Account> accounts = authenticationService.getAccountByName(name);
         return ResponseEntity.ok(accounts);
     }

     @DeleteMapping("/account/{id}")
//     @PreAuthorize("hasAuthority('ADMIN')")
     public ResponseEntity<String> deleteAccountById(@PathVariable("id") long id){
        authenticationService.deleteAccountById(id);
        return ResponseEntity.ok("Deleted successfully!!!");
     }

    @GetMapping("/send-mail")
    public void sendMail() {
        EmailDetail emailDetail = new EmailDetail();
        emailDetail.setRecipient("phatttse170312@fpt.edu.vn");
        emailDetail.setSubject("test123");
        emailDetail.setMsgBody("abc");
        emailService.sendMailTemplate(emailDetail);
    }
}
