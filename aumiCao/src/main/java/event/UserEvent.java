package event;

import model.User;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class UserEvent extends ApplicationEvent {
    private final User user;
    public UserEvent(Object source, User user) {
        super(source);
        this.user = user;
    }
    public UserEvent(Object source, Clock clock, User user) {
        super(source, clock);
        this.user = user;
    }
}
