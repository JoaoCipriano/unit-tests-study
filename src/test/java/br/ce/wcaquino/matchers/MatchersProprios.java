package br.ce.wcaquino.matchers;

import java.util.Calendar;

public class MatchersProprios {
	
	public static DiaSemanaMatcher caiEm(Integer diaSemana) {
		return new DiaSemanaMatcher(diaSemana);
	}
	
	public static DiaSemanaMatcher caiNumaSegunda() {
		return new DiaSemanaMatcher(Calendar.MONDAY);
	}
	
	public static DataDiferencaDiasMatcher eHojeComDiferencaDias(Integer diferencaDias) {
		return new DataDiferencaDiasMatcher(diferencaDias);
	}
	
	public static DataDiferencaDiasMatcher eHoje() {
		return new DataDiferencaDiasMatcher(0);
	}
}
