package com.github.seratch.jslack.api.methods.request.bots;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BotsInfoRequest {

    private String token;
    private String bot;
}