package com.weinnovateit;

import com.google.gwt.event.dom.client.ClickEvent;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;


/**
 * Created by Jignesh on 12/06/2015.
 */
@Title("My UI")
@Theme("valo")
public class MyVaadinDemoApp extends UI{
    @Override
    public void init(VaadinRequest request){
        VerticalLayout layout = new VerticalLayout();
        setContent(layout);
        layout.addComponent(new Label("Hello, This is a test of Vaadin Framework"));


        // Have a clickable button
        layout.addComponent(new Button("Push Me!",
                new Button.ClickListener() {
                    public void buttonClick(Button.ClickEvent e) {
                        Notification.show("Pushed!");
                    }
                }));
    }
}
