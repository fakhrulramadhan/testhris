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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Option/Page_OrangeHRM/Page_OrangeHRM/input/Page_OrangeHRM/arrow_select_userrole'))

WebUI.click(findTestObject('Page_OrangeHRM/div_ESS'))

WebUI.click(findTestObject('Option/Page_OrangeHRM/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('Page_OrangeHRM/div_Enabled'))

WebUI.setText(findTestObject('Option/Page_OrangeHRM/Page_OrangeHRM/input/input_Password_oxd-input oxd-input--active'), 'mautahuaja')

WebUI.setText(findTestObject('Option/Page_OrangeHRM/Page_OrangeHRM/input/input_employee'), 'ha')

WebUI.delay(3)

WebUI.click(findTestObject('Option/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/div_Russel  Hamilton'))

WebUI.setText(findTestObject('Option/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'),
	'Hari Ramadhan')

WebUI.setText(findTestObject('Option/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--focus'),
	'mautahuaja')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_OrangeHRM/button_Save'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

