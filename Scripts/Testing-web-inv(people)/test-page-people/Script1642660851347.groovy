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

WebUI.click(findTestObject('obj-menus/btn_menu-people'))

WebUI.click(findTestObject('obj_page-people/btn_group'))

WebUI.verifyElementPresent(findTestObject('obj_page-people/obj_page-role/verify_page-role'), 3)

WebUI.click(findTestObject('obj_page-people/obj_page-role/btn_addgroup'))

WebUI.verifyElementPresent(findTestObject('obj_page-people/obj_page-role/verify-md_addrole'), 3)

WebUI.setText(findTestObject('obj_page-people/obj_page-role/txt_rolename'), 'เทส')

WebUI.setText(findTestObject('obj_page-people/obj_page-role/txt_description'), 'ttt')

WebUI.click(findTestObject('obj_page-people/obj_page-role/btn-submitgroup'))

WebUI.click(findTestObject('obj-menus/btn_menu-people'))

WebUI.click(findTestObject('obj_page-people/btn_addpeople'))

WebUI.verifyElementPresent(findTestObject('obj_page-people/verify-md_addpeople'), 3)

