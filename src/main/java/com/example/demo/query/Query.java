package com.example.demo.query;

import com.example.demo.request.MyKpProfile;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.request.SampleRequest;
import com.example.demo.response.SampleResponse;

@Component
public class Query implements GraphQLQueryResolver {

    public String firstQuery() {
        return "first String";
    }

    public String secondQuery() {
        return "Second String";
    }

    public String fullName(SampleRequest sampleRequest) {
        return sampleRequest.getFirstName() + " " + sampleRequest.getLastName();
    }

    public SampleResponse response() {
        return new SampleResponse("xxx", "yy");
    }

    public MyKpProfile profile() {
        return new MyKpProfile("Sourav", "P111159", "1234", "Anand mohan");
    }

}
