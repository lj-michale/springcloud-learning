/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springcloud.turing.biz.aggregationservice;

import cn.crane4j.spring.boot.annotation.EnableCrane4j;
import cn.hippo4j.core.enable.EnableDynamicThreadPool;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.retry.annotation.EnableRetry;

/**
 * 12306 聚合服务应用启动器
 *
 *
 */
@EnableDynamicThreadPool
@SpringBootApplication(scanBasePackages = {
        "org.springcloud.turing.biz.userservice",
        "org.springcloud.turing.biz.ticketservice",
        "org.springcloud.turing.biz.orderservice",
        "org.springcloud.turing.biz.payservice"
})
@EnableRetry
@MapperScan(value = {
        "org.springcloud.turing.biz.userservice.dao.mapper",
        "org.springcloud.turing.biz.ticketservice.dao.mapper",
        "org.springcloud.turing.biz.orderservice.dao.mapper",
        "org.springcloud.turing.biz.payservice.dao.mapper"
})
@EnableFeignClients(value = {
        "org.springcloud.turing.biz.ticketservice.remote",
        "org.springcloud.turing.biz.orderservice.remote"
})
@EnableCrane4j(enumPackages = "org.springcloud.turing.biz.orderservice.common.enums")
public class AggregationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AggregationServiceApplication.class, args);
    }
}
