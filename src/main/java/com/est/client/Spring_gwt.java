package com.est.client;


import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.Container;
import org.gwtbootstrap3.client.ui.FieldSet;
import org.gwtbootstrap3.client.ui.Form;
import org.gwtbootstrap3.client.ui.FormGroup;
import org.gwtbootstrap3.client.ui.FormLabel;
import org.gwtbootstrap3.client.ui.Input;
import org.gwtbootstrap3.client.ui.Jumbotron;
import org.gwtbootstrap3.client.ui.Legend;
import org.gwtbootstrap3.client.ui.Panel;
import org.gwtbootstrap3.client.ui.PanelBody;
import org.gwtbootstrap3.client.ui.PanelFooter;
import org.gwtbootstrap3.client.ui.PanelHeader;
import org.gwtbootstrap3.client.ui.TextBox;
import org.gwtbootstrap3.client.ui.constants.FormType;
import org.gwtbootstrap3.client.ui.constants.IconType;
import org.gwtbootstrap3.client.ui.constants.InputType;
import org.gwtbootstrap3.client.ui.gwt.Widget;
import org.gwtbootstrap3.extras.animate.client.ui.constants.Animation;
import org.gwtbootstrap3.extras.notify.client.ui.Notify;
import org.gwtbootstrap3.extras.notify.client.ui.NotifySettings;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.RootPanel;



public class Spring_gwt implements EntryPoint  {
	

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		Container container = new Container(); 
		container.setMarginTop(100);

		container.setSize("400px", "200px");
		
	    Form form  = new Form();
	    
	    form.setType(FormType.HORIZONTAL);
		FieldSet fieldSet = new FieldSet();
				
		FormGroup formGroupUser = new FormGroup();
		FormGroup formGroupPassword = new FormGroup();
		
		
		FormLabel formLabelName = new FormLabel();
		formLabelName.setText("Username");
		formGroupUser.add(formLabelName);
		
		TextBox textBoxName = new TextBox();
		formGroupUser.add(textBoxName);	
		
		
		FormLabel formLabelPassword = new FormLabel();
		formLabelPassword.setText("Password");
		formGroupPassword.add(formLabelPassword);
		
		Input in = new Input();
		in.setType(InputType.PASSWORD);
		formGroupPassword.add(in);

		Legend legend = new Legend("Sign In");
		
		fieldSet.add(legend);
		fieldSet.add(formGroupUser);
		fieldSet.add(formGroupPassword);
		
		
		Button button = new Button("login", new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				System.out.println("Estevam Meneses");
				  NotifySettings settings = NotifySettings.newSettings();
				  settings.setAnimation(Animation.TADA, Animation.LIGHTSPEED_OUT);
				  settings.setOffset(200, 140);
				  Notify.notify("Hey!", "Whats up!", IconType.SMILE_O, settings);
			}
		});
		
		button.setFocus(true);
		fieldSet.add(button);	
		
		Jumbotron j =  new Jumbotron();
	
		j.add(fieldSet);
		form.add(j);
		
		container.add(form);
		
		RootPanel.get("main").add(container);
		


	}
/*	@UiHandler("button")
	public void handleButton(ClickEvent event) {
	  Notify.notify("Message");
	}*/
	
	public Panel createPanel(final String title , final Widget w) {
		Panel p = new Panel();
		PanelHeader header = new PanelHeader();
		header.setText(title);
		PanelBody body = new PanelBody();
		body.add(w);
		PanelFooter footer = new  PanelFooter();
		
		p.add(header);
		p.add(body);
		p.add(footer);
		
		return p;
		
	}
}
