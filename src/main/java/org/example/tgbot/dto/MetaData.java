package org.example.tgbot.dto;

import org.telegram.telegrambots.meta.api.objects.Message;

public class MetaData {
    // в других полях пока нет необходимости
    Long who;
    MetaData(Message message) {
        this.who = message.getFrom().getId();
    }
}
