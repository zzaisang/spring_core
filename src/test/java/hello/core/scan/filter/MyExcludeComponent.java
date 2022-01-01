package hello.core.scan.filter;

import java.lang.annotation.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/25
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {

}
