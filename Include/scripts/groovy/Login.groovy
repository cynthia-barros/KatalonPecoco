import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.pt.Dado
import internal.GlobalVariable

public class Login {

	@Dado("que acesso a aplicação (.*)")
	def acessoAplicacao(String email, String senha) {
		WebUI.openBrowser('https://pecoco-dev.outsystems.app/Lubricantes/Login')

		WebUI.maximizeWindow()

		WebUI.waitForPageLoad(1)

		WebUI.setText(findTestObject('Login/username_txt'), email)

		WebUI.setText(findTestObject('Login/password_txt'), senha)

		WebUI.click(findTestObject('Login/login_btn'))
	}
	/*
	 // Carrega a planilha
	 def testData = findTestData('PecocoUserInfo')
	 // Percorre cada linha do Excel
	 for (int i = 1; i <= testData.getRowNumbers(); i++) {
	 String email = testData.getValue('email', i)
	 String senha = testData.getValue('senha', i)
	 // Exemplo de uso do e-mail
	 // Validação, log ou verificação podem ser feitos aqui
	 WebUI.closeBrowser()
	 }
	 */
}
