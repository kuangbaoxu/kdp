package com.bxkj.kdp.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.bxkj.kdp.Application;
import com.bxkj.kdp.persistence.domain.LngfUser;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class DemoServiceTest {

	@Autowired
	private DemoService demoService;
	
	@Test
	@Rollback(false)
	public void recLiveTest() {
		List<LngfUser> list = demoService.selectByExample(null);
		
		for(LngfUser user :list){
			System.out.println(user.getRybs());
		}
	}
	
}
