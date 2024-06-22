package online.jeweljoust.BE.respository;


import online.jeweljoust.BE.entity.Account;
import online.jeweljoust.BE.enums.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthenticationRepository extends JpaRepository<Account, Long>
{
    Account findByUsername(String username);
    Account findByEmail(String email);
    Account findById(long userid);
    List<Account> findByRole(AccountRole Role);
    List<Account> findByFullnameContaining(String name);
}
