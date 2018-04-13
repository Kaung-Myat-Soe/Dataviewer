package charts.dataviewer.api.trace;

import charts.dataviewer.utils.TraceType;
import charts.dataviewer.utils.TraceVisibility;

public class BarTrace<T> extends GenericTrace<T> {

	public BarTrace() {
		setTraceName("BAR Trace");
		setTraceType(TraceType.BAR);
		setTraceVisibility(TraceVisibility.TRUE);
	}

	public BarTrace(String traceName) {
		setTraceName(traceName);
		setTraceType(TraceType.BAR);
		setTraceVisibility(TraceVisibility.TRUE);
	}

	@Override
	public void setConfiguration(TraceConfiguration config) {
		this.traceConfig = config;
		this.traceConfig.setTraceType(TraceType.BAR);
	}

}
