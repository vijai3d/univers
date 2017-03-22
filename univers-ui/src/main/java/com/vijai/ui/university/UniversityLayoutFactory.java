package com.vijai.ui.university;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vijai.ui.commons.UniversMainUi;

/**
 * Created by Victor on 22.03.2017.
 */
@SpringView(name = UniversityLayoutFactory.NAME, ui= UniversMainUi.class)
public class UniversityLayoutFactory extends VerticalLayout implements View {

    public static final String NAME = "operations";

    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {
        addComponent(new Label("University Layout"));
    }
}
