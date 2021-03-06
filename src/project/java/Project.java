/*
 * Copyright (C) 2020 marionette Development Team
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          https://opensource.org/licenses/MIT
 */
public class Project extends bee.api.Project {

    String selenium = "3.141.59";

    {
        product("com.github.teletha", "marionette", "1.0.0");

        require("com.github.teletha", "sinobu");
        require("com.github.teletha", "viewtify");
        require("com.github.teletha", "antibug").atTest();
        require("net.java.dev.jna", "jna", "5.5.0");
        require("net.java.dev.jna", "jna-platform", "5.5.0");

        require("org.seleniumhq.selenium", "selenium-chrome-driver", selenium);
        require("org.seleniumhq.selenium", "selenium-support", selenium);

        versionControlSystem("https://github.com/teletha/marionette");
    }
}