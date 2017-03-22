package com.vijai.ui.students;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;
import com.vijai.ui.commons.UniversMainUi;
import com.vijai.utils.StudentsStringUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Victor on 22.03.2017.
 */
@SpringView(name= StudentLayoutFactory.NAME, ui=UniversMainUi.class)
public class StudentLayoutFactory extends VerticalLayout implements View {

    public static final String NAME = "addstudent";
    @Autowired
    private AddStudentMainLayoutFactory addStudentMainLayoutFactory;

    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {
        removeAllComponents();
        addLayout();
    }

    private TabSheet tabSheet;

    private void addLayout() {
        setMargin(true);
        tabSheet = new TabSheet();
        tabSheet.setWidth("100%");

        Component addStudentMainTab = addStudentMainLayoutFactory.createComponent();
        Component showStudentsTab = new Label("This will be show students Tab");

        tabSheet.addTab(addStudentMainTab, StudentsStringUtils.MAIN_MENU.getString());
        tabSheet.addTab(showStudentsTab, StudentsStringUtils.SHOW_ALL_STUDENTS.getString());

        addComponent(tabSheet);

    }
}
