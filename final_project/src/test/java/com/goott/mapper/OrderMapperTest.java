package com.goott.mapper;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;


@ContextConfiguration(locations =  "file:src/main/webapp/WEB-INF/spring/root-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
public class OrderMapperTest {

	@Inject
	OrderMapper orderMapper;
	
	@Test
	public void test() {
		Map<String, Object> map = new HashMap<>();
		
		map.put("in_member_id", "doosan2058");
		map.put("in_product_id", 115);
		map.put("in_order_quantity", 3);
		map.put("in_order_address", "서울 금천구 테스트");
		map.put("in_order_purchase_amount", 112000);
		map.put("in_order_coupon_num", "abcdaaaaabcd1111");
		map.put("in_order_comment", "부재시 문앞에 놓아 주세요.");
		map.put("in_member_purchase_point", 500);
		log.info("===================================================================");
		orderMapper.buy(map);
		log.info("테스트 실행중");
		log.info("===================================================================");
		log.info("결과 : " + map);
		log.info("===================================================================");
		
	}

}
