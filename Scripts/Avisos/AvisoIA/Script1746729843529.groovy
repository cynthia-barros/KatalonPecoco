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
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.waitForPageLoad(25)

WebUI.click(findTestObject('Menu/Avisos_Link'))

WebUI.waitForPageLoad(15)

// Aguarda o campo de data inicial aparecer
//WebUI.waitForElementVisible(findTestObject('Avisos/Input_FechaInitial'), 20)
WebUI.click(findTestObject('Avisos/InitialDate_Input'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Calendar/Input_Year'))

WebUI.setText(findTestObject('Calendar/Calendar_Year'), '2022')

//WebUI.click(findTestObject('Calendar/Canlendar_Year_ArrowDown'), FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('Calendar/Canlendar_Year_ArrowDown'), FailureHandling.STOP_ON_FAILURE)
WebUI.clickOffset(findTestObject('Calendar/Calendar'), 35, 118)

// Seleciona a opção ALERTA no dropdown Alarma
WebUI.selectOptionByValue(findTestObject('Avisos/Dropdown_Alarma'), '0', true)

// Clica no botão "Consultar"
WebUI.click(findTestObject('Avisos/Search_Btn2'))

// Aguarda os resultados carregarem (espera pelo link da primeira linha)
WebUI.waitForElementVisible(findTestObject('Avisos/Aviso_link_primeiralinha'), 10)

// Clica no link da primeira linha
WebUI.click(findTestObject('Avisos/Aviso_link_primeiralinha'))

