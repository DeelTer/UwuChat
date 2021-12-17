package ru.deelter.uwuchat;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import ru.deelter.uwuchat.managers.UwuAdapter;

public class ChatListener implements Listener {


    @EventHandler(ignoreCancelled = true, priority = EventPriority.LOWEST)
    public void onChat(AsyncChatEvent event) {
        String content = LegacyComponentSerializer.legacyAmpersand().serialize(event.message());
        String adapted = UwuAdapter.adapt(content);
        event.message(Component.text(adapted));
    }
}
