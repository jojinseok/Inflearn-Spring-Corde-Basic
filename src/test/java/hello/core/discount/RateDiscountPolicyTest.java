package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RateDiscountPolicyTest {
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();
    @Test
    @DisplayName("VIP 는 10% 할인이 적용되야 한다") //Test 이름 설정
    void vip_o(){
        Member member = new Member(1L,"memberVIP", Grade.VIP);
        int discount= discountPolicy.discount(member,10000);
        Assertions.assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니라면 할인이 적용되지 않아야 함") //Test 이름 설정
    void vip_x(){
        Member member = new Member(1L,"member", Grade.BASIC);
        int discount= discountPolicy.discount(member,10000);
        Assertions.assertThat(discount).isEqualTo(0);
    }
}