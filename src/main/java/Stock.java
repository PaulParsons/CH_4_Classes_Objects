public class Stock {

	/**
	 * Design a class named Stock. The Stock class should contain the following
	 *  - A string data field named symbol for the stock's symbol
	 *  - A string data field named name for the stock's name
	 *  - A double data field named previousClosingPrice that stores the stocks price for the previous day
	 *  - A double data field named currentPrice that stores the stock price for the current time
	 *  - A constructor that creates a stock with specified symbol and name
	 *  - Getters for each of the data fields
	 *  - Setter method for previousClosingPrice and currentPrice
	 *  - A method named getChangePercent() that returns the percentage changed from previousClosingPrice to CurrentPrice
	 *    precentChange = ((currentPrice - closingPrice) / currentPrice) * 100
	 */

	String symbol;
	String name;
	double previousClosingPrice = 0.0;
	double currentPrice = 0.0;

	Stock(String inputSymbol, String inputName){
		symbol = inputSymbol;
		name = inputName;
	}
	public String getSymbol(){
		return (symbol);
	}

	public String getName(){
		return (name);
	}

	public double getPreviousClosingPrice(){
		return(previousClosingPrice);
	}

	public double getCurrentPrice(){
		return(currentPrice);
	}

	public void setPreviousClosingPrice(double prevPrice){
		previousClosingPrice = prevPrice;
	}

	public void setCurrentPrice(double currPrice){
		currentPrice = currPrice;
	}

	public double setCurrentPrice(){
		return(currentPrice);
	}

	public double getChangePercent(){
		double percentChange = ((currentPrice - previousClosingPrice) / currentPrice) * 100;
		return (percentChange);
	}
}





