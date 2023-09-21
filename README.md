
## 什么是 12306？

[🧐 为什么 12306 铁路购票项目更适合校招？](https://magestack.cn/pages/a2f161/)

12306 铁路购票服务是与大家生活和出行相关的关键系统，包括会员、购票、订单、支付和网关等服务。

这个项目旨在让学习者可以快速掌握分布式系统设计的技巧，尤其适合对高并发、分布式感兴趣的同学学习。如果想深入理解和应用分布式系统的设计原则，这个项目将会是一个很好的学习资源。

项目中包含了缓存、消息队列、分库分表、设计模式等代码，通过这些代码可以全面了解分布式系统的核心知识点。

为了方便大家学习，该系统提供了两种版本：

- **SpringBoot 聚合服务版本**：适合测试和部署，可以直接启动 `aggregation-service` 聚合服务和网关服务。

- **SpringCloud 微服务版本**：适合学习微服务设计，可以分别启动支付、订单、用户、购票和网关服务。

根据自己的学习和使用需求，选择合适的版本启动即可。微服务版本侧重学习设计，聚合服务版本侧重测试和部署。请根据场景需要，选择正确的版本进行学习和使用。

![](https://images-machen.oss-cn-beijing.aliyuncs.com/12306-base-biz-20230801.png)

## 拿个offer 组织项目

组织简介：拿个offer - 开源&项目实战，🚀 助力你在校招或社招上拿个offer。

目前组织下已有业务、基础架构以及中间件等多种类型项目，代码完全开源！项目列表如下：

| Project                                            | Gitee                                                        | GitHub                                                       | Intro                                            |
| -------------------------------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------ |
| [Hippo4j](https://github.com/opengoofy/hippo4j)    | [![star](https://gitee.com/opengoofy/hippo4j/badge/star.svg?theme=white)](https://gitee.com/opengoofy/hippo4j/stargazers) | [![](https://img.shields.io/github/stars/opengoofy/hippo4j?color=green&style=social)](https://github.com/opengoofy/hippo4j) | 异步线程池框架，支持线程池动态变更&监控&报警     |
| [12306](https://gitee.com/nageoffer/12306)         | [![star](https://gitee.com/nageoffer/12306/badge/star.svg?theme=white)](https://gitee.com/nageoffer/12306/stargazers) | [![](https://img.shields.io/github/stars/nageoffer/12306?color=green&style=social)](https://github.com/nageoffer/12306) | 完成高仿铁路 12306系统，帮助学生主打就业的项目   |
| [CongoMall](https://gitee.com/nageoffer/congomall) | [![star](https://gitee.com/nageoffer/congomall/badge/star.svg?theme=white)](https://gitee.com/nageoffer/congomall/stargazers) | [![](https://img.shields.io/github/stars/nageoffer/congomall?color=green&style=social)](https://github.com/nageoffer/congomall) | 企业级 TOC 商城，基于 DDD 领域驱动模型开发       |
| [Seraph](https://gitee.com/nageoffer/seraph)       | [![star](https://gitee.com/nageoffer/seraph/badge/star.svg?theme=white)](https://gitee.com/nageoffer/seraph/stargazers) | [![](https://img.shields.io/github/stars/nageoffer/seraph?color=green&style=social)](https://github.com/nageoffer/seraph) | 幂等基础组件，接口幂等和消息队列重复消费解决方案 |


## 技术架构

在系统设计中，采用最新 JDK17 + SpringBoot3&SpringCloud 微服务架构，构建高并发、大数据量下仍然能提供高效可靠的 12306 购票服务。

通过学习 12306 项目，不仅能了解其运作机制，还能接触最新技术体系带来的新特性，从而拓展技术视野并提升自身技术水平。

![](https://images-machen.oss-cn-beijing.aliyuncs.com/1676637853202-c2af9e93-fe03-4c01-9fed-20ca07263476.png)

下方的架构图全面描述了项目的服务集合、组件库列表和基础设置层等要素，有助于用户快速了解 12306 平台的顶层设计和业务细节，从零到一进行构建。

![](https://images-machen.oss-cn-beijing.aliyuncs.com/image-20230802104007774.png)

## 加群沟通

开源不易，右上角点个 Star 鼓励一下吧！

如果大家想要实时关注 12306 更新的文章以及分享的干货的话，可以关注我的公众号：`马丁玩编程`。

使用过程中有任何问题，或者对项目有什么建议，添加好友备注：12306，领取项目学习资料，和 `2000+` 志同道合的朋友交流讨论。

![](https://images-machen.oss-cn-beijing.aliyuncs.com/1_990064918_171_84_3_716500817_c4659af930df3a2532d02b8fcc0f0cbe.png)

## 项目质量怎么样？

我理解大家对选择一个合适的项目以投入时间和精力的担忧。选对项目既可以锻炼技能，又可以产出价值是非常重要的。

以用户服务系统为例，低并发和低数据量的系统相对简单，但高并发和海量数据的系统则需要考虑很多额外因素。

1. 当用户在 12306 网站注册新账号或添加乘车人时，系统需验证用户提交信息的真实性和准确性。如何有效预防用户提交虚假信息，保障系统购票的安全？
2. 12306 的大规模用户和乘车人数据如何选择分库分表？选择哪个字段作为分片键？如何在老业务上平滑上线分库分表？出现问题如何快速回滚？
3. 系统支持会员使用用户名、手机号以及邮箱等多种方式进行登录。由于登录时无法确定用户的分片键，造成的“读请求扩散”问题如何解决？
4. 在高并发的会员注册场景下，绝对会出现缓存穿透问题。网上鼓吹的对不存在 Key 进行缓存值设为 Null，以及布隆过滤器等都存在漏洞，如何解决？
5. 存在较多的敏感信息，比如会员或者乘车人的姓名、手机号、邮箱、证件号码以及住址，如何防止数据库被攻击时造成的敏感信息泄露？

再以购票服务为例，当用户购买两个乘车人的高铁一等座票且没有选座时，座位的分配逻辑如下：

1. 首先检查当前列车的一等座余票是否足够。如果余票不足，直接向客户端返回购票请求失败的响应；
2. 获取所有车厢中有两个座位余票的车厢，并对这些车厢进行遍历，按照下述流程执行；
3. 首先检查所有车厢中是否存在一等座车票的相邻座位。如果所有车厢中都没有相邻座位，进入下一步逻辑；
4. 接着检查是否有车厢中包含两个不相邻的一等座座位？因为同车厢两座位相邻座位没有的话，就退而找同车厢不相邻座位；
5. 如果以上逻辑都无法满足，那么最后选择分配不同车厢的不相邻座位。这种情况下，由于已经确认一等座的余票充足，因此一定能够成功完成购票；
6. 通过以上步骤，购票系统能够在高铁一等座票余票充足的情况下，合理地分配座位，确保乘车人出行时有良好的座位体验。同时，如果余票不足，系统会优先满足乘车人顺利购票的需求。

## 如何使用

12306 前端系统实现了与官网极为接近的业务逻辑和 UI 展示。

在学习过程中，通过类似官网的前端系统直接调试后端服务，可以避免纯通过接口测试的繁琐。这种真实场景的模拟，使得学习过程更加流畅高效。

目前前端系统还在开发中，部分业务及细节处还在调整，完成后统一给出控制台操作手册，请耐心等待。

### 1. 车票查询功能

![](https://images-machen.oss-cn-beijing.aliyuncs.com/image-20230716114538112.png)

### 2. 提交订单页，选择乘车人下单

![](https://images-machen.oss-cn-beijing.aliyuncs.com/image-20230716114814135.png)

### 3. 高铁在线选座页面

![](https://images-machen.oss-cn-beijing.aliyuncs.com/image-20230716115005469.png)

## 12306 购票误区

说些大家对于 12306 购票时没有考虑到的一些业务点，或者存在误区的地方。

背景：假设，有一站列车，途径北京南、济南西、南京南、杭州东。

查询站点对应的列车车次信息。

- 你以为：通过搜索引擎技术 ElasticSearch 技术解决，因为涉及大量的查询条件。比如：车次、车组、出发车站、到达车站、出发时间等。
- 实际上 ：当海量并发查询时，ElasticSearch 的并发能力以及资源占用情况来说，并不适用。而且，大家如果仔细思考，发现这些查询条件都是可以通过类似于 Redis 的缓存技术存储，并在内存中进行组装。

买一张北京南到南京南的车票。

- 你以为：只扣减北京南到南京南单趟的票。
- 实际上：会扣减北京南-济南西，北京南-南京南，济南西-南京南的三趟车票。如果其中有任意条件不满足都不会购买成功。

买一张济南西到南京南的车票。

- 你以为：按照上述逻辑，如果通过软件恶意刷票，只买济南西-南京南的票，北京南-杭州东是否就买不到了？
- 实际上：每个站数之间的数量都有规则。虽然放票时间都是一致的，但是优先大站之间的票量，避免因为大量用户购买了中间站的车票导致始发站和终点站的购票困难。该问题通过动态放票解决，比如刚开始放票时对小站之间仅开放少量票，大站之间放出来多数票。如果后续接近发车时间，再开放小站间的车票。

当然，业务以及技术上的难点和亮点并不止于这些，更多的信息可以通过代码以及 12306 的使用上进行发掘。

## 常见问题答疑

Q：面向人群是学生，但是里面这么多的代码设计方案，学生能看明白么？

A：文档中准备了两部分资料，一部分是讲解技术实现细节，通过该部分可以很好掌握核心技术；另一部分是讲如何从零到一实现系统；通过两种文档结合，可以很好吸收 12306 系统中的设计。

Q：如何把 12306 项目写到我的简历上？

A：马哥在文档库最后给大家提供了 12306 写到简历上的亮点、难点以及解决方案。其次，通过 12306 去面试的小伙伴的面试题也会进行汇总，免费供大家学习使用。

Q：工作几年的有必要看 12306 这个系统么？

A：我觉得有必要，已经工作的同学虽然没办法把这个项目应用到简历上，但是系统中好的设计却是可以代入到自己的项目中，提高自己项目的亮点以及难点。

## 项目文档

共计 100+ 核心技术文档！帮助你深入了解以及快手上手 12306 系统。

-   入门准备

    -   [什么是 12306](https://magestack.cn/pages/52d5c3)
    -   [为什么 12306 更适合学生](https://magestack.cn/pages/a2f161/)
    -   [后端技术架构选型](https://magestack.cn/pages/793dcb)
    -   [项目接口文档](https://magestack.cn/pages/2f674a/)
    -   [前端控制台手册](https://magestack.cn/pages/1b13e8/)
    -   [如何从零到一学习 12306](https://magestack.cn/pages/8dfab5/)

-   快速开始

    -   [项目依赖中间件环境搭建](https://magestack.cn/pages/008ee6/)
    -   [快速启动（后端）](https://magestack.cn/pages/33d574/)
    -   [快速启动（前端）](https://magestack.cn/pages/088c16/)
    -   [12306 用户体系建设概要](https://magestack.cn/pages/dd027d/)
    -   ......

-   核心技术文档

    -   [如何生成全局唯一分布式 ID](https://magestack.cn/pages/8d38b5/)
    -   [如何使用 Builder 模式创建线程池](https://magestack.cn/pages/5fe2a4/)
    -   [责任链模式重构复杂业务场景](https://magestack.cn/pages/0ace0a/)
    -   [死磕设计模式之抽象责任链模式](https://magestack.cn/pages/2dle22/)
    -   ......

-   手摸手从零到一实现

    -   [手摸手之梳理核心业务](https://magestack.cn/pages/ksjlo9/)
    -   [手摸手之梳理数据库表结构设计](https://magestack.cn/pages/sk8271/)
    -   ......

-   面试系列

    -   [如何把 12306 写到简历上](https://magestack.cn/pages/sdd928/)
    -   [面试官问12306项目怎么来的？](https://magestack.cn/pages/f825cf/)
    -   [快手校招一面（12306 面试真题）](https://magestack.cn/pages/3655fe/)
    -   ......

项目中的文档包括三部分，快速开始、核心技术文档以及从零到一开发。可根据自己的兴趣选择深入了解核心技术或从零到一复刻系统。

![](https://images-machen.oss-cn-beijing.aliyuncs.com/12306%E6%96%87%E7%AB%A0%E7%BB%93%E6%9E%84-20230917.png)
