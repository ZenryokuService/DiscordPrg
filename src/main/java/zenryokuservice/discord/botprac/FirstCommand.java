package zenryokuservice.discord.botprac;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.javacord.listener.message.MessageCreateListener;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

public class FirstCommand implements MessageCreateListener {
    public void onMessageCreate(DiscordAPI api, Message message) {
        // check the content of the message
        if (message.getContent().equalsIgnoreCase("test")) {
            // reply to the message
            message.reply("Hello World!");
        }
    }
}
