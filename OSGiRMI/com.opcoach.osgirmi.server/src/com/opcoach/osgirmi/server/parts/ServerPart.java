package com.opcoach.osgirmi.server.parts;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.opcoach.osgirmi.common.DataService;

public class ServerPart {

	private Label lblInput;


	@PostConstruct
	public void createComposite(Composite parent, DataService ds) {
		parent.setLayout(new GridLayout(1, false));
		

		String info= "\n\nCheck that rmiregistry is started using a CLASSPATH init just before ! \n "+
		"export CLASSPATH=/Users/olivier/git/prototypes/OSGiRMI/com.opcoach.osgirmi.common/bin:/Users/olivier/git/prototypes/OSGiRMI/com.opcoach.osgirmi.parcauto/bin:/Users/olivier/git/prototypes/OSGiRMI/com.opcoach.osgirmi.basemodel/bin\n" +
        "rmiregistry";
				
				
		lblInput = new Label(parent, SWT.BORDER);
		lblInput.setText(" Server Administration. Car park : \n\n" + ds + info);
		System.out.println("In part this ds should be displayed = " + ds + info);
		lblInput.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	}

	@Focus
	public void setFocus() {
		lblInput.setFocus();
	}


}