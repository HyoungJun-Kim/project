package com.goott.service;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.goott.domain.ProductBrandVO;
import com.goott.mapper.ProductBrandMapperTest;

import lombok.extern.log4j.Log4j;
@ContextConfiguration(locations =  "file:src/main/webapp/WEB-INF/spring/root-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
public class ProductBrandServiceTest {
	@Inject
	ProductBrandService productBrandService;
	@Test
	public void test() {
		log.info("service test-------------------------------------");
		for (ProductBrandVO productBrandVO : productBrandService.getList()) {
			log.info(productBrandVO);
		}
	}

}
