package com.amberlabs.demotask.web.screens.person;

import com.haulmont.cuba.gui.screen.*;
import com.amberlabs.demotask.entity.Person;

@UiController("demotask_Person.edit")
@UiDescriptor("person-edit.xml")
@EditedEntityContainer("personDc")
@LoadDataBeforeShow
public class PersonEdit extends StandardEditor<Person> {
}