package hello.core.order;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/19
 */
public interface OrderService {

    Order createdOrder(Long memberId, String itemName, int itemPrice);

}
