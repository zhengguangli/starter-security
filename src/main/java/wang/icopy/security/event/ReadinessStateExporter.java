package wang.icopy.security.event;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ReadinessStateExporter {

    @EventListener
    public void onStateChange(AvailabilityChangeEvent<ReadinessState> event) {
        switch (event.getState()) {
            case ACCEPTING_TRAFFIC:
                System.out.println("############################# create file /tmp/healthy #############################");
                break;
            case REFUSING_TRAFFIC:
                System.out.println("############################# remove file /tmp/healthy #############################");
                break;
        }
    }
}
