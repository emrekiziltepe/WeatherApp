package com.weatherApp.weatherApp;

import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;


import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;

@SpringUI
@Theme("valo")
public class MyUI extends UI {

    @Autowired
    private WebService service;
    private Weather wthr;

    @Override
    protected void init(VaadinRequest request) {

        final TextField veri = new TextField("Hava durumunu öğrenmek istediğiniz şehri giriniz: ");
        final Button tamam = new Button("Tamam");
        final VerticalLayout layout = new VerticalLayout();

        tamam.addClickListener( e -> {
            wthr = service.getWeather(veri.getValue());
            String dereceString = String.valueOf(wthr.getMain().toString());
            layout.addComponent(new Label(veri.getValue() + " sehrinin anlık sıcaklıgı: "+ dereceString + "°C"));
        });

        layout.addComponents(veri,tamam);
        setContent(layout);
    }

}
