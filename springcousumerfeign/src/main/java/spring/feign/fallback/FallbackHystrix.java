package spring.feign.fallback;

import org.springframework.stereotype.Component;

import spring.feign.inteface.AddServiceIn;

@Component
public class FallbackHystrix implements AddServiceIn {

	@Override
	public Integer add(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return -999;
	}

}
