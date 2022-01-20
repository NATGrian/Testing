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

WebUI.click(findTestObject('obj_page-dashboard/btn_card-ingredients'))

WebUI.verifyElementPresent(findTestObject('obj_page-ingredients/obj_page-list-ingredients/verify_page-list-ingredients'), 
    3)

WebUI.click(findTestObject('obj-menus/btn_menu-dashboard'))

WebUI.click(findTestObject('obj_page-dashboard/btn_card-product'))

WebUI.verifyElementPresent(findTestObject('obj_page-product/obj_page-list-product/verify_page-list-product'), 3)

WebUI.click(findTestObject('obj-menus/btn_menu-dashboard'))

WebUI.click(findTestObject('obj_page-dashboard/btn_card-users'))

WebUI.verifyElementPresent(findTestObject('obj_page-users/verify_page-users'), 3)

WebUI.click(findTestObject('obj-menus/btn_menu-dashboard'))

WebUI.click(findTestObject('obj_page-dashboard/btn_card-report'))

WebUI.verifyElementPresent(findTestObject('obj_page-report/verify_page-report'), 3)

WebUI.click(findTestObject('obj-menus/btn_menu-dashboard'))

