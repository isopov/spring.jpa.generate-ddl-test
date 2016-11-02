package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class NoHibernateDllTest {

	
	@Autowired
	private JdbcTemplate template;
	
	@Test
	public void test() {
		int tablesCount = template.queryForObject("select count(*) from information_schema.tables where TABLE_SCHEMA='PUBLIC'", Integer.class);
		assertEquals(0, tablesCount);
	}

}
