import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.sampleAUTHoverPage)

WebUI.verifyTextNotPresent("The div is hovered!", false)

def hoverableObject = findTestObject('Object Repository/Page_Demo AUT/div_Hover me')

WebUI.mouseOver(hoverableObject)

'Verify a text is present as a result of hovering over the element'
WebUI.verifyTextPresent("The div is hovered!", false)

WebUI.mouseOverOffset(hoverableObject, 20, 20)

'Verify a text is present as a result of hovering over the element with a relative position'
WebUI.verifyTextPresent("The div is hovered!", false)

'Move the mouse over the element with a relative position that is outside the element'
WebUI.mouseOverOffset(hoverableObject, 300, 300)

'Verify the text is not present because the mouse is outside the element'
WebUI.verifyTextNotPresent("The div is hovered!", false)