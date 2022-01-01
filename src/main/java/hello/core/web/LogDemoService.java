package hello.core.web;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/30
 */
@Service
@RequiredArgsConstructor
public class LogDemoService {

    private final MyLogger myLogger;

    public void logic(final String id) {
        myLogger.log("service id = " + id);
    }

}
