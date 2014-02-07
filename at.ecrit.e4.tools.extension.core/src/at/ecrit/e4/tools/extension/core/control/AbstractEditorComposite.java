package at.ecrit.e4.tools.extension.core.control;

import java.util.Map;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractEditorComposite extends Composite {

	IWidgetValueProperty textProp = WidgetProperties.text(SWT.Modify);

	public AbstractEditorComposite(Composite parent, int style) {
		super(parent, style);
	}
	
	class MasterValueChangeListener implements IValueChangeListener {

		private IObservableValue iov;
		private String key;

		public MasterValueChangeListener(IObservableValue iov, String key) {
			this.iov = iov;
			this.key = key;
		}

		@Override
		public void handleValueChange(ValueChangeEvent event) {
			MApplicationElement mae = (MApplicationElement) event
					.getObservableValue().getValue();
			Map<String, String> persistedState = mae.getPersistedState();
			iov.setValue(persistedState.get(key));
		}
	}
}
