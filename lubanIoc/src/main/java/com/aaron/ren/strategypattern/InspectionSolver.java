package com.aaron.ren.strategypattern;

public abstract class InspectionSolver {

	public abstract void solve(Long orderId, Long userId);

	public abstract String[] supports();
}