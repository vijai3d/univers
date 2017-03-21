package com.vijai.ui.commons;

import com.vaadin.ui.Component;
import com.vaadin.ui.Tree;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by Victor on 21.03.2017.
 */
@org.springframework.stereotype.Component
class UniversMenuFactory implements UiComponentBuilder{

private class UniversMenu extends VerticalLayout {
    private Tree mainMenu;

    public UniversMenu init() {
        mainMenu = new Tree();


        return this;
    }

    public UniversMenu layout() {
        mainMenu.setWidth("100%");
        mainMenu.setHeightUndefined();
        mainMenu.addItem("STUDENT");
        mainMenu.addItem("UNIVERSITY");
        mainMenu.expandItem("STUDENT");
        mainMenu.expandItem("UNIVERSITY");
        mainMenu.addItem("Add student");
        mainMenu.addItem("Remove student");
        mainMenu.setChildrenAllowed("Add student", false);
        mainMenu.setChildrenAllowed("Remove student", false);
        mainMenu.setParent("Add student", "STUDENT");
        mainMenu.setParent("Remove student", "STUDENT");

        mainMenu.addItem("Operations");
        mainMenu.setChildrenAllowed("Operations", false);
        mainMenu.setParent("Operations", "UNIVERSITY");

        addComponent(mainMenu);
        return this;
    }
}
    public Component createComponent() {
        return new UniversMenu().init().layout();
    }
}
