package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //설정 정보
public class AppConfig {
    @Bean //스프링 컨테이너에 등록
    //다른 구현체로 변경 용이
    public MemberService memberService(){ //역할, 인터페이스
        return new MemberServiceImpl(memberRepository()); //구현 클래스
    }
    @Bean
    //다른 구현체로 변경 용이
    public static MemberRepository memberRepository() {//역할, 인터페이스
        return new MemoryMemberRepository();//구현 클래스
    }
    @Bean
    //다른 구현체로 변경 용이
    public OrderService orderService(){//역할, 인터페이스
        return new OrderServiceImpl(memberRepository(), discountPolicy());//구현 클래스
    }
    @Bean
    //다른 구현체로 변경 용이
    public DiscountPolicy discountPolicy(){//역할, 인터페이스
        return new RateDiscountPolicy(); //구현 클래스

    }
}
