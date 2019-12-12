import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint


WebUI.openBrowser(null)

WebUI.navigateToUrl("https://opensource-demo.orangehrmlive.com/")

WebUI.setText(findTestObject("Object Repository/Page_OrangeHRM/input_Panel de inicio de sesin_txtUsername"), 'Admin')

WebUI.setEncryptedText(findTestObject("Object Repository/Page_OrangeHRM/input_Nombre de usuario_txtPassword"), '')