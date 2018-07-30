package com.gl.test;

import com.account.service.AccountService;
import com.alipay.sofa.ark.springboot.runner.ArkBootRunner;
import com.alipay.sofa.ark.support.runner.ArkJUnit4Runner;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.gl.Application;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

//@RunWith(ArkBootRunner.class)
@SpringBootTest(classes = Application.class)
@RunWith(ArkJUnit4Runner.class)
public class TestAccountService {

    @SofaReference(uniqueId = "accountService")
    AccountService mAccountService;

    @Test
    public void test() {
        mAccountService.create();
    }
}