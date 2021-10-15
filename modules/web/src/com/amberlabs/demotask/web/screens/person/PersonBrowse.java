package com.amberlabs.demotask.web.screens.person;

import com.haulmont.cuba.gui.screen.*;
import com.amberlabs.demotask.entity.Person;

@UiController("demotask_Person.browse")
@UiDescriptor("person-browse.xml")
@LookupComponent("personsTable")
@LoadDataBeforeShow
public class PersonBrowse extends StandardLookup<Person> {
}