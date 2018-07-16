package zenryokuservice.discord.botprac;

import com.google.common.util.concurrent.FutureCallback;
import de.btobastian.javacord.DiscordAPI;
//import de.btobastian.javacord.DisordApi;
import de.btobastian.javacord.Javacord;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.javacord.listener.message.MessageCreateListener;
import de.btobastian.javacord.listener.message.MessageCreateListener;
import de.btobastian.sdcf4j.CommandHandler;
import de.btobastian.sdcf4j.handler.JavacordHandler;

public class HelloDiscord {
    public static void main(String[] args) {
// See "How to get the token" below
        DiscordAPI api = Javacord.getApi("467885482894950401", true);
        api.setEmail("yogotak45@gmail.com");
        api.setPassword("Rockandroll5");
        // connect
        api.connect(new FutureCallback<DiscordAPI>() {
            public void onSuccess(DiscordAPI api) {
                // register listener
                api.registerListener(new MessageCreateListener() {
                    public void onMessageCreate(DiscordAPI api, Message message) {
                        // check the content of the message
                        if (message.getContent().equalsIgnoreCase("ping")) {
                            // reply to the message
                            message.reply("pong");
                        }
                    }
                });
                // MessageListenerインターフェースを実装したクラスを追加
                api.registerListener(new FirstCommand());
            }

            public void onFailure(Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
