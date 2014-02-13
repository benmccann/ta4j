package eu.verdelhan.ta4j.indicators.simple;

import eu.verdelhan.ta4j.Indicator;
import eu.verdelhan.ta4j.TimeSeries;
import java.math.BigDecimal;

public class OpenPrice implements Indicator<BigDecimal> {

	private TimeSeries data;

	public OpenPrice(TimeSeries data) {
		this.data = data;
	}

	@Override
	public BigDecimal getValue(int index) {
		return data.getTick(index).getOpenPrice();
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}