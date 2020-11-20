package wang.icopy.security.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.boot.convert.DurationUnit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

@ConfigurationProperties("app.system")
@ConstructorBinding
public class AppSystemProperties {

    private Duration sessionTimeout;

    private Duration readTimeout;

    public AppSystemProperties(@DurationUnit(ChronoUnit.SECONDS) @DefaultValue("30s") Duration sessionTimeout, @DefaultValue("1000ms") Duration readTimeout) {
        this.sessionTimeout = sessionTimeout;
        this.readTimeout = readTimeout;
    }

    public Duration getSessionTimeout() {
        return sessionTimeout;
    }

    public Duration getReadTimeout() {
        return readTimeout;
    }
}
