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

WebUI.setText(findTestObject('Object Repository/Jobs Pay Grade/Edit Auto/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Jobs Pay Grade/Edit Auto/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Jobs Pay Grade/Edit Auto/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Jobs Pay Grade/Edit Auto/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/Jobs Pay Grade/Edit Auto/Page_OrangeHRM/li_Job'))

WebUI.click(findTestObject('Object Repository/Jobs Pay Grade/Edit Auto/Page_OrangeHRM/li_Pay Grades'))

WebUI.click(findTestObject('Object Repository/Jobs Pay Grade/Edit Auto/Page_OrangeHRM/i_United States Dollar_oxd-icon bi-pencil-fill'))

WebUI.setText(findTestObject('Object Repository/Jobs Pay Grade/Edit Auto/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus oxd-i_ad7396'), 
    '')

WebUI.clearText(findTestObject('Object Repository/Jobs Pay Grade/Edit Auto/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus oxd-i_ad7396'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Jobs Pay Grade/Edit Auto/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), 
    'IDR Grade')

WebUI.click(findTestObject('Object Repository/Jobs Pay Grade/Edit Auto/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Object Repository/Jobs Pay Grade/Edit Auto/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('Jobs Pay Grade/Editsjob/Page_OrangeHRM/div_SGD - Singapore Dollar'))

WebUI.setText(findTestObject('Object Repository/Jobs Pay Grade/Edit Auto/Page_OrangeHRM/input_Minimum Salary_oxd-input oxd-input--focus'), 
    '550')

WebUI.click(findTestObject('Object Repository/Jobs Pay Grade/Edit Auto/Page_OrangeHRM/input_Minimum Salary_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/Jobs Pay Grade/Edit Auto/Page_OrangeHRM/input_Maximum Salary_oxd-input oxd-input--f_c30d90'), 
    '700')

WebUI.click(findTestObject('Object Repository/Jobs Pay Grade/Edit Auto/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Jobs Pay Grade/Edit/button_Save/button_Save'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

