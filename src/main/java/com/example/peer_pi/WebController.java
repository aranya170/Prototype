package com.example.peer_pi;

import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class WebController extends Controller{
    @FXML
    private WebView webView;
    public void initialize(){
        WebEngine webEngine = webView.getEngine();
        webEngine.load("https://discord.gg/bJT6Fk8REa");
    }

}