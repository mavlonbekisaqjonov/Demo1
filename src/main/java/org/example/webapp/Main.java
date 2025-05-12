package org.example.webapp;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.io.File;

public class Main {
    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        Bot bot = new Bot();
        botsApi.registerBot(bot);

        bot.sendText(6184390454L, "Hello, World!");

//        InputFile inputFile = new InputFile(new File("src/main/resources/trial.txt"));
//        SendDocument sendDocument = new SendDocument();
//        sendDocument.setChatId("6184390454");
//        sendDocument.setDocument(inputFile);
//
//        bot.execute(sendDocument);
    }
}
