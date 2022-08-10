package com.example.demo;

import com.netflix.loadbalancer.Server;
import org.springframework.cloud.netflix.ribbon.ServerIntrospector;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class TestServerIntrospector implements ServerIntrospector {

    private List<Integer> securePorts = Arrays.asList(443);

    @Override
    public boolean isSecure(Server server) {
        return securePorts.contains(server.getPort());
    }

    public Map<String, String> getMetadata(Server server) {
        return Collections.emptyMap();
    }

}
