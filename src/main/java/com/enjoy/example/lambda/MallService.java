package com.enjoy.example.lambda;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/15
 */
public class MallService {

    private TestService testService;
    private TestService2 testService2;


    public MallService(TestService testService) {
        this.testService = testService;
    }

    public MallService(TestService2 testService2) {
        this.testService2 = testService2;
    }

    public TestService getTestService() {
        return testService;
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    public TestService2 getTestService2() {
        return testService2;
    }

    public void setTestService2(TestService2 testService2) {
        this.testService2 = testService2;
    }
}
