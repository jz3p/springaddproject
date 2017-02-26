package spring.feign.inteface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.feign.fallback.FallbackHystrix;

@FeignClient(value="add-service",fallback=FallbackHystrix.class)
public interface AddServiceIn {
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public Integer add(@RequestParam(value="a") Integer a,@RequestParam(value="b") Integer b);
}
