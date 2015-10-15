package com.appdynamics.extensions.aws.sqs;

import static org.junit.Assert.assertTrue;

import com.google.common.collect.Maps;
import com.singularity.ee.agent.systemagent.api.TaskOutput;
import org.junit.Test;

import java.util.Map;

public class SQSMonitorITest {
	
	private SQSMonitor classUnderTest = new SQSMonitor();
	
	@Test
	public void testMetricsCollectionCredentialsEncrypted() throws Exception {
		Map<String, String> args = Maps.newHashMap();
		args.put("config-file","src/test/resources/conf/itest-encrypted-config.yaml");
		
		TaskOutput result = classUnderTest.execute(args, null);
		assertTrue(result.getStatusMessage().contains("successfully completed"));
	}
	
	@Test
	public void testMetricsCoyllectionWithProxy() throws Exception {
		Map<String, String> args = Maps.newHashMap();
		args.put("config-file","src/test/resources/conf/itest-proxy-config.yaml");
		
		TaskOutput result = classUnderTest.execute(args, null);
		assertTrue(result.getStatusMessage().contains("successfully completed"));
	}	
}
