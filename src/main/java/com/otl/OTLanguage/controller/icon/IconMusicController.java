package com.otl.OTLanguage.controller.icon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/icon/music")
public class IconMusicController implements IconMusic {

    @GetMapping(value = "/flat", produces = "image/svg+xml")
    public String flat(
            @RequestParam(value = "iconColor", defaultValue = "FFFFFF") String iconColor,
            @RequestParam(value = "textColor", defaultValue = "FFFFFF") String textColor,
            @RequestParam(value = "backgroundColor", defaultValue = "A900FF") String backgroundColor) {
        return makeFlat(iconColor, textColor, backgroundColor);
    }

    @GetMapping(value = "/for-the-badge", produces = "image/svg+xml")
    public String forTheBadge(
            @RequestParam(value = "iconColor", defaultValue = "FFFFFF") String iconColor,
            @RequestParam(value = "textColor", defaultValue = "FFFFFF") String textColor,
            @RequestParam(value = "backgroundColor", defaultValue = "A900FF") String backgroundColor) {
        return makeForTheBadge(iconColor, textColor, backgroundColor);
    }

    @GetMapping(value = "/flat-square", produces = "image/svg+xml")
    public String flatSquare(@RequestParam(value = "iconColor", defaultValue = "FFFFFF") String iconColor,
                             @RequestParam(value = "textColor", defaultValue = "FFFFFF") String textColor,
                             @RequestParam(value = "backgroundColor", defaultValue = "A900FF") String backgroundColor) {
        return makeFlatSquare(iconColor, textColor, backgroundColor);
    }

    @GetMapping(value = "/plastic", produces = "image/svg+xml")
    public String plastic(@RequestParam(value = "iconColor", defaultValue = "FFFFFF") String iconColor,
                          @RequestParam(value = "textColor", defaultValue = "FFFFFF") String textColor,
                          @RequestParam(value = "backgroundColor", defaultValue = "A900FF") String backgroundColor) {
        return makePlastic(iconColor, textColor, backgroundColor);
    }

    @GetMapping(value = "/social", produces = "image/svg+xml")
    public String social(@RequestParam(value = "iconColor", defaultValue = "000000") String iconColor,
                         @RequestParam(value = "textColor", defaultValue = "333") String textColor,
                         @RequestParam(value = "backgroundColor", defaultValue = "fcfcfc") String backgroundColor) {
        return makeSocial(iconColor, textColor, backgroundColor);
    }

}
