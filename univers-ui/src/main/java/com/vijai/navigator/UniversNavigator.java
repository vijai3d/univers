package com.vijai.navigator;

import com.google.common.base.Strings;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.SingleComponentContainer;
import com.vaadin.ui.UI;

/**
 * Created by Victor on 22.03.2017.
 */
public class UniversNavigator extends Navigator {

    public UniversNavigator(UI ui, SingleComponentContainer container) {
        super(ui, container);
    }

    private static UniversNavigator getNavigator() {
        UI ui = UI.getCurrent();
        Navigator navigator = ui.getNavigator();
        return (UniversNavigator) navigator;
    }

    public  static void navigate(String path) {
        try {
            UniversNavigator.getNavigator().navigateTo(path);
        } catch (Exception e) {
            System.out.println("no such view");
            return;
        }
    }

    @Override
    public void navigateTo(String viewName) {
        super.navigateTo(Strings.nullToEmpty(viewName));
    }
}
