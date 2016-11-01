package fr.neatmonster.nocheatplus;
 
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Created by grzegorz2047 on 01.11.2016.
 */
public class NCPEvent extends Event {
    private final String message;
    private static final HandlerList handlers = new HandlerList();

    public NCPEvent(String message) {
        this.message = message;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public String getMessage() {
        return message;
    }
}
