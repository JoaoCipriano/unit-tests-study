package br.ce.wcaquino.matchers;

import static br.ce.wcaquino.utils.DataUtils.isMesmaData;
import static br.ce.wcaquino.utils.DataUtils.obterDataComDiferencaDias;

import java.util.Date;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class DataDiferencaDiasMatcher extends TypeSafeMatcher<Date> {

	private Integer qtdDias;
	
	public DataDiferencaDiasMatcher(Integer qtdDias) {
		this.qtdDias = qtdDias;
	} 
	
	@Override
	public void describeTo(Description description) {
		description.appendText(qtdDias + " dias de diferença");
	}

	@Override
	protected boolean matchesSafely(Date data) {
		return isMesmaData(data, obterDataComDiferencaDias(qtdDias));
	}
}
