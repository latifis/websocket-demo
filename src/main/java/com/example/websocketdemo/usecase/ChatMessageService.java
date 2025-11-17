package com.example.websocketdemo.usecase;

import com.example.websocketdemo.utils.CensorshipUtils;
import org.springframework.stereotype.Service;

@Service
public class ChatMessageService {

    public String processMessage(String message) {
        return CensorshipUtils.censor(message);
    }

}
