package com.tradealertbot.tradealert;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

@Component
public class Tradealert extends TelegramLongPollingBot {
    String BOT_TOKEN;
    String BOT_USERNAME;

    Tradealert(@Value("$(bot.BOT_TOKEN)") String BOT_TOKEN, @Value("$(bot.BOT_USERNAME)") String BOT_USERNAME) {
        this.BOT_TOKEN = BOT_TOKEN;
        this.BOT_USERNAME = BOT_USERNAME;
    }
}
