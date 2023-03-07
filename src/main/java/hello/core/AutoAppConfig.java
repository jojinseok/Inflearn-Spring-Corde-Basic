package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( //@Configuration 어노테이션 붙은 것은 빼고 스캔한다는 뜻 (이유 : 지금 만들어 놓은 코드가 다 깨지기 때문에 임의로 해놓은거임)
        //basePackages = "hello.core.member"; //해당 패키지 및 클래스만 지정해서 컴포넌트 스캔을 할 수 잇음
        //basePackageClasses = AutoAppConfig.class; //해당 클래스의 pacakge의 패키지를 다 스캔함, 이것이 default 값임, 그래서 최상단 패키지에 config 클래스를 만드는 것ㅅ임
        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {


}
