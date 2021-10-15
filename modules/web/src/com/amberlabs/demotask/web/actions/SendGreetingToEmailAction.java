package com.amberlabs.demotask.web.actions;

import com.amberlabs.demotask.entity.Person;
import com.haulmont.cuba.core.app.EmailService;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.*;
import com.haulmont.cuba.gui.ComponentsHelper;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.ActionType;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.actions.ItemTrackingAction;

@ActionType("sendGreetingToEmail")
public class SendGreetingToEmailAction extends ItemTrackingAction {
    private final EmailService emailService;

    public SendGreetingToEmailAction(String id) {
        super(id);
        emailService = AppBeans.get(EmailService.NAME);
    }

    @Override
    public void actionPerform(Component component) {
        Entity selected = getTarget().getSingleSelected();
        if (selected == null) {
            return;
        }
        Person customer = (Person) selected;

        EmailInfo info = EmailInfoBuilder.create()
                .setAddresses(((Person) selected).getEmail())
                .setCaption(caption)
                .setBody(generateEmailBody(customer))
                .setBodyContentType(EmailInfo.TEXT_CONTENT_TYPE)
                .build();
        emailService.sendEmailAsync(info);
        }

        private String generateEmailBody(Person person) {
            return String.format("Уважаемый(ая), %s!\n" +
                    "Приглашаем вас посетить наш веб-портал для просмотра каталога товаров.", person.getEmail());
        }
}
