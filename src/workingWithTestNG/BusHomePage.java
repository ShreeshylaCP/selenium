package workingWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusHomePage {
	
	public BusHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "One way")
	private WebElement oneWayLink;
	
	@FindBy(linkText = "Round trip")
	private WebElement roundTripLink;
	
	@FindBy(linkText = "Packages")
	private WebElement packagesLink;
	
	@FindBy(id = "src")
	private WebElement fromTextField;
	
	@FindBy(id = "dest")
	private WebElement totextField;
	
	@FindBy(id = "departure")
	private WebElement departureField;
	
	@FindBy(id = "return")
	private WebElement returnField;
	
	@FindBy(xpath = "//input[@class='search-btn search-journey']")
	private WebElement searchBusesButton;
	
	@FindBy(xpath = "//li[.='Pune']")
	private WebElement puneSearchSuggestion;
	
	@FindBy(xpath = "//li[.='Bangalore']")
	private WebElement bangaloreSearchSuggestion;
	
	@FindBy(xpath = "//span[text()='May']/../../..//div[text()='23']")
	private WebElement puneBangaloreDepartureDate;

	@FindBy(xpath = "//li[.='Mumbai']")
	private WebElement mumbaiSearchSuggestion;
	
	@FindBy(xpath = "//li[.='Goa']")
	private WebElement goaSearchSuggestion;
	
	@FindBy(xpath = "//span[text()='May']/../../..//div[text()='25']")
	private WebElement mumbaiGoaDepartureDate;
	
	@FindBy(xpath = "//li[.='Delhi']")
	private WebElement delhiSearchSuggestion;
	
	@FindBy(xpath = "//span[text()='May']/../../..//div[text()='27']")
	private WebElement bangaloreDelhiDepartureDate;
	
	@FindBy(xpath = "//span[@class='vc-close']")
	private WebElement calenderClose;

	public WebElement getOneWayLink() {
		return oneWayLink;
	}

	public WebElement getRoundTripLink() {
		return roundTripLink;
	}

	public WebElement getPackagesLink() {
		return packagesLink;
	}

	public WebElement getFromTextField() {
		return fromTextField;
	}

	public WebElement getTotextField() {
		return totextField;
	}

	public WebElement getDepartureField() {
		return departureField;
	}

	public WebElement getReturnField() {
		return returnField;
	}

	public WebElement getSearchBusesButton() {
		return searchBusesButton;
	}

	public WebElement getPuneSearchSuggestion() {
		return puneSearchSuggestion;
	}

	public WebElement getBangaloreSearchSuggestion() {
		return bangaloreSearchSuggestion;
	}

	public WebElement getPuneBangaloreDepartureDate() {
		return puneBangaloreDepartureDate;
	}

	public WebElement getMumbaiSearchSuggestion() {
		return mumbaiSearchSuggestion;
	}

	public WebElement getGoaSearchSuggestion() {
		return goaSearchSuggestion;
	}

	public WebElement getMumbaiGoaDepartureDate() {
		return mumbaiGoaDepartureDate;
	}

	public WebElement getDelhiSearchSuggestion() {
		return delhiSearchSuggestion;
	}

	public WebElement getBangaloreDelhiDepartureDate() {
		return bangaloreDelhiDepartureDate;
	}

	public WebElement getCalenderClose() {
		return calenderClose;
	}
	
	
}
