package com.otl.OTLanguage.controller.icon;

public interface IconOtl {
    default String makeFlat(String iconColor, String textColor, String backGroundColor) {
        return "<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"97\" height=\"20\" role=\"img\" aria-label=\"OTLanguage\">\n" +
                "    <title>OTLanguage</title>\n" +
                "    <linearGradient id=\"s\" x2=\"0\" y2=\"100%\">\n" +
                "    <stop offset=\"0\" stop-color=\"#bbb\" stop-opacity=\".1\"/>\n" +
                "    <stop offset=\"1\" stop-opacity=\".1\"/>\n" +
                "    </linearGradient>\n" +
                "    <clipPath id=\"r\">\n" +
                "    <rect width=\"97\" height=\"20\" rx=\"3\" fill=\"#fff\"/></clipPath><g clip-path=\"url(#r)\">\n" +
                "        <rect width=\"0\" height=\"20\" fill=\"#555\"/>\n" +
                "        <rect x=\"0\" width=\"97\" height=\"20\" fill=\"#"+backGroundColor+"\"/>\n" +
                "        <rect width=\"97\" height=\"20\" fill=\"url(#s)\"/>\n" +
                "    </g>\n" +
                "    <g fill=\"#fff\" text-anchor=\"middle\" font-family=\"Verdana,Geneva,DejaVu Sans,sans-serif\" text-rendering=\"geometricPrecision\" font-size=\"110\">\n" +
                "    <svg width=\"30\" height=\"30\" viewBox=\"5 3 6.4307136 6.4307136\">\n" +
                "        <g transform=\"matrix(0.02479747,0,0,0.02808422,6.0717857,3.6216356)\">\n" +
                "    <path style=\"fill:#"+iconColor+";stroke-width:0.264583\" d=\"M 3.7292978,23.80759 C 18.983847,16.10208 50.440752,0.32723207 50.440752,0.32723207 60.991294,-1.9464859 64.774534,8.1386921 58.190794,14.812412 L 17.226318,35.38692 29.404943,82.34844 81.164104,89.91395 102.75349,44.70542 77.381354,23.57734 55.791974,42.21433 68.800954,59.00607 80.518274,48.76496 c 7.94997,-3.12172 14.86071,2.01256 10.70243,11.90184 l -19.00604,17.34531 c -2.42552,1.5501 -5.8324,1.59751 -9.22623,-0.27678 L 37.339503,44.79768 c -1.588292,-2.89089 -1.873696,-5.78177 0.553575,-8.67266 L 73.690864,5.8629721 c 2.18354,-1.69 4.36708,-0.8742 6.55062,-0.0923 L 118.34582,36.03272 c 3.21033,3.29069 3.17431,6.58138 1.75298,9.87207 l -27.032856,57.11037 c -1.6666,1.99461 -3.00301,4.23687 -7.93456,3.78276 L 22.577531,97.75621 C 20.273448,97.48126 18.022833,97.64475 15.012022,91.57463 L 0.32756575,34.12847 c -0.898363,-4.25623 -0.0075,-7.80707 3.40173205,-10.32088 z\"/>\n" +
                "    </g></svg>\n" +
                "    <text aria-hidden=\"true\" x=\"575\" y=\"150\" fill=\"#010101\" fill-opacity=\".3\" transform=\"scale(.1)\" textLength=\"690\">\n" +
                "    OTLanguage</text>\n" +
                "    <text x=\"575\" y=\"140\" transform=\"scale(.1)\" fill=\"#"+textColor+"\" textLength=\"690\">OTLanguage</text></g></svg>";
    }

    default String makeForTheBadge(String iconColor, String textColor, String backGroundColor) {
        return "<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"132.5\" height=\"28\" role=\"img\" aria-label=\"OTLANGUAGE\">" +
                "<title>OTLANGUAGE</title><g shape-rendering=\"crispEdges\"><rect width=\"132.5\" height=\"28\" fill=\"#"+backGroundColor+"\"/></g><g fill=\"#fff\" text-anchor=\"middle\" font-family=\"Verdana,Geneva,DejaVu Sans,sans-serif\" text-rendering=\"geometricPrecision\" font-size=\"100\">\n" +
                "            <svg width=\"40\" height=\"40\" viewBox=\"5 3 6.4307136 6.4307136\">\n" +
                "            <g transform=\"matrix(0.02479747,0,0,0.02808422,6.0717857,3.6216356)\">\n" +
                "            <path style=\"fill:#"+iconColor+";stroke-width:0.264583\" d=\"M 3.7292978,23.80759 C 18.983847,16.10208 50.440752,0.32723207 50.440752,0.32723207 60.991294,-1.9464859 64.774534,8.1386921 58.190794,14.812412 L 17.226318,35.38692 29.404943,82.34844 81.164104,89.91395 102.75349,44.70542 77.381354,23.57734 55.791974,42.21433 68.800954,59.00607 80.518274,48.76496 c 7.94997,-3.12172 14.86071,2.01256 10.70243,11.90184 l -19.00604,17.34531 c -2.42552,1.5501 -5.8324,1.59751 -9.22623,-0.27678 L 37.339503,44.79768 c -1.588292,-2.89089 -1.873696,-5.78177 0.553575,-8.67266 L 73.690864,5.8629721 c 2.18354,-1.69 4.36708,-0.8742 6.55062,-0.0923 L 118.34582,36.03272 c 3.21033,3.29069 3.17431,6.58138 1.75298,9.87207 l -27.032856,57.11037 c -1.6666,1.99461 -3.00301,4.23687 -7.93456,3.78276 L 22.577531,97.75621 C 20.273448,97.48126 18.022833,97.64475 15.012022,91.57463 L 0.32756575,34.12847 c -0.898363,-4.25623 -0.0075,-7.80707 3.40173205,-10.32088 z\"/></g></svg>\n" +
                "            <text transform=\"scale(.1)\" x=\"762.5\" y=\"175\" textLength=\"885\" fill=\"#"+textColor+"\" font-weight=\"bold\">OTLANGUAGE</text></g></svg>";
    }

    default String makeFlatSquare(String iconColor, String textColor, String backGroundColor) {
        return "<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"97\" height=\"20\" role=\"img\" aria-label=\"OTLanguage\">" +
                "<title>OTLanguage</title><g shape-rendering=\"crispEdges\"><rect width=\"0\" height=\"20\" fill=\"#555\"/><rect x=\"0\" width=\"97\" height=\"20\" fill=\"#"+backGroundColor+"\"/></g><g fill=\"#fff\" text-anchor=\"middle\" font-family=\"Verdana,Geneva,DejaVu Sans,sans-serif\" text-rendering=\"geometricPrecision\" font-size=\"110\"><svg width=\"30\" height=\"30\" viewBox=\"5 3.1 6.4307136 6.4307136\">\n" +
                "    <g transform=\"matrix(0.02479747,0,0,0.02808422,6.0717857,3.6216356)\">\n" +
                "    <path style=\"fill:#"+iconColor+";stroke-width:0.264583\" d=\"M 3.7292978,23.80759 C 18.983847,16.10208 50.440752,0.32723207 50.440752,0.32723207 60.991294,-1.9464859 64.774534,8.1386921 58.190794,14.812412 L 17.226318,35.38692 29.404943,82.34844 81.164104,89.91395 102.75349,44.70542 77.381354,23.57734 55.791974,42.21433 68.800954,59.00607 80.518274,48.76496 c 7.94997,-3.12172 14.86071,2.01256 10.70243,11.90184 l -19.00604,17.34531 c -2.42552,1.5501 -5.8324,1.59751 -9.22623,-0.27678 L 37.339503,44.79768 c -1.588292,-2.89089 -1.873696,-5.78177 0.553575,-8.67266 L 73.690864,5.8629721 c 2.18354,-1.69 4.36708,-0.8742 6.55062,-0.0923 L 118.34582,36.03272 c 3.21033,3.29069 3.17431,6.58138 1.75298,9.87207 l -27.032856,57.11037 c -1.6666,1.99461 -3.00301,4.23687 -7.93456,3.78276 L 22.577531,97.75621 C 20.273448,97.48126 18.022833,97.64475 15.012022,91.57463 L 0.32756575,34.12847 c -0.898363,-4.25623 -0.0075,-7.80707 3.40173205,-10.32088 z\"/></g></svg>\n" +
                "    <text x=\"575\" y=\"140\" transform=\"scale(.1)\" fill=\"#"+textColor+"\" textLength=\"690\">OTLanguage</text></g></svg>";
    }

    default String makePlastic(String iconColor, String textColor, String backGroundColor) {
        return "<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"97\" height=\"18\" role=\"img\" aria-label=\"OTLanguage\"><title>OTLanguage</title><linearGradient id=\"s\" x2=\"0\" y2=\"100%\">\n" +
                "    <stop offset=\"0\" stop-color=\"#fff\" stop-opacity=\".7\"/><stop offset=\".1\" stop-color=\"#aaa\" stop-opacity=\".1\"/><stop offset=\".9\" stop-color=\"#000\" stop-opacity=\".3\"/><stop offset=\"1\" stop-color=\"#000\" stop-opacity=\".5\"/></linearGradient><clipPath id=\"r\"><rect width=\"97\" height=\"18\" rx=\"4\" fill=\"#fff\"/></clipPath><g clip-path=\"url(#r)\"><rect width=\"0\" height=\"18\" fill=\"#555\"/><rect x=\"0\" width=\"97\" height=\"18\" fill=\"#"+backGroundColor+"\"/><rect width=\"97\" height=\"18\" fill=\"url(#s)\"/></g><g fill=\"#fff\" text-anchor=\"middle\" font-family=\"Verdana,Geneva,DejaVu Sans,sans-serif\" text-rendering=\"geometricPrecision\" font-size=\"110\">\n" +
                "    <svg width=\"30\" height=\"30\" viewBox=\"5 3 6.4307136 6.4307136\">\n" +
                "    <g transform=\"matrix(0.02479747,0,0,0.02808422,6.0717857,3.6216356)\"><path style=\"fill:#"+iconColor+";stroke-width:0.264583\"\n" +
                "       d=\"M 3.7292978,23.80759 C 18.983847,16.10208 50.440752,0.32723207 50.440752,0.32723207 60.991294,-1.9464859 64.774534,8.1386921 58.190794,14.812412 L 17.226318,35.38692 29.404943,82.34844 81.164104,89.91395 102.75349,44.70542 77.381354,23.57734 55.791974,42.21433 68.800954,59.00607 80.518274,48.76496 c 7.94997,-3.12172 14.86071,2.01256 10.70243,11.90184 l -19.00604,17.34531 c -2.42552,1.5501 -5.8324,1.59751 -9.22623,-0.27678 L 37.339503,44.79768 c -1.588292,-2.89089 -1.873696,-5.78177 0.553575,-8.67266 L 73.690864,5.8629721 c 2.18354,-1.69 4.36708,-0.8742 6.55062,-0.0923 L 118.34582,36.03272 c 3.21033,3.29069 3.17431,6.58138 1.75298,9.87207 l -27.032856,57.11037 c -1.6666,1.99461 -3.00301,4.23687 -7.93456,3.78276 L 22.577531,97.75621 C 20.273448,97.48126 18.022833,97.64475 15.012022,91.57463 L 0.32756575,34.12847 c -0.898363,-4.25623 -0.0075,-7.80707 3.40173205,-10.32088 z\"/></g></svg>\n" +
                "    <text aria-hidden=\"true\" x=\"575\" y=\"140\" fill=\"#010101\" fill-opacity=\".3\" transform=\"scale(.1)\" textLength=\"690\">\n" +
                "    OTLanguage</text><text x=\"575\" y=\"130\" transform=\"scale(.1)\" fill=\"#"+textColor+"\" textLength=\"690\">OTLanguage</text></g></svg>";
    }

    default String makeSocial(String iconColor, String textColor, String backGroundColor) {
        return "<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"107\" height=\"20\" role=\"img\" aria-label=\"OTLanguage\">\n" +
                "            <title>OTLanguage</title><style>a:hover #llink{fill:url(#b);stroke:#ccc}a:hover #rlink{fill:#4183c4}</style><linearGradient id=\"a\" x2=\"0\" y2=\"100%\">\n" +
                "            <stop offset=\"0\" stop-color=\"#"+backGroundColor+"\" stop-opacity=\"0\"/><stop offset=\"1\" stop-opacity=\".1\"/>\n" +
                "            </linearGradient>\n" +
                "            <linearGradient id=\"b\" x2=\"0\" y2=\"100%\">\n" +
                "            <stop offset=\"0\" stop-color=\"#ccc\" stop-opacity=\".1\"/>\n" +
                "            <stop offset=\"1\" stop-opacity=\".1\"/>\n" +
                "            </linearGradient><g stroke=\"#d5d5d5\">\n" +
                "            <rect stroke=\"none\" fill=\"#"+backGroundColor+"\" x=\"0.5\" y=\"0.5\" width=\"25\" height=\"19\" rx=\"2\"/>\n" +
                "            <rect x=\"31.5\" y=\"0.5\" width=\"75\" height=\"19\" rx=\"2\" fill=\"#fafafa\"/>\n" +
                "            <rect x=\"31\" y=\"7.5\" width=\"0.5\" height=\"5\" stroke=\"#fafafa\"/>\n" +
                "            <path d=\"M31.5 6.5 l-3 3v1 l3 3\" stroke=\"d5d5d5\" fill=\"#fafafa\"/></g>\n" +
                "            <svg width=\"30\" height=\"30\" viewBox=\"5 3 6.4307136 6.4307136\">\n" +
                "            <g transform=\"matrix(0.02479747,0,0,0.02808422,6.0717857,3.6216356)\"><path style=\"fill:#"+iconColor+";stroke-width:0.264583\"\n" +
                "               d=\"M 3.7292978,23.80759 C 18.983847,16.10208 50.440752,0.32723207 50.440752,0.32723207 60.991294,-1.9464859 64.774534,8.1386921 58.190794,14.812412 L 17.226318,35.38692 29.404943,82.34844 81.164104,89.91395 102.75349,44.70542 77.381354,23.57734 55.791974,42.21433 68.800954,59.00607 80.518274,48.76496 c 7.94997,-3.12172 14.86071,2.01256 10.70243,11.90184 l -19.00604,17.34531 c -2.42552,1.5501 -5.8324,1.59751 -9.22623,-0.27678 L 37.339503,44.79768 c -1.588292,-2.89089 -1.873696,-5.78177 0.553575,-8.67266 L 73.690864,5.8629721 c 2.18354,-1.69 4.36708,-0.8742 6.55062,-0.0923 L 118.34582,36.03272 c 3.21033,3.29069 3.17431,6.58138 1.75298,9.87207 l -27.032856,57.11037 c -1.6666,1.99461 -3.00301,4.23687 -7.93456,3.78276 L 22.577531,97.75621 C 20.273448,97.48126 18.022833,97.64475 15.012022,91.57463 L 0.32756575,34.12847 c -0.898363,-4.25623 -0.0075,-7.80707 3.40173205,-10.32088 z\"/></g></svg>\n" +
                "            <g aria-hidden=\"true\" fill=\"#"+textColor+"\" text-anchor=\"middle\" font-family=\"Helvetica Neue,Helvetica,Arial,sans-serif\" text-rendering=\"geometricPrecision\" font-weight=\"700\" font-size=\"110px\" line-height=\"14px\">\n" +
                "            <rect id=\"llink\" stroke=\"#d5d5d5\" fill=\"url(#a)\" x=\".5\" y=\".5\" width=\"25\" height=\"19\" rx=\"2\"/>\n" +
                "            <text aria-hidden=\"true\" x=\"195\" y=\"150\" fill=\"#fff\" transform=\"scale(.1)\" textLength=\"10\"></text>\n" +
                "            <text x=\"195\" y=\"140\" transform=\"scale(.1)\" textLength=\"10\"></text>\n" +
                "            <text aria-hidden=\"true\" x=\"685\" y=\"150\" fill=\"#fff\" transform=\"scale(.1)\" textLength=\"670\">\n" +
                "            OTLanguage</text><text id=\"rlink\" x=\"685\" y=\"140\" transform=\"scale(.1)\" textLength=\"670\">OTLanguage</text></g></svg>";
    }
}
