package com.spotter.rpc.demo.provider.dubbo.provider;

import com.spotter.rpc.demo.provider.dubbo.api.TestEchoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class SampleTestEchoService implements TestEchoService {
    @Override
    public String say(String message) {
        return message;
    }
}
