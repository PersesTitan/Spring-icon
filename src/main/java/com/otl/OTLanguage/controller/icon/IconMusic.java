package com.otl.OTLanguage.controller.icon;

public interface IconMusic {
    default String makeFlat(String iconColor, String textColor, String backGroundColor) {
        return "<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"127\" height=\"20\" role=\"img\" aria-label=\"OTLanguageMusic\">\n" +
                "<title>OTLanguageMusic</title>\n" +
                "<linearGradient id=\"s\" x2=\"0\" y2=\"100%\">\n" +
                "<stop offset=\"0\" stop-color=\"#bbb\" stop-opacity=\".1\"/>\n" +
                "<stop offset=\"1\" stop-opacity=\".1\"/>\n" +
                "</linearGradient><clipPath id=\"r\"><rect width=\"127\" height=\"20\" rx=\"3\" fill=\"#fff\"/>\n" +
                "</clipPath><g clip-path=\"url(#r)\"><rect width=\"0\" height=\"20\" fill=\"#555\"/>\n" +
                "<rect x=\"0\" width=\"127\" height=\"20\" fill=\"#"+backGroundColor+"\"/>\n" +
                "<rect width=\"127\" height=\"20\" fill=\"url(#s)\"/>\n" +
                "</g><g fill=\"#fff\" text-anchor=\"middle\" font-family=\"Verdana,Geneva,DejaVu Sans,sans-serif\" text-rendering=\"geometricPrecision\" font-size=\"110\">\n" +
                "<svg width=\"768\" height=\"768\" viewBox=\"0 0 768 768\">\n" +
                "  <path style=\"fill:#"+iconColor+";stroke-width:0.0233257\"\n" +
                "     d=\"m 10.613198,3.0016027 c -0.333461,-0.01841 -0.6257124,0.120667 -0.8615364,0.475331 l -4.540933,5.934576 c -0.282445,0.388369 -0.274897,0.7569673 -0.01375,1.1082453 l 4.713538,6.184509 C 10.405762,17.2025 10.77355,16.943738 11.138567,16.838693 L 18.26672,14.63387 c 0.381803,-0.148754 0.774724,-0.283741 0.728085,-0.962149 l 0.0035,-7.4242443 c 0.02263,-0.45806 -0.172268,-0.786232 -0.734519,-0.895091 l -7.303928,-2.282033 c -0.11975,-0.03898 -0.235456,-0.06261 -0.34661,-0.06875 z m 0.263267,1.720898 3.815271,1.168489 -3.815271,0.834668 c -0.440065,0.155811 -0.491185,0.460224 -0.553335,0.76044 l 0.0097,2.8656103 c -0.4019904,0.0081 -0.7615914,-0.06116 -1.4367804,0.445141 -0.575889,0.569414 -0.490215,0.864056 -0.495117,1.19632 L 6.8670586,9.9807497 Z m 5.494762,1.692489 0.999929,0.32456 0.01454,6.5055533 -6.518929,2.021725 -1.5630074,-2.068078 c 0.614429,0.247144 1.1993194,0.233351 1.7619954,0.0232 0.498373,-0.205133 0.886384,-0.553165 0.985386,-1.275178 l -0.01459,-2.3926393 2.606612,-0.556415 0.0097,0.449771 c -0.867339,0.02446 -1.621446,0.252753 -1.936791,1.2705033 -0.04452,0.461748 0.03138,0.928038 0.640733,1.414281 0.727989,0.340017 1.482835,0.573592 2.465842,-0.09738 0.191844,-0.237786 0.404477,-0.321917 0.548535,-0.913481 z\" />\n" +
                "</svg>\n" +
                "<text aria-hidden=\"true\" x=\"725\" y=\"150\" fill=\"#010101\" fill-opacity=\".3\" transform=\"scale(.1)\" textLength=\"990\">\n" +
                "OTLanguageMusic</text>\n" +
                "<text x=\"725\" y=\"140\" transform=\"scale(.1)\" fill=\"#"+textColor+"\" textLength=\"990\">OTLanguageMusic</text></g></svg>";
    }

    default String makeFlatSquare(String iconColor, String textColor, String backGroundColor) {
        return "<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"127\" height=\"20\" role=\"img\" aria-label=\"OTLanguageMusic\">\n" +
                "<title>OTLanguageMusic</title>\n" +
                "<g shape-rendering=\"crispEdges\">\n" +
                "<rect width=\"0\" height=\"20\" fill=\"#555\"/>\n" +
                "<rect x=\"0\" width=\"127\" height=\"20\" fill=\"#"+backGroundColor+"\"/>\n" +
                "</g><g fill=\"#fff\" text-anchor=\"middle\" font-family=\"Verdana,Geneva,DejaVu Sans,sans-serif\" text-rendering=\"geometricPrecision\" font-size=\"110\">\n" +
                "<svg width=\"768\" height=\"768\" viewBox=\"0 0 768 768\">\n" +
                "  <path style=\"fill:#"+iconColor+";stroke-width:0.0233257\"\n" +
                "     d=\"m 10.613198,3.0016027 c -0.333461,-0.01841 -0.6257124,0.120667 -0.8615364,0.475331 l -4.540933,5.934576 c -0.282445,0.388369 -0.274897,0.7569673 -0.01375,1.1082453 l 4.713538,6.184509 C 10.405762,17.2025 10.77355,16.943738 11.138567,16.838693 L 18.26672,14.63387 c 0.381803,-0.148754 0.774724,-0.283741 0.728085,-0.962149 l 0.0035,-7.4242443 c 0.02263,-0.45806 -0.172268,-0.786232 -0.734519,-0.895091 l -7.303928,-2.282033 c -0.11975,-0.03898 -0.235456,-0.06261 -0.34661,-0.06875 z m 0.263267,1.720898 3.815271,1.168489 -3.815271,0.834668 c -0.440065,0.155811 -0.491185,0.460224 -0.553335,0.76044 l 0.0097,2.8656103 c -0.4019904,0.0081 -0.7615914,-0.06116 -1.4367804,0.445141 -0.575889,0.569414 -0.490215,0.864056 -0.495117,1.19632 L 6.8670586,9.9807497 Z m 5.494762,1.692489 0.999929,0.32456 0.01454,6.5055533 -6.518929,2.021725 -1.5630074,-2.068078 c 0.614429,0.247144 1.1993194,0.233351 1.7619954,0.0232 0.498373,-0.205133 0.886384,-0.553165 0.985386,-1.275178 l -0.01459,-2.3926393 2.606612,-0.556415 0.0097,0.449771 c -0.867339,0.02446 -1.621446,0.252753 -1.936791,1.2705033 -0.04452,0.461748 0.03138,0.928038 0.640733,1.414281 0.727989,0.340017 1.482835,0.573592 2.465842,-0.09738 0.191844,-0.237786 0.404477,-0.321917 0.548535,-0.913481 z\" />\n" +
                "</svg>\n" +
                "<text x=\"725\" y=\"140\" transform=\"scale(.1)\" fill=\"#"+textColor+"\" textLength=\"990\">OTLanguageMusic</text></g></svg>";
    }

    default String makePlastic(String iconColor, String textColor, String backGroundColor) {
        return "<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"127\" height=\"18\" role=\"img\" aria-label=\"OTLanguageMusic\">\n" +
                "<title>OTLanguageMusic</title>\n" +
                "<linearGradient id=\"s\" x2=\"0\" y2=\"100%\">\n" +
                "<stop offset=\"0\" stop-color=\"#fff\" stop-opacity=\".7\"/>\n" +
                "<stop offset=\".1\" stop-color=\"#aaa\" stop-opacity=\".1\"/>\n" +
                "<stop offset=\".9\" stop-color=\"#000\" stop-opacity=\".3\"/>\n" +
                "<stop offset=\"1\" stop-color=\"#000\" stop-opacity=\".5\"/>\n" +
                "</linearGradient><clipPath id=\"r\"><rect width=\"127\" height=\"18\" rx=\"4\" fill=\"#fff\"/>\n" +
                "</clipPath><g clip-path=\"url(#r)\"><rect width=\"0\" height=\"18\" fill=\"#555\"/>\n" +
                "<rect x=\"0\" width=\"127\" height=\"18\" fill=\"#"+backGroundColor+"\"/>\n" +
                "<rect width=\"127\" height=\"18\" fill=\"url(#s)\"/>\n" +
                "</g><g fill=\"#fff\" text-anchor=\"middle\" font-family=\"Verdana,Geneva,DejaVu Sans,sans-serif\" text-rendering=\"geometricPrecision\" font-size=\"110\">\n" +
                "<svg width=\"768\" height=\"768\" viewBox=\"0 1 768 768\">\n" +
                "  <path style=\"fill:#"+iconColor+";stroke-width:0.0233257\" d=\"m 10.613198,3.0016027 c -0.333461,-0.01841 -0.6257124,0.120667 -0.8615364,0.475331 l -4.540933,5.934576 c -0.282445,0.388369 -0.274897,0.7569673 -0.01375,1.1082453 l 4.713538,6.184509 C 10.405762,17.2025 10.77355,16.943738 11.138567,16.838693 L 18.26672,14.63387 c 0.381803,-0.148754 0.774724,-0.283741 0.728085,-0.962149 l 0.0035,-7.4242443 c 0.02263,-0.45806 -0.172268,-0.786232 -0.734519,-0.895091 l -7.303928,-2.282033 c -0.11975,-0.03898 -0.235456,-0.06261 -0.34661,-0.06875 z m 0.263267,1.720898 3.815271,1.168489 -3.815271,0.834668 c -0.440065,0.155811 -0.491185,0.460224 -0.553335,0.76044 l 0.0097,2.8656103 c -0.4019904,0.0081 -0.7615914,-0.06116 -1.4367804,0.445141 -0.575889,0.569414 -0.490215,0.864056 -0.495117,1.19632 L 6.8670586,9.9807497 Z m 5.494762,1.692489 0.999929,0.32456 0.01454,6.5055533 -6.518929,2.021725 -1.5630074,-2.068078 c 0.614429,0.247144 1.1993194,0.233351 1.7619954,0.0232 0.498373,-0.205133 0.886384,-0.553165 0.985386,-1.275178 l -0.01459,-2.3926393 2.606612,-0.556415 0.0097,0.449771 c -0.867339,0.02446 -1.621446,0.252753 -1.936791,1.2705033 -0.04452,0.461748 0.03138,0.928038 0.640733,1.414281 0.727989,0.340017 1.482835,0.573592 2.465842,-0.09738 0.191844,-0.237786 0.404477,-0.321917 0.548535,-0.913481 z\" />\n" +
                "</svg>\n" +
                "<text aria-hidden=\"true\" x=\"725\" y=\"140\" fill=\"#010101\" fill-opacity=\".3\" transform=\"scale(.1)\" textLength=\"990\">\n" +
                "OTLanguageMusic</text><text x=\"725\" y=\"130\" transform=\"scale(.1)\" fill=\"#"+textColor+"\" textLength=\"990\">\n" +
                "OTLanguageMusic</text></g></svg>";
    }

    default String makeForTheBadge(String iconColor, String textColor, String backGroundColor) {
        return "<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"176.75\" height=\"28\" role=\"img\" aria-label=\"OTLANGUAGEMUSIC\">\n" +
                "<title>OTLANGUAGEMUSIC</title>\n" +
                "<g shape-rendering=\"crispEdges\">\n" +
                "<rect width=\"176.75\" height=\"28\" fill=\"#"+backGroundColor+"\"/>\n" +
                "</g><g fill=\"#fff\" text-anchor=\"middle\" font-family=\"Verdana,Geneva,DejaVu Sans,sans-serif\" text-rendering=\"geometricPrecision\" font-size=\"100\">\n" +
                "<svg width=\"1100\" height=\"1100\" viewBox=\"1 1 768 768\">\n" +
                "  <path style=\"fill:#"+iconColor+";stroke-width:0.0233257\"\n" +
                "     d=\"m 10.613198,3.0016027 c -0.333461,-0.01841 -0.6257124,0.120667 -0.8615364,0.475331 l -4.540933,5.934576 c -0.282445,0.388369 -0.274897,0.7569673 -0.01375,1.1082453 l 4.713538,6.184509 C 10.405762,17.2025 10.77355,16.943738 11.138567,16.838693 L 18.26672,14.63387 c 0.381803,-0.148754 0.774724,-0.283741 0.728085,-0.962149 l 0.0035,-7.4242443 c 0.02263,-0.45806 -0.172268,-0.786232 -0.734519,-0.895091 l -7.303928,-2.282033 c -0.11975,-0.03898 -0.235456,-0.06261 -0.34661,-0.06875 z m 0.263267,1.720898 3.815271,1.168489 -3.815271,0.834668 c -0.440065,0.155811 -0.491185,0.460224 -0.553335,0.76044 l 0.0097,2.8656103 c -0.4019904,0.0081 -0.7615914,-0.06116 -1.4367804,0.445141 -0.575889,0.569414 -0.490215,0.864056 -0.495117,1.19632 L 6.8670586,9.9807497 Z m 5.494762,1.692489 0.999929,0.32456 0.01454,6.5055533 -6.518929,2.021725 -1.5630074,-2.068078 c 0.614429,0.247144 1.1993194,0.233351 1.7619954,0.0232 0.498373,-0.205133 0.886384,-0.553165 0.985386,-1.275178 l -0.01459,-2.3926393 2.606612,-0.556415 0.0097,0.449771 c -0.867339,0.02446 -1.621446,0.252753 -1.936791,1.2705033 -0.04452,0.461748 0.03138,0.928038 0.640733,1.414281 0.727989,0.340017 1.482835,0.573592 2.465842,-0.09738 0.191844,-0.237786 0.404477,-0.321917 0.548535,-0.913481 z\" /></svg>\n" +
                "<text transform=\"scale(.1)\" x=\"983.75\" y=\"175\" textLength=\"1327.5\" fill=\"#"+textColor+"\" font-weight=\"bold\">OTLANGUAGEMUSIC</text></g></svg>";

    }

    default String makeSocial(String iconColor, String textColor, String backGroundColor) {
        return "<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"139\" height=\"20\" role=\"img\" aria-label=\"OTLanguageMusic\">\n" +
                "<title>OTLanguageMusic</title><style>a:hover #llink{fill:url(#b);stroke:#ccc}a:hover #rlink{fill:#4183c4}</style>\n" +
                "<linearGradient id=\"a\" x2=\"0\" y2=\"100%\"><stop offset=\"0\" stop-color=\"#"+backGroundColor+"\" stop-opacity=\"0\"/>\n" +
                "<stop offset=\"1\" stop-opacity=\".1\"/>\n" +
                "</linearGradient><linearGradient id=\"b\" x2=\"0\" y2=\"100%\">\n" +
                "<stop offset=\"0\" stop-color=\"#ccc\" stop-opacity=\".1\"/>\n" +
                "<stop offset=\"1\" stop-opacity=\".1\"/></linearGradient>\n" +
                "<g stroke=\"#d5d5d5\"><rect stroke=\"none\" fill=\"#"+backGroundColor+"\" x=\"0.5\" y=\"0.5\" width=\"25\" height=\"19\" rx=\"2\"/>\n" +
                "<rect x=\"31.5\" y=\"0.5\" width=\"107\" height=\"19\" rx=\"2\" fill=\"#fafafa\"/>\n" +
                "<rect x=\"31\" y=\"7.5\" width=\"0.5\" height=\"5\" stroke=\"#fafafa\"/>\n" +
                "<path d=\"M31.5 6.5 l-3 3v1 l3 3\" stroke=\"d5d5d5\" fill=\"#fafafa\"/></g>\n" +
                "<svg width=\"800\" height=\"800\" viewBox=\"0 0 768 768\">\n" +
                "  <path style=\"fill:#"+iconColor+";stroke-width:0.0233257\" d=\"m 10.613198,3.0016027 c -0.333461,-0.01841 -0.6257124,0.120667 -0.8615364,0.475331 l -4.540933,5.934576 c -0.282445,0.388369 -0.274897,0.7569673 -0.01375,1.1082453 l 4.713538,6.184509 C 10.405762,17.2025 10.77355,16.943738 11.138567,16.838693 L 18.26672,14.63387 c 0.381803,-0.148754 0.774724,-0.283741 0.728085,-0.962149 l 0.0035,-7.4242443 c 0.02263,-0.45806 -0.172268,-0.786232 -0.734519,-0.895091 l -7.303928,-2.282033 c -0.11975,-0.03898 -0.235456,-0.06261 -0.34661,-0.06875 z m 0.263267,1.720898 3.815271,1.168489 -3.815271,0.834668 c -0.440065,0.155811 -0.491185,0.460224 -0.553335,0.76044 l 0.0097,2.8656103 c -0.4019904,0.0081 -0.7615914,-0.06116 -1.4367804,0.445141 -0.575889,0.569414 -0.490215,0.864056 -0.495117,1.19632 L 6.8670586,9.9807497 Z m 5.494762,1.692489 0.999929,0.32456 0.01454,6.5055533 -6.518929,2.021725 -1.5630074,-2.068078 c 0.614429,0.247144 1.1993194,0.233351 1.7619954,0.0232 0.498373,-0.205133 0.886384,-0.553165 0.985386,-1.275178 l -0.01459,-2.3926393 2.606612,-0.556415 0.0097,0.449771 c -0.867339,0.02446 -1.621446,0.252753 -1.936791,1.2705033 -0.04452,0.461748 0.03138,0.928038 0.640733,1.414281 0.727989,0.340017 1.482835,0.573592 2.465842,-0.09738 0.191844,-0.237786 0.404477,-0.321917 0.548535,-0.913481 z\" /></svg>\n" +
                "<g aria-hidden=\"true\" fill=\"#333\" text-anchor=\"middle\" font-family=\"Helvetica Neue,Helvetica,Arial,sans-serif\" text-rendering=\"geometricPrecision\" font-weight=\"700\" font-size=\"110px\" line-height=\"14px\">\n" +
                "<rect id=\"llink\" stroke=\"#d5d5d5\" fill=\"url(#a)\" x=\".5\" y=\".5\" width=\"25\" height=\"19\" rx=\"2\"/>\n" +
                "<text aria-hidden=\"true\" x=\"195\" y=\"150\" fill=\"#fff\" transform=\"scale(.1)\" textLength=\"10\"></text>\n" +
                "<text x=\"195\" y=\"140\" transform=\"scale(.1)\" textLength=\"10\"></text>\n" +
                "<text aria-hidden=\"true\" x=\"845\" y=\"150\" fill=\"#"+textColor+"\" transform=\"scale(.1)\" textLength=\"990\">\n" +
                "OTLanguageMusic</text><text id=\"rlink\" x=\"845\" y=\"140\" transform=\"scale(.1)\" textLength=\"990\">\n" +
                "OTLanguageMusic</text></g></svg>";
    }
}
