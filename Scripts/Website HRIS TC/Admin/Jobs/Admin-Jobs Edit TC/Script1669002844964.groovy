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

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('Jobs/Jobs Add/Page_OrangeHRM/li_Job'))

WebUI.click(findTestObject('Jobs/Jobs Add/Page_OrangeHRM/a_Job Titles'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Jobs/Jobs Edit/button_Account Assistant_oxd-icon-button oxd-table-cell-action-space/button_Account Assistant_oxd-icon-button oxd-table-cell-action-space'))

WebUI.setText(findTestObject('Jobs/Jobs Edit/Page_OrangeHRM/input_Job Title_oxd-input oxd-input--active'), 'Flutter Developer')

WebUI.clearText(findTestObject('Jobs/Jobs Edit/Page_OrangeHRM/textarea_Job Description_oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Jobs/Jobs Edit/Page_OrangeHRM/textarea_Job Description_oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'), 
    'Ngoding Android')

WebUI.setText(findTestObject('Jobs/Jobs Add/Page_OrangeHRM/textarea_Note_oxd-textarea oxd-textarea--focus oxd-textarea--resize-vertical'), 
    'Katakanlah')

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Jobs/Jobs Edit/Page_OrangeHRM/button_Save'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

