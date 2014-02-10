package at.ecrit.e4.tools.extension.core.listener;

import java.util.Map.Entry;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.e4.ui.model.application.impl.ApplicationElementImpl;
import org.eclipse.e4.ui.model.application.impl.ApplicationFactoryImpl;
import org.eclipse.e4.ui.model.application.impl.ApplicationPackageImpl;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * This listener listens to changes in an {@link IObservableValue}, and
 * propagates them into the configured
 * {@link ApplicationElementImpl#getPersistedState()} map. The key to persist to
 * is the {@link PersistedStateValueChangeListener#key} parameter. If the key
 * does not yet exist an {@link AddCommand} is called on the map, else a
 * {@link SetCommand} is called on the respective {@link Entry}.
 *
 */
public class PersistedStateValueChangeListener implements IValueChangeListener {

	private String key;
	private IObservableValue value;
	private EditingDomain editingDomain;

	public PersistedStateValueChangeListener(String key,
			IObservableValue value, EditingDomain editingDomain) {
		this.key = key;
		this.value = value;
		this.editingDomain = editingDomain;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void handleValueChange(ValueChangeEvent event) {
		EObject applicationElementObject = (EObject) value.getValue();
		if (applicationElementObject == null)
			return;
		EMap<String, String> persistentState = (EMap<String, String>) applicationElementObject
				.eGet(ApplicationPackageImpl.Literals.APPLICATION_ELEMENT__PERSISTED_STATE);
		int indexOfKey = persistentState.indexOfKey(key);

		Command command = null;

		String value = (String) event.getObservableValue().getValue();
		if (value != null && value.length() > 0) {
			// add or set the respective entry
			if (indexOfKey == -1) {
				BasicEMap.Entry<String, String> entry = (org.eclipse.emf.common.util.BasicEMap.Entry<String, String>) ApplicationFactoryImpl.eINSTANCE
						.createStringToStringMap();
				entry.setKey(key);
				entry.setHash(key.hashCode());
				entry.setValue(value);
				command = AddCommand
						.create(editingDomain,
								applicationElementObject,
								ApplicationPackageImpl.Literals.APPLICATION_ELEMENT__PERSISTED_STATE,
								entry);
			} else {
				Entry<String, String> entry = persistentState.get(indexOfKey);
				entry.setValue(value);
				command = SetCommand
						.create(editingDomain,
								entry,
								ApplicationPackageImpl.Literals.STRING_TO_STRING_MAP__VALUE,
								value);
			}
		} else {
			// remove it, as we don't seem to need it anymore
			if (indexOfKey != -1) {
				Entry<String, String> entry = persistentState.get(indexOfKey);
				command = RemoveCommand
						.create(editingDomain,
								applicationElementObject,
								ApplicationPackageImpl.Literals.APPLICATION_ELEMENT__PERSISTED_STATE,
								entry);
			}
		}

		if (command != null && command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		}
	}

}
