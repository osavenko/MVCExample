package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ControlPeaple {
    private People model;
    private ViewPeople view;

    public ControlPeaple(People model, ViewPeople view) {
        this.model = model;
        this.view = view;
        this.view.setName(model.getName());
        this.view.setSurname(model.getSurname());
        this.view.setSex(model.isSex());

        setBtnOkAction();
    }
    public void startView(){
        view.start();
    }
    private void setBtnOkAction(){
        view.getBtnOk().setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setName(view.getName());
                model.setName(view.getSurname());
                model.setSex(view.getSex());
                view.setFullName(model.toString());
            }
        });
    }
}
