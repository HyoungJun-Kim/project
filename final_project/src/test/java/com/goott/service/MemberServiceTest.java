package com.goott.service;

import static org.junit.Assert.*;

import java.time.LocalTime;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
public class MemberServiceTest {

	@Inject
	MemberServiceImpl memberServiceImpl;

	@Test
	public void test() {
		log.info("암호 체크 결과 : " + memberServiceImpl.checkPw("doosan2058", "dnjstjr!213!"));

	}

	/*
	 * Date date1 = new Date(2020, 1, 1); Date date2 = new Date(2020, 1, 1); int
	 * result = date1.compareTo(date2);
	 * 
	 * if(result == 0) System.out.println("동일한 날짜"); else if (result < 0)
	 * System.out.println("date1은 date2 이전 날짜"); else
	 * System.out.println("date1은 date2 이후 날짜"); 출처:
	 * https://developer-talk.tistory.com/397 [평범한 직장인의 공부 정리:티스토리]
	 */

	@Test
	public void test2() {
		log.info("================================================================================================");
//		log.info(memberServiceImpl.getTime().compareTo(memberServiceImpl.getUserOffLimitsDate("doosan2058")));
		log.info(memberServiceImpl.getUserOffLimitsDate("doosan2058"));
		log.info("================================================================================================");

//		log.info(memberServiceImpl.getUserOffLimitsDate("doosan2058"));

	}

}
