package tatar.companiese.kamil.java2025.abstract_classes;

import java.time.LocalDateTime;

public class AbstractClassesMain {
    public static void main(String[] args) {
        UserEntity userEntity1 = new UserEntity();
        AccountEntity accountEntity1 = new AccountEntity();
        AbstractEntity userEntity2 = new UserEntity();
        AbstractEntity accountEntity2 = new AccountEntity();
        AbstractClassesMain acm = new AbstractClassesMain();
        acm.disactivate(userEntity2);
        acm.disactivate(accountEntity1);
    }
    private void disactivate(AbstractEntity entity){
        entity.disactivate();
    }
}
class UserEntity extends AbstractEntity {
    String name;
}
class AccountEntity extends AbstractEntity{
    String number;
}
abstract class AbstractEntity {
    long id;
    LocalDateTime createdDate;
    public void disactivate(){
        System.out.println("This user is disactivated");
    }
}