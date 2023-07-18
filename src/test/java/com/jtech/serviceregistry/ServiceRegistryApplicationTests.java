package com.jtech.serviceregistry;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class ServiceRegistryApplicationTests {

	@Autowired
	private ServiceRegistryApplication application;
	@Test
	void contextLoads() {
		assertThat(application).isNotNull();
	}

}
