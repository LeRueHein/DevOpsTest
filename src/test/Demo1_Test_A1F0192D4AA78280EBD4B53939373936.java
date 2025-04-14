/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.ArmableTransaction;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.execution.moeb.services.MoebActionFailedEvent;
import com.ibm.rational.test.lt.execution.moeb.services.MoebFatalErrorEvent;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class Demo1_Test_A1F0192D4AA78280EBD4B53939373936 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public Demo1_Test_A1F0192D4AA78280EBD4B53939373936(IContainer container, String invocationId) {
		super(container, "demo1", invocationId, "A1F0192D4AA78280EBD4B53939373936", "/DemoAltoroJTest/Tests/demo1.testsuite", "/home/devsecop_demo/IBM/devopstest/workspace/DemoAltoroJTest/Tests/demo1.testsuite");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun() && !isCompoundTestRun()){
this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTTestVerdictFailedEvent(), new RPTContinueEvent("Test verdict was set to fail"), 2, "Test verdict was set to fail"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTDroppedConnectionEvent(), new RPTContinueEvent("Server dropped connection"), 1, "Server dropped connection"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	this.addEventBehavior(new RPTEventStructure(new MoebActionFailedEvent(), new RPTContinueEvent("Playback of UI Action failed"), 0, "Playback of UI Action failed"));
	this.addEventBehavior(new RPTEventStructure(new MoebFatalErrorEvent(), new RPTStopUserEvent("Playback of UI step has a fatal error"), 0, "Playback of UI step has a fatal error"));
	}
	
	
	        	this.add(varAction_1(this));
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(applicationContext_4(this));
	this.add(applicationContext_5(this));
	this.add(transaction_1(this));
	this.add(applicationContext_6(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Demo1_Test_A1F0192D4AA78280EBD4B53939373936 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1F0192D4AA7829EEBD4B53939373936");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Chrome", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start testfire.net",
												  "A1F0192D4ABB0A80EBD4B53939373936",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Start <b>testfire.net<\\/b>\",\"to_overriden\":false,\"application_uid\":\"e6f9ba08-7bbf-40bb-9074-e218fe062bf3\",\"timeout\":0,\"optionalStep\":false,\"uid\":\"A1F0192D4ABB0A80EBD4B53939373936\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_name\":\"testfire.net\",\"application_os\":\"WebUI\",\"isWeb\":false,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"http:\\/\\/testfire.net\\/login.jsp\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/DemoAltoroJTest/Tests/demo1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Edit text whose Label is Username: - testfire.net",
												  "A1F0192D4AC5DFF4EBD4B53939373936",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Username:<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e6f9ba08-7bbf-40bb-9074-e218fe062bf3\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0192D4AC5DFF4EBD4B53939373936\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Username:\"},\"name\":\"label\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:199;left:559;bottom:217;right:717\\\", \\\"Geometry\\\": { \\\"height\\\": 18, \\\"width\\\": 158, \\\"x\\\": 559, \\\"y\\\": 199 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(51, 51, 102);font-family:Verdana, Arial, sans-serif;font-size:11px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:1px;padding-left:2px;padding-right:2px;padding-top:1px;text-align:start;text-decoration:none solid rgb(51, 51, 102);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 217, \\\"color\\\": \\\"333366FF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"Verdana, Arial, sans-serif\\\", \\\"font-size\\\": 11, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"uid\\\", \\\"label\\\": \\\"Username:\\\", \\\"left\\\": 559, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"name\\\": \\\"uid\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 1, \\\"padding-left\\\": 2, \\\"padding-right\\\": 2, \\\"padding-top\\\": 1, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 717, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(51, 51, 102)\\\", \\\"top\\\": 199, \\\"type\\\": \\\"text\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"199\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='uid']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/DemoAltoroJTest/Tests/demo1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'admin' in Edit text whose Label is Username: - testfire.net",
												  "A1F0192D4B19CC54EBD4B53939373936",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0192D4B19CC54EBD4B53939373936\",\"preferredThinktime\":0,\"thinktime\":20240,\"isWeb\":false,\"description\":\"Think <i>20,240<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e6f9ba08-7bbf-40bb-9074-e218fe062bf3\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>admin<\\/b>' in <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Username:<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e6f9ba08-7bbf-40bb-9074-e218fe062bf3\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0192D4B19CC54EBD4B53939373936\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"admin\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Username:\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:199;left:559;bottom:217;right:717\\\", \\\"Geometry\\\": { \\\"height\\\": 18, \\\"width\\\": 158, \\\"x\\\": 559, \\\"y\\\": 199 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(51, 51, 102);font-family:Verdana, Arial, sans-serif;font-size:11px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:1px;padding-left:2px;padding-right:2px;padding-top:1px;text-align:start;text-decoration:none solid rgb(51, 51, 102);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 217, \\\"color\\\": \\\"333366FF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"Verdana, Arial, sans-serif\\\", \\\"font-size\\\": 11, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"uid\\\", \\\"label\\\": \\\"Username:\\\", \\\"left\\\": 559, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"name\\\": \\\"uid\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 1, \\\"padding-left\\\": 2, \\\"padding-right\\\": 2, \\\"padding-top\\\": 1, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 717, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(51, 51, 102)\\\", \\\"top\\\": 199, \\\"type\\\": \\\"text\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"314\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='uid']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/DemoAltoroJTest/Tests/demo1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'admin' in Password field whose Label is Password: - testfire.net",
												  "A1F0192D4B51A534EBD4B53939373936",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0192D4B51A534EBD4B53939373936\",\"preferredThinktime\":0,\"thinktime\":2315,\"isWeb\":false,\"description\":\"Think <i>2,315<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e6f9ba08-7bbf-40bb-9074-e218fe062bf3\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>admin<\\/b>' in <b>Password field<\\/b> whose <b>Label<\\/b> is <b>Password:<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e6f9ba08-7bbf-40bb-9074-e218fe062bf3\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0192D4B51A534EBD4B53939373936\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"admin\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Password:\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:225;left:559;bottom:243;right:717\\\", \\\"Geometry\\\": { \\\"height\\\": 18, \\\"width\\\": 158, \\\"x\\\": 559, \\\"y\\\": 225 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(51, 51, 102);font-family:Verdana, Arial, sans-serif;font-size:11px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:1px;padding-left:2px;padding-right:2px;padding-top:1px;text-align:start;text-decoration:none solid rgb(51, 51, 102);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 243, \\\"color\\\": \\\"333366FF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"Verdana, Arial, sans-serif\\\", \\\"font-size\\\": 11, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"passw\\\", \\\"label\\\": \\\"Password:\\\", \\\"left\\\": 559, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"name\\\": \\\"passw\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 1, \\\"padding-left\\\": 2, \\\"padding-right\\\": 2, \\\"padding-top\\\": 1, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputpassword\\\", \\\"right\\\": 717, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(51, 51, 102)\\\", \\\"top\\\": 225, \\\"type\\\": \\\"password\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"434\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='passw']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputpassword\"}}],\"timeout\":10}",
												  "/DemoAltoroJTest/Tests/demo1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Submit button whose Content is Login - testfire.net",
												  "A1F0192D4B7F1DD4EBD4B53939373936",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0192D4B7F1DD4EBD4B53939373936\",\"preferredThinktime\":0,\"thinktime\":1844,\"isWeb\":false,\"description\":\"Think <i>1,844<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e6f9ba08-7bbf-40bb-9074-e218fe062bf3\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Submit button<\\/b> whose <b>Content<\\/b> is <b>Login<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e6f9ba08-7bbf-40bb-9074-e218fe062bf3\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0192D4B7F1DD4EBD4B53939373936\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Login\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:251;left:559;bottom:269;right:602\\\", \\\"Geometry\\\": { \\\"height\\\": 18, \\\"width\\\": 42, \\\"x\\\": 559, \\\"y\\\": 251 }, \\\"Style$array$\\\": \\\"background-color:rgb(239, 239, 239);background-repeat:repeat;color:rgb(51, 51, 102);font-family:Verdana, Arial, sans-serif;font-size:11px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:1px;padding-left:6px;padding-right:6px;padding-top:1px;text-align:center;text-decoration:none solid rgb(51, 51, 102);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"EFEFEFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 269, \\\"color\\\": \\\"333366FF\\\", \\\"content\\\": \\\"Login\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"Verdana, Arial, sans-serif\\\", \\\"font-size\\\": 11, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 559, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"name\\\": \\\"btnSubmit\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 1, \\\"padding-left\\\": 6, \\\"padding-right\\\": 6, \\\"padding-top\\\": 1, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"inputsubmit\\\", \\\"right\\\": 602, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(51, 51, 102)\\\", \\\"top\\\": 251, \\\"type\\\": \\\"submit\\\", \\\"value\\\": \\\"Login\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"668\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/form[@id='login']\\\\\\/table\\\\\\/tbody\\\\\\/tr[3]\\\\\\/td[2]\\\\\\/input\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputsubmit\"}}],\"timeout\":10}",
												  "/DemoAltoroJTest/Tests/demo1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}


	private ArmableTransaction transaction_1(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "testdemo1", "A1F0192D4ABE65E0EBD4B53939373936") {
		
		    public void execute() {     
		       	
	
	
	
	      
                
		     
                super.execute();
            }
        
            public void finish(IKAction child) {
                super.finish(child);
                if (hasFinished()) {
                    
                }
            }
		};
		trx.setArmEnabled(false);
		return trx;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Close application window",
												  "A1F0192D4BB03FF7EBD4B53939373936",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"<b>Close<\\/b> application window\",\"to_overriden\":false,\"application_uid\":\"e6f9ba08-7bbf-40bb-9074-e218fe062bf3\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0192D4BB03FF7EBD4B53939373936\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"close\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/DemoAltoroJTest/Tests/demo1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

}
