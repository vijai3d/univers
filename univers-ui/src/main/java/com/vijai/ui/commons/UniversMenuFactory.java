package com.vijai.ui.commons;

import com.vaadin.data.Property;
import com.vaadin.ui.Component;
import com.vaadin.ui.Tree;
import com.vaadin.ui.VerticalLayout;
import com.vijai.navigator.UniversNavigator;
import com.vijai.utils.StringUtils;

/**
 * Created by Victor on 21.03.2017.
 */
@org.springframework.stereotype.Component
class UniversMenuFactory implements UiComponentBuilder{

private class UniversMenu extends VerticalLayout implements Property.ValueChangeListener {
    private Tree mainMenu;

    public UniversMenu init() {
        mainMenu = new Tree();
        mainMenu.addValueChangeListener(this);
        return this;
    }

    public UniversMenu layout() {
        mainMenu.setWidth("100%");
        mainMenu.setHeightUndefined();
        mainMenu.addItem(StringUtils.MENU_STUDENT.getString());
        mainMenu.addItem(StringUtils.MENU_UNIVERSITY.getString());
        mainMenu.expandItem(StringUtils.MENU_STUDENT.getString());
        mainMenu.expandItem(StringUtils.MENU_UNIVERSITY.getString());
        mainMenu.addItem(StringUtils.MENU_ADD_STUDENT.getString());
        mainMenu.addItem(StringUtils.MENU_REMOVE_STUDENT.getString());
        mainMenu.setChildrenAllowed(StringUtils.MENU_ADD_STUDENT.getString(), false);
        mainMenu.setChildrenAllowed(StringUtils.MENU_REMOVE_STUDENT.getString(), false);
        mainMenu.setParent(StringUtils.MENU_ADD_STUDENT.getString(), StringUtils.MENU_STUDENT.getString());
        mainMenu.setParent(StringUtils.MENU_REMOVE_STUDENT.getString(), StringUtils.MENU_STUDENT.getString());

        mainMenu.addItem(StringUtils.MENU_OPERATIONS.getString());
        mainMenu.setChildrenAllowed(StringUtils.MENU_OPERATIONS.getString(), false);
        mainMenu.setParent(StringUtils.MENU_OPERATIONS.getString(), StringUtils.MENU_UNIVERSITY.getString());

        addComponent(mainMenu);
        return this;
    }

    public void valueChange(Property.ValueChangeEvent valueChangeEvent) {
        String selectedItemPath = (String) valueChangeEvent.getProperty().getValue();
        if (selectedItemPath==null) return;;
        String path = selectedItemPath.toLowerCase().replaceAll("\\s+", "");
        UniversNavigator.navigate(path);
        System.out.println(path);
    }
}
    public Component createComponent() {
        return new UniversMenu().init().layout();
    }
}
