module RuneChanger {
    requires java.base;
    requires java.scripting;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.swing;
    requires javafx.controls;
    requires java.naming;
    requires java.sql;
    requires jdk.crypto.ec;
    requires lol.client.java.api;
    requires com.jfoenix;
    requires com.sun.jna;
    requires logback.classic;
    requires logback.core;
    requires org.jsoup;
    requires fuzzywuzzy;
    requires org.controlsfx.controls;
    requires com.sun.jna.platform;
    requires org.update4j;
    requires mslinks;
    requires com.github.benmanes.caffeine;
    requires com.google.gson;
    requires java;
    requires com.stirante.eventbus;
    requires com.stirante.justpipe;
    requires org.slf4j;
    requires core;

    exports com.stirante.runechanger;
    exports com.stirante.runechanger.gui;
    exports com.stirante.runechanger.gui.controllers;
    exports com.stirante.runechanger.model.client;
    exports com.stirante.runechanger.client;
    exports com.stirante.runechanger.gui.components;
    exports com.stirante.runechanger.util;
    exports com.stirante.runechanger.gui.overlay;
    opens com.stirante.runechanger.sourcestore;
    opens com.stirante.runechanger.sourcestore.impl;
    opens com.stirante.runechanger.model.client;
    opens com.stirante.runechanger.model.app;
    opens com.stirante.runechanger.gui.components;
    opens com.stirante.runechanger.gui.controllers;
    opens com.stirante.runechanger.util;
}