package com.github.seratch.jslack.api.methods.request.emoji;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmojiListRequest {

    private String token;
}