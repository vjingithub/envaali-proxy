package com.envaali.controller;

import com.envaali.model.StorageSummaryResponse;
import com.envaali.service.StorageServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

    @Autowired
    private StorageServiceProxy storageServiceProxy;

    @RequestMapping( value="/summery" , method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public StorageSummaryResponse getBucketSummery(){
        return  storageServiceProxy.getSummery();
    }


    @RequestMapping( value="/list" , method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public StorageSummaryResponse getBucketList(){
        return  storageServiceProxy.getSummery();
    }
}
