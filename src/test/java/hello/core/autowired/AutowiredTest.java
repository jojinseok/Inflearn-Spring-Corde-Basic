package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {
    @Test
    void AutowiredOption(){
        ApplicationContext ac =new AnnotationConfigApplicationContext(TestBean.class);
    }
    static class TestBean{
    @Autowired(required = false)
        public void setNobena1(Member member){
        System.out.printf("nobean1 = "+member);
    }
        @Autowired
        public void setNobena2(@Nullable Member member2){
            System.out.printf("nobean1 = "+member2);
        }
        @Autowired
        public void setNobena1(Optional<Member> member3){
            System.out.printf("nobean1 = "+member3);
        }

    }
}
