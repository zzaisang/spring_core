package hello.core.singleton;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/20
 */
class StatefulService {

    public int order(String name, int price){
        System.out.println("name = " + name + " price = " + price);
        return price;
    }

}
