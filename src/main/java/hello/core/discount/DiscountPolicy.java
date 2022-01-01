package hello.core.discount;

import hello.core.member.Member;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/19
 */
public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     * */
    int discount(Member member, int price);


}
