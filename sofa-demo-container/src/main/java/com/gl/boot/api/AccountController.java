package com.gl.boot.api;

import com.account.service.AccountService;
import com.alipay.sofa.runtime.api.annotation.SofaReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoliang
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/api/account")
public class AccountController {

    @SofaReference (interfaceType=AccountService.class)
    AccountService mAccountService;

    @RequestMapping(value = "/create", method ={RequestMethod.POST})
    @ResponseBody
    public void carryTo(){
        System.out.println(AccountController.class.getClassLoader().toString());
        System.out.println("==============");
        System.out.println(AccountService.class.getClassLoader().toString());


        mAccountService.create();
    }

}