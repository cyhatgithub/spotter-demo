/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.spotter.rpc.demo.consumer.demos.dubboconsumer;

import com.spotter.rpc.demo.provider.dubbo.api.TestEchoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboConsumerSampleController {

    @DubboReference(check = false)
    private TestEchoService testEchoService;

    // http://127.0.0.1:8080/echo?message=somemessage
    @GetMapping("/echo")
    public String echo(@RequestParam(name = "message", defaultValue = "no message") String message) {

        return testEchoService.say(message);
    }

}
