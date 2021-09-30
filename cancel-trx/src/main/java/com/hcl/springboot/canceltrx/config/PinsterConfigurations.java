package com.hcl.springboot.canceltrx.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author satish-s
 *
 *
 *         Properties specific to PInster.
 *
 *         <p>
 *         Properties are configured in the application.yml file.
 *         </p>
 *
 */
@Data
@Component
@NoArgsConstructor
@ConfigurationProperties(prefix = "pinster", ignoreUnknownFields = false)
public class PinsterConfigurations {
	private final Metrics metrics = new Metrics();

	@Data
	@NoArgsConstructor
	public static class Metrics {

		private final Jmx jmx = new Jmx();
		private final Logs logs = new Logs();

		@Data
		@NoArgsConstructor
		public static class Jmx {
			private boolean enabled = false;
		}

		@Data
		@NoArgsConstructor
		public static class Logs {
			private boolean enabled = false;
			private long reportFrequency = 60;
		}
	}
}
