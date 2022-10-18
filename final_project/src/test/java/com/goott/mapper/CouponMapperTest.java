package com.goott.mapper;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.goott.domain.CouponVO;

import lombok.extern.log4j.Log4j;


@ContextConfiguration(locations =  "file:src/main/webapp/WEB-INF/spring/root-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
public class CouponMapperTest {

	@Inject
	CouponMapper couponMapper;
	
	@Test
	public void test() {
		log.info("=================================================================");
//		log.info(couponMapper.selectCoupon("a"));
		CouponVO couponVO = couponMapper.selectCoupon("a");
		
		if(couponVO == null) {
			log.info("Null");
		}
		else {
			log.info("Not Null");
		}
		log.info("=================================================================");
	}

}
