package com.vijai.ui.commons;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by Victor on 21.03.2017.
 */
@SpringUI(path =UniversMainUi.NAME )
@Title("Univers")
@Theme("valo")
public class UniversMainUi extends UI {

    public static final String NAME = "/ui";

    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout rootLayout = new VerticalLayout();
        rootLayout.addComponent(new Label("Hello from Vaadin"));
        setContent(rootLayout);
    }
}
