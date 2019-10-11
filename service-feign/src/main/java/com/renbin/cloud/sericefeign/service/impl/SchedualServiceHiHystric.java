package com.renbin.cloud.sericefeign.service.impl;

import com.renbin.cloud.sericefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author binren on 2019-10-10.
 * @project springcloudlearn
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
