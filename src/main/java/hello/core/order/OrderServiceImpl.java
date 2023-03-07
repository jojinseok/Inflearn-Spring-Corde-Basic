package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor //생성자가 하나기 때문에 @Autowired 자동 적용
public class OrderServiceImpl implements OrderService {
    //private final MemberRepository memberRepository = new MemoryMemberRepository();
    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy(); //이건 고정할인
    //private final DiscountPolicy discountPolicy = new RateDiscountPolicy(); //10% 할인, 인터페이스를 활용한 다형성, 상세 코드 수정 x
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;
   
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId,itemName,itemPrice,discountPrice);
    }
}
