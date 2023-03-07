package hello.core.scan;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // TYPE 뜻 - 클래스 레벨에 붙은것
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent { // 얘가 붙은것은 컴포넌트 스캔에 추가한다는 뜻
}
