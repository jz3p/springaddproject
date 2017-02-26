package main.java.spring.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Addcontroller {
	
	private final Logger logger =Logger.getLogger(Addcontroller.class);
	
	@Autowired
	private DiscoveryClient client ;
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public Integer  add(@RequestParam Integer a,@RequestParam Integer b) {
		ServiceInstance instance =client.getLocalServiceInstance();
		Integer result =a+b;
		logger.info("host:port:"+instance.getHost()+":"+instance.getPort()+" result:"+result);
		return result;
		
	}
}
