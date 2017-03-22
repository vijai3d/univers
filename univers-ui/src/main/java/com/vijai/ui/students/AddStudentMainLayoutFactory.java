package com.vijai.ui.students;

import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.ui.*;
import com.vaadin.ui.Component;
import com.vijai.model.entity.Student;
import org.springframework.stereotype.*;

/**
 * Created by Victor on 22.03.2017.
 */
@org.springframework.stereotype.Component
public class AddStudentMainLayoutFactory {

    //we can not use Builder interface because we need here createComponent with argument
    private  class AddStudentMainLayout extends VerticalLayout {

        private TextField fisrtName;
        private TextField lastName;
        private TextField age;
        private ComboBox gender;
        private Button saveButton;
        private Button clearButton;

        private BeanFieldGroup<Student> fieldGroup;
        private Student student;

        public AddStudentMainLayout init() {
            return this;
        }

        public AddStudentMainLayout layout() {
            return this;
        }
    }
    public Component createComponent() {
        return new AddStudentMainLayout().init().layout();
    }
}
