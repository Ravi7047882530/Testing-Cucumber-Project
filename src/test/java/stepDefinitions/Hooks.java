package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	TestContextSetup testContextSetup;

	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;

		System.out.println("Please pull the code from the Github");
		System.out.println("Please pull the code from the Github1");
		System.out.println("Please pull the code from the Github2");
		System.out.println("Please pull the code from the Github3");
		System.out.println("Please pull the code from the Github4");
		System.out.println("Please pull the code from the Github5");
		System.out.println("Please pull the code from the Github6");
		System.out.println("Azure Devops develop");
		System.out.println("Azure Devops develop1");
		System.out.println("Azure Devops develop2");
		System.out.println("Azure Devops develop for Hooks");
		System.out.println("Azure Devops develop for Hooks1");
		System.out.println("Azure Devops develop for Hooks2");



	}

	@After
	public void AfterScenario() throws IOException {
		testContextSetup.testBase.WebDriverManager().quit();
		System.out.println("Azure Devops develop for Hooks3");
		System.out.println("Azure Devops develop for Hooks2");
		System.out.println("Azure Devops develop for Hooks1");

	}

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		WebDriver driver = testContextSetup.testBase.WebDriverManager();
		if (scenario.isFailed()) {
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");
			System.out.println("Devops develop");
			System.out.println("Devops develop1");
		}
	}

}
