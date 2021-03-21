package com.envaali.service;

import com.envaali.model.ENode;
import com.envaali.model.StorageSummaryRequest;
import com.envaali.model.StorageSummaryResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class StorageServiceProxyImpl implements StorageServiceProxy {

    @Autowired
    private ERestClient client;

    @Override
    public StorageSummaryResponse getSummery() {

        RestTemplate restT = new RestTemplate();

        StorageSummaryRequest req = new StorageSummaryRequest();
        HttpHeaders header = new HttpHeaders();


        HttpEntity<StorageSummaryRequest> entity = new HttpEntity<>(req, header);
        ResponseEntity<String> response  = restT.exchange("", HttpMethod.GET, entity, String.class);

        if(response.getStatusCode() == HttpStatus.ACCEPTED){
            StorageSummaryResponse resp;
            try {
                resp = new ObjectMapper().readValue(response.getBody(), StorageSummaryResponse.class);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }else{
//            throw new EnvaaliException(DataNotFounExption);
        }


        // get node from Flask service
        String returnData = client.get();

        List<ENode> nodes = new ArrayList<>();
        nodes.add(ENode.builder()
                .name(returnData)
                .description("description")
                .nodeMime("nodeMime")
                .tag("tag")
                .nodeType("nodeType")
                .build());
        nodes.add(ENode.builder()
                .name(returnData)
                .description("description")
                .nodeMime("nodeMime")
                .tag("tag")
                .nodeType("nodeType")
                .build());
        nodes.add(ENode.builder()
                .name(returnData)
                .description("description")
                .nodeMime("nodeMime")
                .tag("tag")
                .nodeType("nodeType")
                .build());

//        ENodeBuilder.builder().nodeMime()

        return new StorageSummaryResponse(nodes);

    }

    @Override
    public StorageSummaryResponse getList() {
        return null;
    }
}
