package charts.dataviewer.api.trace;

import charts.dataviewer.utils.TraceType;
import charts.dataviewer.utils.TraceVisibility;

public class TimeSeriesTrace<T> extends GenericTrace<T> {

	public TimeSeriesTrace() {
		setTraceName("Time Series Trace");
		setTraceType(TraceType.SCATTER);
		setTraceVisibility(TraceVisibility.TRUE);
	}

	public TimeSeriesTrace(String traceName) {
		setTraceName(traceName);
		setTraceType(TraceType.SCATTER);
		setTraceVisibility(TraceVisibility.TRUE);
	}

	@Override
	public void setConfiguration(TraceConfiguration config) {
		this.traceConfig = config;
		this.traceConfig.setTraceType(TraceType.SCATTER);
	}
}
